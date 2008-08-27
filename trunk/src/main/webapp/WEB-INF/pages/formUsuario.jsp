<%@ include file="include.jsp"%>

<body>

<div id="contenedor">
<form:form commandName="usuario" method="post" action="formUsuario.html">
	<form:errors path="*" cssClass="error" element="div"/>
	<c:if test="${not empty usuario.id}">
		<form:hidden path="id" />
	</c:if>
	<table width="100%" cellpadding="0" cellspacing="0" border="0">
		<tr>
			<td>

			<table width="100%" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="50%">
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
										background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif" class="tituloCabecera">USUARIO</td>
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
										cssClass="campo_formulario" /></td>
									<td width="12%" class="etiqueta">Contraseña</td>
									<td width="12%"><form:password showPassword="true" path="contrasena" size="20"
										cssClass="campo_formulario" /></td>
									<td width="12%" align="right" class="etiqueta">Administrador</td>
									<td width="12%"><form:checkbox path="administrador" /></td>
								</tr>
								<tr>
									<td width="14%" align="right" class="etiqueta">Apellido 1</td>
									<td width="12%"><form:input path="apellido1" size="20"
										maxlength="32" cssClass="campo_formulario" /></td>
									<td width="12%" class="etiqueta">Apellido 2</td>
									<td width="12%"><form:input path="apellido2" size="20"
										maxlength="32" cssClass="campo_formulario" /></td>
									<td width="12%" align="right" class="etiqueta">Nombre</td>
									<td width="12%"><form:input path="nombre" size="20"
										maxlength="32" cssClass="campo_formulario" /></td>
								</tr>
								<tr>
									<td width="14%"align="right" class="etiqueta">Correo electrónico</td>
									<td width="12%"><form:input path="mail" size="20"
										maxlength="64" cssClass="campo_formulario" /></td>
									<td width="12%" class="etiqueta">Centro de procedencia</td>
									<td width="12%"><form:select
										path="centro" cssClass="desplegable">
										<form:option value="CHUS" />
										<form:option value="BCN" />
										<form:option value="MAD" />
									</form:select></td>
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
												name="opcion" value="Guardar" class="boton"></td>
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
</form:form>

<v:javascript formName="usuario" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<c:url value="/scripts/validator.jsp"/>" /></script>


</div>
</body>