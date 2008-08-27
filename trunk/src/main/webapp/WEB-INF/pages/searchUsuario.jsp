<%@ include file="include.jsp"%>

<body>
<div id="contenedor">

<form:form commandName="searchUsuario" method="post"
	action="searchUsuario.html">
	<form:errors path="*" cssClass="error" element="div"/>
	<table width="100%" cellpadding="0" cellspacing="0" border="0"
		align="center">
		<tr>
			<td align="center">

			<table width="100%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="100%">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="24" valign="top"><img src="<%=request.getContextPath()%>/images/spacer.gif"
								width="1" height="1"><img src="<%=request.getContextPath()%>/images/spacer.gif"
								width="1" height="1">
							<table width="100%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="24" rowspan="2" align="left" valign="top"><img
										src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif" width="24" height="24"></td>
									<td height="24" rowspan="2"
										background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif" class="tituloCabecera">&nbsp;BUSCAR
									USUARIO</td>
									<td width="32" rowspan="2" valign="top"><img
										src="<%=request.getContextPath()%>/images/fdo_tit_drch.gif" width="32" height="24"></td>
									<td bgcolor="#8A9DBB"><img src="<%=request.getContextPath()%>/images/spacer.gif"
										width="1" height="1"></td>
									<td width="7" rowspan="2" align="right" valign="top"><img
										src="<%=request.getContextPath()%>/images/t3-esq-1.gif" width="7" height="24"></td>
								</tr>
								<tr>
									<td width="40%">&nbsp;</td>
								</tr>
							</table>
							<div align="right"></div>
							</td>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="1" bgcolor="#466492"><img src="<%=request.getContextPath()%>/images/spacer.gif"
								width="1" height="1"></td>
							<td height="100%">

							<table width="100%" border="0" align="center" cellpadding="2"
								cellspacing="0">
								<tr>
									<td width="14%" align="right" class="etiqueta">Login</td>
									<td width="12%"><form:input path="login" size="20"
										maxlength="32" cssClass="campo_formulario" /></td>
								</tr>
								<tr>
									<td width="14%" align="right" class="etiqueta">Primer
									Apellido</td>
									<td width="12%"><form:input path="apellido1" size="20"
										maxlength="32" cssClass="campo_formulario" /></td>
									<td width="12%" class="etiqueta">Segundo Apellido</td>
									<td width="12%"><form:input path="apellido2" size="20"
										maxlength="32" cssClass="campo_formulario" /></td>
									<td width="12%" align="right" class="etiqueta">Nombre</td>
									<td width="12%"><form:input path="nombre" size="20"
										maxlength="32" cssClass="campo_formulario" /></td>
								</tr>
							</table>

							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<!-- Tabla para asegurar espacio entre ultimo bloque y fin de tabla central -->
									<td><img src="<%=request.getContextPath()%>/images/spacer.gif" alt="" width="8"
										height="8"></td>
									<!-- fin de tabla. &iexcl;No eliminiar! -->
								</tr>
							</table>
							</td>
							<td width="1" bgcolor="#466492"><img src="<%=request.getContextPath()%>/images/spacer.gif"
								width="1" height="1"></td>
						</tr>
					</table>
					<table width="100%" border="0" align="center" cellpadding="0"
						cellspacing="0">
						<tr>
							<td width="16" rowspan="2" valign="bottom"><img
								name="t3esq3" src="<%=request.getContextPath()%>/images/t3-esq-3_02.gif" width="16"
								height="26" border="0" alt=""></td>
							<td width="80%" height="25"><img src="<%=request.getContextPath()%>/images/spacer.gif"
								width="1" height="1"></td>
							<td height="25" rowspan="2" align="right">
							<table width="100%" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="26" rowspan="2" valign="top"><img
										src="<%=request.getContextPath()%>/images/fdo_tabla_ico_izq.gif" width="40" height="26"></td>
									<td height="1" colspan="2" valign="middle" bgcolor="#466492"><img
										src="<%=request.getContextPath()%>/images/spacer.gif" width="1" height="1"></td>
								</tr>
								<tr>
									<td>
									<table cellpadding="0" cellspacing="0" border="0"
										align="center">
										<tr>
											<td rowspan="3" width="2" height="13"><img
												src="<%=request.getContextPath()%>/images/izda.gif" width="12" height="20" border="0"
												alt=""></td>
											<td height="1" width="85"><img
												src="<%=request.getContextPath()%>/images/spacerAzul.gif" width="85" height="2" border="0"
												alt=""></td>
											<td rowspan="3" align="right" width="2" height="13"><img
												src="<%=request.getContextPath()%>/images/decha.gif" width="12" height="20" border="0"
												alt=""></td>
										</tr>
										<tr align="center">
											<td height="13" bgcolor="white"><input type="submit"
												name="opcion" value="Buscar" class="boton"
												alt="Buscar Usuarios" id="guardar-nuevo-caso"></td>
										</tr>
										<tr>
											<td width="85" valign="bottom"><img
												src="<%=request.getContextPath()%>/images/spacerAzul.gif" width="85" height="2" border="0"
												alt=""></td>
										</tr>
									</table>
									</td>
								</tr>
							</table>
							</td>
						</tr>
						<tr>
							<td height="1" bgcolor="#466492"><img
								src="<%=request.getContextPath()%>/images/spacer.gif" width="1" height="1"></td>
						</tr>
					</table>
					</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
	<p></p>
</form:form> <c:if test="${not empty usuarios}">
	<table cellSpacing="0" cellPadding="0" width="100%" valign="top"
		align="center" border="0">
		<tr>
			<td align="left" width="1" rowSpan="2"><IMG height="24"
				src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif"></td>
			<td class="tituloCabecera" background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif"
				height="24" rowSpan="2">&nbsp;USUARIOS</td>
			<td width="22" rowSpan="2"><IMG height="24"
				src="<%=request.getContextPath()%>/images/fdo_tit_drch.gif"></td>
			<td width="1" bgcolor="#466492"><IMG height="1"
				src="<%=request.getContextPath()%>/images/spacer.gif"></td>
			<td align="right" width="7" rowSpan="2"><IMG height="24"
				src="<%=request.getContextPath()%>/images/t3-esq-1.gif" width="7"></td>
		</tr>
		<tr>
			<td width="80%">&nbsp;</td>
		</tr>
	</table>
	<div id="laterales">
	<table width="100%" border="0" cellpadding="0" cellSpacing="0"
		align="center">
		<tr class="titulo_lista">
			<td bgcolor="#FFFFFF"></td>
			<td width="27%" height="15" align="center" class="titulo_lista02">Nombre</td>
			<td width="20%" align="center" class="titulo_lista02">Login</td>
			<td width="32%" align="center" class="titulo_lista02">e-Mail</td>
			<td align="center" class="titulo_lista02">Acciones</td>
		</tr>
		<c:forEach items="${usuarios}" var="usuario">
			<tr class="tituloTabla2">
				<td bgcolor="#FFFFFF"></td>
				<td height="15" align="center"><c:out value="${usuario.nombre}" />&nbsp;<c:out
					value="${usuario.apellido1}" />&nbsp;<c:out
					value="${usuario.apellido2}" /></td>
				<td align="center"><c:out value="${usuario.login}" /></td>
				<td align="center"><c:out value="${usuario.mail}" /></td>
				<td align="center"><a
					href="<c:url value="formUsuario.html?id=${usuario.id}" />">Editar
				usuario</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<table width="100%" border="0" cellspacing="0" cellpadding="0"
		align="center">
		<tr>
			<td width="16"><img src="<%=request.getContextPath()%>/images/t3-esq-3_02.gif" width="16"
				height="26"></td>
			<td style="border-bottom: 1px solid #426594">&nbsp;</td>
			<td width="16" align="right"><img src="<%=request.getContextPath()%>/images/t3-esq-3_03.gif"
				width="16" height="26"></td>
		</tr>
	</table>
</c:if>

</div>
</body>