<%@ include file="include.jsp"%>

<body>

<div id="contenedor">

<form:form commandName="paciente" method="post" action="formPaciente.html">
	<form:errors path="*" cssClass="error" element="div"/>
	<c:if test="${not empty paciente.id}">
		<form:hidden path="id" />
	</c:if>

	<table cellSpacing="0" cellPadding="0" width="100%" valign="top"
		align="center" border="0">
		<tr>
			<td align="left" width="1" rowSpan="2"><IMG height="24"
				src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif"></td>
			<td class="tituloCabecera" background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif"
				height="24" rowSpan="2">&nbsp;PACIENTE</td>
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

	<table width="100%" border="0" class="laterales">
		<tr>
			<td width="15%">Nombre</td>
			<td width="14%"><span class="style2"><form:input
				path="nombre" size="15" maxlength="20" cssClass="campo_formulario" /></span></td>
			<td width="17%">Primer Apellido</td>
			<td width="16%"><span class="style2"><form:input
				path="apellido1" size="15" maxlength="20"
				cssClass="campo_formulario" /></span></td>
			<td width="20%">Segundo Apellido</td>
			<td width="18%"><span class="style2"><form:input
				path="apellido2" size="15" maxlength="20"
				cssClass="campo_formulario" /></span></td>
		</tr>
		<tr>
			<td>Neuroradi&oacute;logo</td>
			<td><form:input path="neurorradiologo" size="15" maxlength="20"
				cssClass="campo_formulario" /></td>
			<td>Centro</td>
			<td><span class="style2"> <form:select path="centro"
				cssClass="desplegable">
				<form:option value="CHUS" />
			</form:select> </span></td>
			<td>NHC:</td>
			<td><span class="style2"> <form:input path="nhc"
				size="10" maxlength="9" cssClass="campo_formulario" /> </span></td>
		</tr>
		<tr>
			<td></td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="1" cellspacing="1"
		class="laterales">
		<tr bgcolor="#79A1D3">
			<td height="25" colspan="40" class="tituloCabecera">Caracter&iacute;sticas
			demogr&aacute;ficas:</td>
		</tr>
		<tr>
			<td width="33">&nbsp;</td>
			<td width="37"><span class="style2">Edad:</span></td>
			<td colspan="4"><span class="style2"> <form:input
				path="edad" size="5" maxlength="3" cssClass="campo_formulario" /> </span></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td colspan="3"><span class="style2">
			<h4>Historia m&eacute;dica:</h4>
			</span></td>
			<td bgcolor="#FFFFFF" class="Estilo3"><span class="Estilo5">SI</span></td>
			<td bgcolor="#FFFFFF" class="Estilo3"><span class="Estilo5">NO</span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2">&nbsp;</td>
			<td width="307"><span class="style2">Hipertensi&oacute;n:</span></td>
			<td width="151"><form:radiobutton path="hipertension"
				value="true" /></td>
			<td width="433"><form:radiobutton path="hipertension"
				value="false" /></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2">&nbsp;</td>
			<td width="307"><span class="style2">Enfermedad endocrina
			metab&oacute;lica:</span></td>
			<td><form:radiobutton path="endocrinaMet" value="true" /></td>
			<td><form:radiobutton path="endocrinaMet" value="false" /></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2">&nbsp;</td>
			<td width="307"><span class="style2">Enfermedad
			cardiovascular:</span></td>
			<td><form:radiobutton path="cardiovascular" value="true" /></td>
			<td><form:radiobutton path="cardiovascular" value="false" /></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2">&nbsp;</td>
			<td width="307"><span class="style2">Enfermedad renal:</span></td>
			<td><form:radiobutton path="renal" value="true" /></td>
			<td><form:radiobutton path="renal" value="false" /></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2">&nbsp;</td>
			<td width="307"><span class="style2">Diabetes:</span></td>
			<td><form:radiobutton path="diabetes" value="true" /></td>
			<td><form:radiobutton path="diabetes" value="false" /></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2">&nbsp;</td>
			<td width="307"><span class="style2">Hipersensibilidad al
			contraste: </span></td>
			<td><form:radiobutton path="hipersenContraste" value="true" /></td>
			<td><form:radiobutton path="hipersenContraste" value="false" /></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2">&nbsp;</td>
			<td width="307"><span class="style2">Contraindicaci&oacute;n
			de antiagregaci&oacute;n: </span></td>
			<td><form:radiobutton path="contraindAntiagreg" value="true" /></td>
			<td><form:radiobutton path="contraindAntiagreg" value="false" /></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2">&nbsp;</td>
			<td><span class="style2">Otros:</span></td>
			<td colspan="2"><form:input path="pacienteOtros" size="30"
				maxlength="50" cssClass="campo_formulario" /></td>
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td colspan="18">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="16"><img src="<%=request.getContextPath()%>/images/t3-esq-3_02.gif" width="16"
						height="26"></td>
					<td width="75%" style="border-bottom: 1px solid #426594">&nbsp;</td>
					<td width="40"><img src="<%=request.getContextPath()%>/images/fdo_tabla_ico_izq.gif"
						width="40" height="26"></td>
					<td style="border-top: 1px solid #426594">
					<table cellpadding="0" cellspacing="0" border="0" align="center">
						<tr>
							<td rowspan="3" width="2" height="13"><img
								src="<%=request.getContextPath()%>/images/izda.gif" width="12" height="20" border="0" alt=""></td>
							<td height="1" width="85"><img src="<%=request.getContextPath()%>/images/spacerAzul.gif"
								width="85" height="2" border="0" alt=""></td>
							<td rowspan="3" align="right" width="2" height="13"><img
								src="<%=request.getContextPath()%>/images/decha.gif" width="12" height="20" border="0" alt=""></td>
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
					<c:if test="${not empty paciente.id}">
						<td style="border-top: 1px solid #426594">
						<table cellpadding="0" cellspacing="0" border="0" align="center">
							<tr>
								<td rowspan="3" width="2" height="13"><img
									src="<%=request.getContextPath()%>/images/izda.gif" width="12" height="20" border="0" alt=""></td>
								<td height="1" width="170"><img src="<%=request.getContextPath()%>/images/spacerAzul.gif"
									width="170" height="2" border="0" alt=""></td>
								<td rowspan="3" align="right" width="2" height="13"><img
									src="<%=request.getContextPath()%>/images/decha.gif" width="12" height="20" border="0" alt=""></td>
							</tr>
							<tr align="center">
								<td height="11" bgcolor="white" class="botonAnadir"
									align="center"><a
									href="<c:url value="formAneurisma.html?pacienteId=${paciente.id}"/>">A&ntilde;adir
								aneurisma</a></td>
							</tr>
							<tr>
								<td width="170" valign="bottom"><img
									src="<%=request.getContextPath()%>/images/spacerAzul.gif" width="170" height="2" border="0"
									alt=""></td>
							</tr>
						</table>
						</td>
					</c:if>
				</tr>
			</table>
			</td>
		</tr>
	</table>
	<p></p>
	<c:if test="${not empty paciente.aneurismas}">
		<table cellSpacing="0" cellPadding="0" width="100%" valign="top"
			align="center" border="0">
			<tr>
				<td align="left" width="1" rowSpan="2"><IMG height="24"
					src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif"></td>
				<td class="tituloCabecera" background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif"
					height="24" rowSpan="2">&nbsp;ANEURISMAS</td>
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
			align="center" class="laterales">
			<tr class="titulo_lista">
				<td bgcolor="#FFFFFF"></td>
				<td width="27%" height="15" align="center" class="titulo_lista02">Fecha
				del diagn&oacute;stico</td>
				<td width="20%" align="center" class="titulo_lista02">Longitud
				del cuello</td>
				<td width="32%" align="center" class="titulo_lista02">Localizaci&oacute;n</td>
				<td align="center" colspan="3" class="titulo_lista02">Acciones</td>
			</tr>
			<c:forEach items="${paciente.aneurismas}" var="aneurisma">
				<tr class="tituloTabla2">
					<td bgcolor="#FFFFFF"></td>
					<td height="15" align="center">
						<fmt:formatDate value="${aneurisma.fechaAneurisma}" pattern="dd/MM/yyyy" />
					</td>
					<td align="center"><c:out value="${aneurisma.longitud}" />&nbsp;mm</td>
					<td align="center"><c:out value="${aneurisma.localizacion}" /></td>
					<td align="center" colspan="3"><a
						href="<c:url value="formAneurisma.html?id=${aneurisma.id}" />">Editar
					aneurisma</a></td>
				</tr>
			</c:forEach>
		</table>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="16"><img src="<%=request.getContextPath()%>/images/t3-esq-3_02.gif" width="16"
					height="26"></td>
				<td style="border-bottom: 1px solid #426594">&nbsp;</td>
				<td width="16" align="right"><img src="<%=request.getContextPath()%>/images/t3-esq-3_03.gif"
					width="16" height="26"></td>
			</tr>
		</table>
	</c:if>
	<v:javascript formName="paciente" cdata="false"
		dynamicJavascript="true" staticJavascript="false" />
	<script type="text/javascript"
		src="<c:url value="/scripts/validator.jsp"/>" /></script>
</form:form>

</div>
</body>