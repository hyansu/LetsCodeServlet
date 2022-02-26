package br.com.letscode.model;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private static List<ClienteModel> clientes = new ArrayList();

    public List<ClienteModel> getClientes() {
        return clientes;
    }

    public static void setClientes(List<ClienteModel> clientes) {
        ListaClientes.clientes = clientes;
    }

    public void adicionar(ClienteModel cliente){
        ListaClientes.clientes.add(cliente);
    }

    public List<ClienteModel> buscarClientes(){
        return clientes;
    }
}
