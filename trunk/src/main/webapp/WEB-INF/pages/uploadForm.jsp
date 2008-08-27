<%@ include file="include.jsp"%>
<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="upload.title" /></title>
<meta name="heading" content="<fmt:message key='upload.heading'/>" />
<meta name="menu" content="AdminMenu" />
</head>


<table cellSpacing="0" cellPadding="0" width="100%" valign="top"
	align="center" border="0">
	<tr>
		<td align="left" width="1" rowSpan="2"><IMG height="24"
			src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif"></td>
		<td class="tituloCabecera" background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif"
			height="24" rowSpan="2">&nbsp;IMÁGENES</td>
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
<table width="100%" border="0" cellpadding="0" cellSpacing="0"
	align="center">
	<c:forEach items="${imagenes}" var="imagen">
		<tr class="tituloTabla2">
			<td width="1" bgcolor="#466492"></td>
			<td widht="100%" bgcolor="#FFFFFF">
				<table cellpadding="10" width="100%">
					<tr class="tituloTabla2">
						<td width="40%" align="center" valign="middle"><img src="/viewAneurismaImagen.html?id=${imagen.id}" border="1"
							style="border-color: #466492;" /></td>
						<td valign="top">${imagen.descripcion}</td>
					</tr>
				</table>
			</td>
			<td width="1" bgcolor="#466492"></td>
		</tr>
	</c:forEach>
</table>
<table width="100%" border="0" cellspacing="0" align="center"
	cellpadding="0">
	<tr>
		<td width="16"><img src="<%=request.getContextPath()%>/images/t3-esq-3_02.gif" width="16"
			height="26"></td>
		<td style="border-bottom: 1px solid #426594">&nbsp;</td>
		<td width="16" align="right"><img src="<%=request.getContextPath()%>/images/t3-esq-3_03.gif"
			width="16" height="26"></td>
	</tr>
</table>


<br />

<form:form commandName="fileUpload" method="post"
	action="fileUpload.html" enctype="multipart/form-data"
	onsubmit="return validateFileUpload(this)" id="uploadForm">

	<input type="hidden" name="aneurismaId" value="${aneurismaId}" />

	<table width="100%" cellpadding="0" cellspacing="0" border="0"
		align="center">
		<tr>
			<td align="center">

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
										background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif" class="tituloCabecera">&nbsp;SUBIR
									NUEVA IMAGEN</td>
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
									<td width="14%" align="right" class="etiqueta">Descripcion</td>
									<td><form:textarea path="descripcion" rows="5" cols="60"
										cssClass="campo_formulario" /></td>
								</tr>
							</table>

							<table width="100%" border="0" align="center" cellpadding="2"
								cellspacing="0">
								<tr>
									<td width="14%" align="right" class="etiqueta">Imagen</td>
									<td><input type="file" name="file" id="file"
										class="file medium" /></td>
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
												name="opcion" value="enviar" class="boton"
												alt="Enviar" id="guardar-nuevo-caso"></td>
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

<v:javascript formName="fileUpload" staticJavascript="false" />
<script type="text/javascript"
	src="<c:url value="/scripts/validator.jsp"/>"></script>
