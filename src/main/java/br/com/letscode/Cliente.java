package br.com.letscode;

import br.com.letscode.model.ClienteModel;
import br.com.letscode.model.Conta;
import br.com.letscode.model.ListaClientes;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Cliente", value = "/cliente")
public class Cliente extends HttpServlet {

    ListaClientes listaClientes = new ListaClientes();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        int conta =  Integer.parseInt(req.getParameter("conta"));
        int agencia =  Integer.parseInt(req.getParameter("agencia"));

        Conta contaCliente = new Conta(conta, agencia);
        List<Conta> listConta= new ArrayList<>();
        listConta.add(contaCliente);

        ClienteModel clienteModel = new ClienteModel(nome, email, senha, listConta);

        listaClientes.adicionar(clienteModel);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("clienteCadastrado.jsp");
        req.setAttribute("nome", clienteModel.getNome());
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<ClienteModel> clientes = listaClientes.buscarClientes();

        req.setAttribute("clientes", clientes);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("listaClientes.jsp");
        requestDispatcher.forward(req,resp);

    }

}
