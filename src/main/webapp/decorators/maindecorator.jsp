<%@ include file="include.jsp"%>

<%@page import="com.stentstudio.security.SecurityContext"%>
<%@page import="com.stentstudio.model.Usuario"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/style.css" />
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/top.css" />
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/centro.css" />
<title>
	<decorator:title default="Registro de Stents" />
</title>

<style type="text/css">
   #tree{
      border-right:none;
      border-top: none;
      border-bottom: none;
      border-left:none;
      width: 170;
   }
   
</style>

</head>

<body bgcolor="#FFFFFF" text="#000000">

	<table width="100%">
		<tr>
			<td width="25%">
				<img src="<%= request.getContextPath() %>/images/cabecera/logoUSC.gif">
			</td>
			<td width="50%" align="center">
				<img src="<%= request.getContextPath() %>/images/cabecera/registroStentsLogo.jpg">
			</td>
			<td width="25%">
				<img src="<%= request.getContextPath() %>/images/cabecera/stent_pequeno.gif">
			</td>
		</tr>
	</table>
	<p/>
	<table width="100%">
		<tr>
			<td width="20%" valign="top">
			<%
				Usuario usuario = SecurityContext.getUsuario();
				Boolean admin = usuario.getAdministrador().booleanValue();
				if(admin!=null && admin.booleanValue()) {
				%>
						<iframe scrolling="no" frameborder="0" id="tree" src="<%= request.getContextPath() %>/decorators/arbolCompatible/tree_admin.xml" ></iframe>
				<%
				}else{
				%>
						<iframe scrolling="no" frameborder="0" id="tree" src="<%= request.getContextPath() %>/decorators/arbolCompatible/tree.xml" ></iframe>
				<%
				}
				%>
			
			
			</td> 
			<td width="80%" valign="top">
				<decorator:body />
			</td>
		</tr>
	</table>
</body>
</html>



