<%@ page import="br.com.letscode.model.ClienteModel" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.IOException" %>
<%@ page import="br.com.letscode.model.Conta" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Clientes</title>
</head>
<body>
    <div><a href="/santander">Voltar</a></div>

        <%
            List<ClienteModel> clientes = (List) request.getAttribute("clientes");
            for ( ClienteModel cliente : clientes) {

        %>
        <ul style="list-style: none">
            <li><%= "Nome: " + cliente.getNome() %></li>
            <li><%= "E-mail: " + cliente.getEmail() %></li>

        <%
            for(Conta conta : cliente.getContas()){
                out.println("<li>Conta: "+conta.getNumeroConta()+"</li>");
                out.println("<li>Agência: "+conta.getAgencia()+"</li>");
            }
        %>
        </ul>
        <%
            }
        %>

</body>
</html>
