<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Comercial - Estoque</title>
</head>
<body>
<div align="center">
	<form action="EstoqueController" style="width:300px" >
	<h6>${mensagem}</h6>
	<input type="hidden" name="cmd" value="cadastrarCliente"></input>
			<table 
			style="color: #004080; font-weight: bold; font-size: 12px; font-family: Tahoma, Verdana, Arial, Sans-Serif; border-top-color: #00FFFF; border-bottom-color: #00FFFF; border-left-color: #00FFFF; border-right-color: #00FFFF; background-color: #80FFFF"
			border="1">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Valor</th>
				</tr>
				<tr>
					<td>Nome</td>
					<td><input id="nome" name="nome" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.nome}"></input></td>
				</tr>
				<tr>
					<td>Endereço</td>
					<td><input id="endereco" name="endereco" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.endereco}"></input></td>
				</tr>
				<tr>
					<td>E-mail</td>
					<td><input id="email" name="email" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.email}"></input></td>
				</tr>
				<tr>
					<td>Bairro</td>
					<td><input id="bairro" name="bairro" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.bairro}"></input></td>
				</tr>
				<tr>
					<td>Cidade</td>
					<td><input id="cidade" name="cidade" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.cidade}"></input></td>
				</tr>
				<tr>
					<td>CEP</td>
					<td><input id="cep" name="cep" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.cep}"></input></td>
				</tr>
				<tr>
					<td>Estado</td>
					<td><input id="estado" name="estado" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.estado}"></input></td>
				</tr>
				<tr>
					<td>Fone</td>
					<td><input id="fone" name="fone" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.fone}"></input></td>
				</tr>
				<tr>
					<td>Celular</td>
					<td><input id="celular" name="celular" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.celular}"></input></td>
				</tr>
				<tr>
					<td>CPF</td>
					<td><input id="cpf" name="cpf" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.cpf}"></input></td>
				</tr>
				<tr>
					<td>Observação:</td>
					<td><input id="obs" name="obs" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.obs}"></input></td>
				</tr>
				<tr>
					<td>RG</td>
					<td><input id="rg" name="rg" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.rg}"></input></td>
				</tr>
				<tr>
					<td>Orgão Emissor</td>
					<td><input id="orgaorg" name="orgaorg" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.orgaorg}"></input></td>
				</tr>
				<tr>
					<td>Data Nascimento</td>
					<td><input id="nascimento" name="nascimento" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.nascimento}"></input></td>
				</tr>
				<tr>
					<td>Desde</td>
					<td><input id="desde" name="desde" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.desde}"></input></td>
				</tr>
				<tr>
					<td>CNPJ</td>
					<td><input id="cnpj" name="cnpj" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.cnpj}"></input></td>
				</tr>
				<tr>
					<td>Inscrição Estadual</td>
					<td><input id="insest" name="insest" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.insest}"></input></td>
				</tr>
				<tr>
					<td>Sexo</td>
					<td><input id="sexo" name="sexo" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.sexo}"></input></td>
				</tr>
				<tr>
					<td>Profissão</td>
					<td><input id="profissao" name="profissao" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.profissao}"></input></td>
				</tr>
				<tr>
					<td>Empresa</td>
					<td><input id="empresa" name="empresa" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.empresa}"></input></td>
				</tr>
				<tr>
					<td>Fone Empresa</td>
					<td><input id="foneemp" name="foneemp" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.foneemp}"></input></td>
				</tr>
				<tr>
					<td>Renda</td>
					<td><input id="renda" name="renda" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.renda}"></input></td>
				</tr>
				<tr>
					<td>Referencia</td>
					<td><input id="referencia" name="referencia" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.referencia}"></input></td>
				</tr>
				<tr>
					<td>Fone Referencia</td>
					<td><input id="foneref" name="foneref" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.foneref}"></input></td>
				</tr>
				<tr>
					<td>Auditoria</td>
					<td><input id="auditoria" name="auditoria" style="width: 176px; height: 24px; background-color: #DDFFFF" value="${cliente.auditoria}"></input></td>
				</tr>
				
				<tr>
					<td colspan="2" align="Center"><input type="submit" value="Cadastrar" style="height: 23px"></td>
				</tr>
				
			</thead>
		</table>
	</form>
</div>
	
</body>
</html>