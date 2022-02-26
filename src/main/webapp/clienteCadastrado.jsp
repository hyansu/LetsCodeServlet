<%
    String nomeCliente = (String)request.getAttribute("nome");
%>

<html>
<head>
    <title>Cliente Cadastrado</title>
</head>
<body>
    <div><a href="/santander/cliente">Ver clientes</a></div>
    <h1>Cliente <%= nomeCliente %> cadastrado com sucesso!</h1>
</body>
</html>
