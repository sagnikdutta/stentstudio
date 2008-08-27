<%@ include file="include.jsp"%>

<body>

<div id="contenedor">

<script language="JavaScript" src="scripts/calendario3.js"></script>

<form:form name="formAneurisma"
	commandName="aneurisma" method="post" action="formAneurisma.html">
	<form:errors path="*" cssClass="error" element="div"/>
	<c:if test="${not empty aneurisma.id}">
		<form:hidden path="id" />
	</c:if>
	<form:hidden path="paciente.id" />

	<table cellSpacing="0" cellPadding="0" width="100%" valign="top"
		align="center" border="0">
		<tr>
			<td align="left" width="1" rowSpan="2"><IMG height="24"
				src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif"></td>
			<td class="tituloCabecera" background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif"
				height="24" rowSpan="2">&nbsp;ANEURISMA</td>
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

	<table border="0" width="100%" class="laterales" >
		<tr>
			<td width="33"></td>
			<td class="style4"><span>Fecha del diagnóstico</span></td>
			<td colspan="2"><form:input path="fechaAneurisma" size="15"
				maxlength="20" cssClass="campo_formulario" /> <img
				src="<%=request.getContextPath()%>/images/btnCalendar.gif" width="18" height="18"
				align="absbottom"
				onClick="show_Calendario('formAneurisma.fechaAneurisma');"></td>
			<td></td>
		</tr>
		<tr></tr>
		<tr>
			<td width="33"></td>
			<td class="style4" width="300"><span>Estado del
			aneurisma:</span></td>
			<td width="111" height="36" class="style4">Roto<form:radiobutton
				path="rotura" value="true" /></td>
			<td width="101" class="style4">No roto <form:radiobutton
				path="rotura" value="false" /></td>
			<td class="style4" colspan="2"><span class="style1">Si
			roto: Fecha de la hemorragia:&nbsp; <form:input path="fechaRotura"
				size="15" cssClass="campo_formulario" /> <img
				src="<%=request.getContextPath()%>/images/btnCalendar.gif" width="18" height="18"
				align="absbottom"
				onClick="show_Calendario('formAneurisma.fechaRotura');"> </span></td>
		</tr>
		<tr>
			<td width="33"></td>
			<td class="style4" width="300"><span>Vasos tortuosos:</span></td>
			<td class="style4">Si<form:radiobutton path="vasosTortuosos"
				value="true" /></td>
			<td class="style4">No<form:radiobutton path="vasosTortuosos"
				value="false" /></td>
			<td></td>

		</tr>
		<tr>
			<td width="33"></td>
			<td width="300"><span>Localizaci&oacute;n del aneurisma:</span></td>
			<td colspan="3" valign="top" class="style4"><span class="style2">
			<form:select path="localizacion" cssClass="desplegable">
				<form:option value="Car&oacute;tido-Oft&aacute;lmico" />
				<form:option value="Arteria comunicante posterior derecha" />
				<form:option value="Arteria comunicante posterior izquierda" />
				<form:option value="Arteria comunicante anterior" />
				<form:option value="Arteria cerebral media derecha" />
				<form:option value="Arteria cerebral media izquierda" />
				<form:option value="Carotido-Cavernoso" />
				<form:option value="Arteria basilar" />
				<form:option value="Top de la basilar" />
				<form:option value="Arteria vertebral derecha" />
				<form:option value="Arteria vertebral izquierda" />
				<form:option value="otras" />
			</form:select> </span></td>
		</tr>
		<tr>
			<td width="33"></td>
			<td height="15" class="style4"></td>
			<td colspan="3"><form:input path="otrasLocalizaciones" size="20"
				maxlength="28" cssClass="campo_formulario" /></td>
		</tr>
		<tr>
			<td width="33"></td>
			<td style=""><span>Forma del aneurisma:</span></td>
			<td valign="middle" class="style4">Saciforme<form:radiobutton
				path="forma" value="Saciforme" /></td>
			<td class="style4" colspan="2">Fusiforme<form:radiobutton
				path="forma" value="Fusiforme" /></td>
		</tr>
		<tr><td></td></tr>
	</table>
	<table  width="100%" class="laterales" border="0">
		<tr>
			<td bgcolor="#79A1D3" class="tituloCabecera"><span>Dimensiones
			del aneurisma:</span></td>
		</tr>
	</table>
	<table width="100%" class="laterales" border="0">
		<tr>
			<td width="33"></td>
			<td width="296" class="style4">Longitud del cuello:</td>
			<td width="303" class="style4"><form:input path="longitud"
				size="10" maxlength="8" cssClass="campo_formulario" />mm</td>
		</tr>
		<tr>
			<td width="33"></td>
			<td class="style4">Anchura m&aacute;xima del aneurisma:</td>
			<td class="style4"><form:input path="anchuraMax" size="10"
				maxlength="8" cssClass="campo_formulario" />mm</td>
		</tr>
		<tr>
			<td width="33"></td>
			<td class="style4">Altura m&aacute;xima del aneurisma:</td>
			<td class="style4"><form:input path="alturaMax" size="10"
				maxlength="8" cssClass="campo_formulario" />mm</td>
		</tr>
		<tr>
			<td width="33"></td>
			<td class="style4">Relaci&oacute;n cuello/anchura m&aacute;xima:</td>
			<td class="style4"><form:input path="relCuelloAnchura" size="10"
				maxlength="8" cssClass="campo_formulario" />mm</td>
		</tr>
		<tr><td></td></tr>
	</table>
	<table width="100%" class="laterales" border="0">
		<tr>
			<td width="287" bgcolor="#79A1D3" class="tituloCabecera"><span
				class="style3">Dimensiones de la arteria: </span></td>
		</tr>
	</table>
	<table width="100%" class="laterales" border="0">
		<tr>
			<td width="33"></td>
			<td width="296" class="style4">1/Segmento aferente:</td>
			<td width="303" class="style4"><form:input
				path="segmentoAferente1" size="10" maxlength="8"
				cssClass="campo_formulario" />mm</td>
		</tr>
		<tr>
			<td width="33"></td>
			<td class="style4">2/Segmento aferente:</td>
			<td class="style4"><form:input path="segmentoAferente2"
				size="10" maxlength="8" cssClass="campo_formulario" />mm</td>
		</tr>
		<tr><td></td></tr>
	</table>

	<c:if test="${not empty aneurisma.id}">
		<table width="100%" class="laterales" border="0">
			<tr>
				<td bgcolor="#79A1D3" class="tituloCabecera"><span>Imágenes:
				</span></td>
			</tr>
			<tr><!--  revisar redireccionamiento   -->
				<td><a href="#"
					onclick="window.open('<%=request.getContextPath()%>/fileUpload.html?aneurismaId=${aneurisma.id}','imagenes', 'height=700,width=900,resizable=yes,scrollbars=yes');">Gestión
				de imágenes</a></td>
			</tr>
			<tr><td></td></tr>
		</table>
	</c:if>

	<table width="100%" class="laterales" border="0" cellpadding="1" cellspacing="1">
		<!--DWLayoutTable-->
		<tr>
			<td height="25" colspan="13" bgcolor="#79A1D3" class="tituloCabecera"><span>Estado
			neurol&oacute;gico del paciente antes de la intervenci&oacute;n:</span></td>
		</tr>

		<tr>
			<td width="33" height="40"></td>
			<td width="296"><span class="style2"></span></td>
			<td width="157"><span class="style2"><span
				class="Estilo5">SI</span></span></td>
			<td width="198"><span class="style2"><span
				class="Estilo5">NO</span></span></td>
			<td width="65"><span class="style2"></span></td>
			<td width="34"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="43"><span class="style2"></span></td>
			<td width="127"><span class="style2"></span></td>
			<td><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"></td>
			<td style=""><span>Hemorragia subaracnoidea:</span></td>
			<td><span class="style2"><form:radiobutton
				path="hemSubaracnoidea" value="true" /></span></td>
			<td><span class="style2"><form:radiobutton
				path="hemSubaracnoidea" value="false" /></span></td>
			<td width="65"><span class="style2"></span></td>
			<td width="34"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="43"><span class="style2"></span></td>
			<td width="127"><span class="style2"></span></td>
			<td><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td style=""><span>Cefaleas:</span></td>
			<td><span class="style2"><form:radiobutton
				path="cefaleas" value="true" /></span></td>
			<td><span class="style2"><form:radiobutton
				path="cefaleas" value="false" /></span></td>
			<td width="65"><span class="style2"></span></td>
			<td width="34"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="43"><span class="style2"></span></td>
			<td width="127"><span class="style2"></span></td>
			<td><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td style=""><span>Par&aacute;lisis de nervios craneales:</span></td>
			<td><form:radiobutton path="paralisisNervios" value="true" /></td>
			<td><form:radiobutton path="paralisisNervios" value="false" /></td>
			<td colspan="3"><span class="style2"><form:select
				path="tipoNervios" cssClass="desplegable">
				<form:option value="ninguno" />
				<form:option value="III par" />
				<form:option value="IV par" />
				<form:option value="V par" />
				<form:option value="otros" />
			</form:select></span></td>
			<td style=""><span>otros:</span></td>
			<td colspan="2"><form:input path="otrosTipoNervios" size="10"
				maxlength="8" cssClass="campo_formulario" /></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td style=""><span>ACV:</span></td>
			<td><span class="style2"><form:radiobutton path="acv"
				value="true" /></span></td>
			<td><span class="style2"><form:radiobutton path="acv"
				value="false" /></span></td>
			<td width="65">&nbsp;</td>
			<td width="34"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="43"><span class="style2"></span></td>
			<td width="127"><span class="style2"></span></td>
			<td><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td style=""><span>Convulsiones:</span></td>
			<td><span class="style2"><form:radiobutton
				path="convulsiones" value="true" /></span></td>
			<td><span class="style2"><form:radiobutton
				path="convulsiones" value="false" /></span></td>
			<td width="65"><span class="style2"></span></td>
			<td width="34"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="43"><span class="style2"></span></td>
			<td width="127"><span class="style2"></span></td>
			<td><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td style=""><span>Hemorragia subdural:</span></td>
			<td><span class="style2"><form:radiobutton
				path="hemSubdural" value="true" /></span></td>
			<td><span class="style2"><form:radiobutton
				path="hemSubdural" value="false" /></span></td>
			<td width="65"><span class="style2"></span></td>
			<td width="34"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="43"><span class="style2"></span></td>
			<td width="127"><span class="style2"></span></td>
			<td><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td style=""><span>Hemorragia intracraneal: </span></td>
			<td><span class="style2"><form:radiobutton
				path="hemIntracraneal" value="true" /></span></td>
			<td><span class="style2"><form:radiobutton
				path="hemIntracraneal" value="false" /></span></td>
			<td width="65"><span class="style2"></span></td>
			<td width="34"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="43"><span class="style2"></span></td>
			<td width="127"><span class="style2"></span></td>
			<td><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2" valign="middle" style=""><span>Escala de
			GLASGOW:</span></td>
			<td><span class="style2"> <form:select path="glasgowPre"
				cssClass="desplegable">
				<form:option value="3" />
				<form:option value="4" />
				<form:option value="5" />
				<form:option value="6" />
				<form:option value="7" />
				<form:option value="8" />
				<form:option value="9" />
				<form:option value="10" />
				<form:option value="11" />
				<form:option value="12" />
				<form:option value="13" />
				<form:option value="14" />
			</form:select> </span></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td width="33" height="40" style=""><span></span></td>
			<td colspan="2" valign="middle"><span class="style2">Escala
			de RANKIN :</span></td>
			<td><span class="style2"> <form:select path="rankinPre"
				cssClass="desplegable">
				<form:option value="0" />
				<form:option value="1" />
				<form:option value="2" />
				<form:option value="3" />
				<form:option value="4" />
				<form:option value="5" />
			</form:select> </span></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td class="Estilo5">&nbsp;</td>
			<td class="Estilo5">&nbsp;</td>
			<td class="Estilo5">&nbsp;</td>
			<td class="Estilo5">&nbsp;</td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td colspan="2" style=""><span>Otros:</span></td>
			<td colspan="5"><span class="style2"> <form:input
				path="pacienteOtros" size="40" maxlength="40"
				cssClass="campo_formulario" /> </span></td>
			<td width="127"><span class="style2"></span></td>
			<td><span class="style2"></span></td>
		</tr>
		<tr><td></td></tr>
	</table>

	<table width="100%" class="laterales" border="0" cellpadding="1" cellspacing="1">
		<!--DWLayoutTable-->
		<tr>
			<td height="25" colspan="13" bgcolor="#79A1D3">
			<div align="left"><span class="tituloCabecera">Procedimientos
			neuroquir&uacute;rguicos previos:</span></div>
			</td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td width="296" style=""><span>Embolizaci&oacute;n
			intracraneal:</span></td>
			<td><span class="style2"><form:checkbox
				path="embolizacionIntracraneal" /></span></td>
			<td><!--DWLayoutEmptyCell-->&nbsp;</td>
			<td width="33"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="39"><span class="style2"></span></td>
			<td width="39"><span class="style2"></span></td>
			<td width="36"><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td width="296" style=""><span>Clipping intracraneal:</span></td>
			<td><span class="style2"><form:checkbox
				path="clippingIntracraneal" /></span></td>
			<td><!--DWLayoutEmptyCell-->&nbsp;</td>
			<td width="33"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="39"><span class="style2"></span></td>
			<td width="39"><span class="style2"></span></td>
			<td width="36"><span class="style2"></span></td>
		</tr>
		<tr>
			<td width="33" height="40"><span class="style2"></span></td>
			<td width="296" style=""><span>Evaluaci&oacute;n de
			coagulo intracraneal:</span></td>
			<td><span class="style2"><form:checkbox
				path="evaluacionCoagulo" /></span></td>
			<td><!--DWLayoutEmptyCell-->&nbsp;</td>
			<td width="33"><span class="style2"></span></td>
			<td width="37"><span class="style2"></span></td>
			<td width="39"><span class="style2"></span></td>
			<td width="39"><span class="style2"></span></td>
			<td width="36"><span class="style2"></span></td>
		</tr>
		<tr><td></td></tr>
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
					<c:if test="${not empty aneurisma.id}">
						<td style="border-top: 1px solid #426594">
						<table cellpadding="0" cellspacing="0" border="0" align="center">
							<tr>
								<td rowspan="3" width="2" height="13"><img
									src="<%=request.getContextPath()%>/images/izda.gif" width="12" height="20" border="0" alt=""></td>
								<td height="1" width="180"><img src="<%=request.getContextPath()%>/images/spacerAzul.gif"
									width="180" height="2" border="0" alt=""></td>
								<td rowspan="3" align="right" width="2" height="13"><img
									src="<%=request.getContextPath()%>/images/decha.gif" width="12" height="20" border="0" alt=""></td>
							</tr>
							<tr align="center">
								<td height="11" bgcolor="white" class="botonAnadir"
									align="center"><a
									href="<c:url value="formProcedimiento.html?aneurismaId=${aneurisma.id}"/>">A&ntilde;adir
								procedimiento</a></td>
							</tr>
							<tr>
								<td width="180" valign="bottom"><img
									src="<%=request.getContextPath()%>/images/spacerAzul.gif" width="180" height="2" border="0"
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

	<c:if test="${not empty aneurisma.procedimientos}">
		<table cellSpacing="0" cellPadding="0" width="100%" valign="top"
			align="center" border="0">
			<tr>
				<td align="left" width="1" rowSpan="2"><IMG height="24"
					src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif"></td>
				<td class="tituloCabecera" background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif"
					height="24" rowSpan="2">PROCEDIMIENTOS</td>
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
		<table width="100%" border="0" cellpadding="0" cellspacing="2">
			<tr class="titulo_lista">
				<td width="27%" height="15" align="center" class="titulo_lista02">Fecha
				del procedimiento</td>
				<td width="26%" " align="center" class="titulo_lista02">Liberación
				del Stent</td>
				<td width="26%" " align="center" class="titulo_lista02">Navegabilidad
				del cateter</td>
				<td align="center" colspan="3" class="titulo_lista02">Acciones</td>
			</tr>
			<c:forEach items="${aneurisma.procedimientos}" var="procedimiento">
				<tr class="tituloTabla2">
					<td height="15" align="center">
					<fmt:formatDate value="${procedimiento.fechaProcedimiento}" pattern="dd/MM/yyyy" /></td>
					<td align="center"><c:out
						value="${procedimiento.liberacionStent}" /></td>
					<td align="center"><c:out
						value="${procedimiento.navegabilidadCateter}" /></td>
					<td align="center" colspan="3"><a
						href="<c:url value="formProcedimiento.html?id=${procedimiento.id}" />">Editar
					procedimiento</a></td>
				</tr>
			</c:forEach>
		</table>
		</div>
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
</form:form></div>
</body>