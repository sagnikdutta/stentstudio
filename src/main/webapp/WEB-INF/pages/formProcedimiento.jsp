<%@ include file="include.jsp"%>

<body>

<script language="JavaScript" src="scripts/calendario3.js"></script>

<div id="contenedor">

<form:form commandName="procedimiento" name="formProcedimiento"
	method="post" action="formProcedimiento.html">
	<form:errors path="*" cssClass="error" element="div"/>
	<c:if test="${not empty procedimiento.id}">
		<form:hidden path="id" />
	</c:if>
	<form:hidden path="aneurisma.id" />
	
	<table cellSpacing="0" cellPadding="0" width="100%" valign="top"
		align="center" border="0">
		<tr>
			<td align="left" width="1" rowSpan="2"><IMG height="24"
				src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif"></td>
			<td class="tituloCabecera" background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif"
				height="24" rowSpan="2">&nbsp;PROCEDIMIENTO</td>
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

	<table width="100%" class="laterales" border="0">
		<tr>
			<td width="30%" style=""><span>Fecha de la intervención</span></td>
			<td><form:input path="fechaProcedimiento" size="15"
				cssClass="campo_formulario" /> <img src="<%=request.getContextPath()%>/images/btnCalendar.gif"
				width="18" height="18" align="absbottom"
				onClick="show_Calendario('formProcedimiento.fechaProcedimiento');"></td>
		</tr>
		<tr></tr>
	</table>
	<table width="100%" class="laterales" border="0">
		<tr>
			<td width="100%" bgcolor="#79A1D3"><span class="tituloCabecera">Tratamiento
			medicamentoso</span></td>
		</tr>
	</table>
	<table width="100%" class="laterales" class="laterales" border="0">
		<tr>
			<td width="351" bgcolor="#FFFFFF" style="" height="25"><span>&nbsp;Según
			protocolo:</span></td>
			<td width="57" class="Estilo5">Si</td>
			<td width="48" class="Estilo5">No</td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td width="351" bgcolor="#FFFFFF" style="" height="25"><span>&nbsp;Plavix
			pre-intervenci&oacute;n</span></td>
			<td width="57" class="Estilo5"><form:radiobutton
				path="plavixPre" value="true" /></td>
			<td width="48" class="Estilo5"><form:radiobutton
				path="plavixPre" value="false" /></td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td width="351" bgcolor="#FFFFFF" style="" height="25">&nbsp;Clopidogrel
			pre-intervenci&oacute;n</td>
			<td width="57" class="Estilo5"><form:radiobutton
				path="clopidogrelPre" value="true" /></td>
			<td width="48" class="Estilo5"><form:radiobutton
				path="clopidogrelPre" value="false" /></td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td width="351" bgcolor="#FFFFFF" style="" height="25">&nbsp;Heparina
			durante la intervenci&oacute;n</td>
			<td width="57" class="Estilo5"><form:radiobutton
				path="heparinaDurante" value="true" /></td>
			<td width="48" class="Estilo5"><form:radiobutton
				path="heparinaDurante" value="false" /></td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td width="351" bgcolor="#FFFFFF" style="" height="25">&nbsp;Aspirina
			durante la intervenci&oacute;n</td>
			<td width="57" class="Estilo5"><form:radiobutton
				path="aspirinaDurante" value="true" /></td>
			<td width="48" class="Estilo5"><form:radiobutton
				path="aspirinaDurante" value="false" /></td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td width="351" bgcolor="#FFFFFF" style="" height="25">&nbsp;Clopidogrel
			durante la intervenci&oacute;n</td>
			<td width="57" class="Estilo5"><form:radiobutton
				path="clopidogrelDurante" value="true" /></td>
			<td width="48" class="Estilo5"><form:radiobutton
				path="clopidogrelDurante" value="false" /></td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td width="351" bgcolor="#FFFFFF" style="" height="25">&nbsp;Anticoagulante
			durante la intervenci&oacute;n</td>
			<td width="57" class="Estilo5"><form:radiobutton
				path="anticoagulanteDurante" value="true" /></td>
			<td width="48" class="Estilo5"><form:radiobutton
				path="anticoagulanteDurante" value="false" /></td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td width="351" bgcolor="#FFFFFF" style="" height="25">&nbsp;Anticoagulante
			post-intervenci&oacute;n</td>
			<td width="57" class="Estilo5"><form:radiobutton
				path="anticoagulantePost" value="true" /></td>
			<td width="48" class="Estilo5"><form:radiobutton
				path="anticoagulantePost" value="false" /></td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
	</table>
	<table align="center" border="0" width="100%" class="laterales">
		<tr>
			<td colspan="6" bgcolor="#79A1D3"><span class="tituloCabecera">Material
			utilizado</span></td>
		</tr>
	</table>
	<table border="0" width="100%" class="laterales" cellpadding="5">
		<tr>
			<td width="27%" style=""><span>Referencia del Leo stent:</span></td>
			<td width="25%" class="Estilo2"><span class="Estilo2"> <form:select
				path="leoStentSelect" multiple="true" cssClass="desplegable"
				size="6">
				<form:options items="${leoStent}" itemValue="value"
					itemLabel="label" />
			</form:select> </span></td>
			<td width="28%" style=""><span>Referencia del LeoPlus
			stent:</span></td>
			<td width="21%" class="Estilo2"><span class="Estilo2"> <form:select
				path="leoPlusStentSelect" multiple="true" cssClass="desplegable"
				size="6">
				<form:options items="${leoPlusStent}" itemValue="value"
					itemLabel="label" />
			</form:select> </span></td>
		</tr>
		<tr>
			<td style=""><span>Microgu&iacute;as Terumo:</span></td>
			<td class="Estilo2" colspan="2"><form:select
				path="microguiasTerumoSelect" cssClass="desplegable">
				<form:options items="${microguias}" itemValue="value"
					itemLabel="label" />
			</form:select></td>
			<td class="Estilo2"><span class="Estilo2"></span></td>
		</tr>
		<tr>
			<td style=""><span>Dispositivos de embolizaci&oacute;n:</span></td>
			<td class="Estilo2" colspan="2"><form:select
				path="dispositivoEmbolizacionSelect" cssClass="desplegable">
				<form:options items="${dispositivoEmbolizacion}" itemValue="value"
					itemLabel="label" />
			</form:select></td>
			<td class="Estilo2"><span class="Estilo2"></span></td>
		</tr>
		<tr>
			<td style="" height="25"><span class="Estilo2"></span></td>
			<td class="Estilo2"><span class="Estilo2">Coils activos:<form:checkbox
				path="coilsActivosCheck" value="true" /></span></td>
			<td class="Estilo2"><form:select path="coilActivoSelect"
				multiple="true" cssClass="desplegable" size="6">
				<form:options items="${coilActivo}" itemValue="value"
					itemLabel="label" />
			</form:select></td>
			<td></td>
		</tr>
		<tr>
			<td style="" height="25"><span class="Estilo2"></span></td>
			<td class="Estilo2"><span class="Estilo2">Coils no
			activos:<form:checkbox path="coilsNoActivosCheck" value="true" /> </span></td>
			<td class="Estilo2"><span class="Estilo2"> <form:select
				path="coilNoActivoSelect" multiple="true" cssClass="desplegable"
				size="6">
				<form:options items="${coilNoActivo}" itemValue="value"
					itemLabel="label" />
			</form:select> </span></td>
			<td></td>
		</tr>
		<tr>
			<td style=""><span><form:checkbox path="otrosCheck"
				value="true" />Otros: </span></td>
			<td colspan="2" class="Estilo2"><span class="Estilo2"></span></td>
			<td class="Estilo2"><span class="Estilo2"></span></td>
		</tr>
		<tr>
			<td style="" height="25"><span class="Estilo2"></span></td>
			<td class="Estilo2"><span class="Estilo2">Introductor:</span></td>
			<td class="Estilo2"><form:input path="introductor" size="40"
				maxlength="30" cssClass="campo_formulario" /></td>
			<td></td>
		</tr>
		<tr>
			<td style="" height="25"><span class="Estilo2"></span></td>
			<td class="Estilo2"><span class="Estilo2">Portador:</span></td>
			<td class="Estilo2"><form:input path="portador" size="40"
				maxlength="30" cssClass="campo_formulario" /></td>
			<td></td>
		</tr>
		<tr>
			<td style="" height="25"><span class="Estilo2"></span></td>
			<td class="Estilo2"><span class="Estilo2">Gu&iacute;a:</span></td>
			<td class="Estilo2"><form:input path="guia" size="40"
				maxlength="30" cssClass="campo_formulario" /></td>
			<td></td>
		</tr>
		<tr>
			<td style="" height="25"><span class="Estilo2"></span></td>
			<td class="Estilo2"><span class="Estilo2">Otros:</span></td>
			<td class="Estilo2"><form:input path="materialOtros" size="40"
				maxlength="30" cssClass="campo_formulario" /></td>
			<td></td>
		</tr>
	</table>
	<table width="100%" class="laterales" border="0">
		<tr>
			<td colspan="8" bgcolor="#79A1D3"><span class="tituloCabecera">Valoración
			del procedimiento &nbsp;</span></td>
		</tr>
	</table>
	<table width="100%" class="laterales" border="0">
		<tr>
			<td style="" height="25">&nbsp;DWI pre-intervenci&oacute;n:</td>
			<td class="Estilo2"><span class="Estilo5">Si </span></td>
			<td class="Estilo2"><form:radiobutton path="dwiPre" value="true" /></td>
			<td class="Estilo2"><span class="Estilo5">No</span></td>
			<td class="Estilo2"><form:radiobutton path="dwiPre"
				value="false" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td width="350" style="" height="25">&nbsp;Hallazgos:</td>
			<td width="43" class="Estilo2" colspan="6"><form:textarea
				rows="4" cols="50" path="hallazgosDwiPost"
				cssClass="campo_formulario" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;DWI post-intervenci&oacute;n:</td>
			<td class="Estilo2"><span class="Estilo5">Si</span></td>
			<td class="Estilo2"><form:radiobutton path="dwiPost"
				value="true" /></td>
			<td class="Estilo2"><span class="Estilo5">No</span></td>
			<td class="Estilo2"><form:radiobutton path="dwiPost"
				value="false" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td width="350" style="" height="25">&nbsp;Hallazgos:</td>
			<td width="43" class="Estilo2" colspan="6"><form:textarea
				rows="4" cols="50" path="hallazgosDwiPost"
				cssClass="campo_formulario" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td width="350" style="" height="25">&nbsp;Navegavilidad del
			cateter introductor:</td>
			<td width="50"><span class="Estilo5">Buena </span></td>
			<td width="43" class="Estilo2"><form:radiobutton
				path="navegabilidadCateter" value="Buena" /></td>
			<td width="50" class="Estilo2"><span class="Estilo5">Mala</span></td>
			<td width="43" class="Estilo2"><form:radiobutton
				path="navegabilidadCateter" value="Mala" /></td>
			<td width="50" class="Estilo2"><span class="Estilo5">Regular
			</span></td>
			<td class="Estilo2"><form:radiobutton
				path="navegabilidadCateter" value="Regular" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25"&nbsp;>&nbsp;Sistema de
			introducci&oacute;n:</td>
			<td class="Estilo2"><span class="Estilo5">Buena </span></td>
			<td class="Estilo2"><form:radiobutton path="sistemaIntroduccion"
				value="Buena" /></td>
			<td class="Estilo2"><span class="Estilo5">Mala </span></td>
			<td class="Estilo2"><form:radiobutton path="sistemaIntroduccion"
				value="Mala" /></td>
			<td class="Estilo2"><span class="Estilo5">Regular </span></td>
			<td class="Estilo2"><form:radiobutton path="sistemaIntroduccion"
				value="Regular" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25"&nbsp;>&nbsp;Adaptaci&oacute;n del stent
			a tortuosidades vasculares:</td>
			<td class="Estilo2"><span class="Estilo5">Buena </span></td>
			<td class="Estilo2"><form:radiobutton path="adaptacionStent"
				value="Buena" /></td>
			<td class="Estilo2"><span class="Estilo5">Mala </span></td>
			<td class="Estilo2"><form:radiobutton path="adaptacionStent"
				value="Mala" /></td>
			<td class="Estilo2"><span class="Estilo5">Regular </span></td>
			<td class="Estilo2"><form:radiobutton path="adaptacionStent"
				value="Regular" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Navegavilidad del stent:</td>
			<td class="Estilo2"><span class="Estilo5">Buena </span></td>
			<td class="Estilo2"><form:radiobutton path="navegabilidadStent"
				value="Buena" /></td>
			<td class="Estilo2"><span class="Estilo5">Mala</span></td>
			<td class="Estilo2"><form:radiobutton path="navegabilidadStent"
				value="Mala" /></td>
			<td class="Estilo2"><span class="Estilo5">Regular</span></td>
			<td class="Estilo2"><form:radiobutton path="navegabilidadStent"
				value="Regular" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Liberaci&oacute;n del stent:</td>
			<td class="Estilo2"><span class="Estilo5">Buena </span></td>
			<td class="Estilo2"><form:radiobutton path="liberacionStent"
				value="Buena" /></td>
			<td class="Estilo2"><span class="Estilo5">Mala</span></td>
			<td class="Estilo2"><form:radiobutton path="liberacionStent"
				value="Mala" /></td>
			<td class="Estilo2"><span class="Estilo5">Regular </span></td>
			<td class="Estilo2"><form:radiobutton path="liberacionStent"
				value="Regular" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Localizaci&oacute;n estable del
			stent:</td>
			<td class="Estilo2"><span class="Estilo5">Si </span></td>
			<td class="Estilo2"><form:radiobutton path="localizacionEstable"
				value="true" /></td>
			<td class="Estilo2"><span class="Estilo5">No</span></td>
			<td class="Estilo2"><form:radiobutton path="localizacionEstable"
				value="false" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Completa cobertura del cuello
			aneurism&aacute;tico:</td>
			<td class="Estilo2"><span class="Estilo5">Si </span></td>
			<td class="Estilo2"><form:radiobutton path="completaCobertura"
				value="true" /></td>
			<td class="Estilo2"><span class="Estilo5">No </span></td>
			<td class="Estilo2"><form:radiobutton path="completaCobertura"
				value="false" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Coiling en paralelo:</td>
			<td class="Estilo2"><span class="Estilo5">Si </span></td>
			<td class="Estilo2"><form:radiobutton path="coilingParalelo"
				value="true" /></td>
			<td class="Estilo2"><span class="Estilo5">No </span></td>
			<td class="Estilo2"><form:radiobutton path="coilingParalelo"
				value="false" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Coiling a trav&eacute;s de la
			malla:</td>
			<td class="Estilo2"><span class="Estilo5">Si </span></td>
			<td class="Estilo2"><form:radiobutton path="coilingMalla"
				value="true" /></td>
			<td class="Estilo2"><span class="Estilo5">No</span></td>
			<td class="Estilo2"><form:radiobutton path="coilingMalla"
				value="false" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25"5>&nbsp;No Coiling:</td>
			<td class="Estilo2"><form:checkbox path="noCoiling" value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Mantenimiento de la
			posici&oacute;n de la masa de coils:</td>
			<td class="Estilo2"><span class="Estilo5">Buena </span></td>
			<td class="Estilo2"><form:radiobutton
				path="mantenimientoPosicionCoils" value="Buena" /></td>
			<td class="Estilo2"><span class="Estilo5">Regular </span></td>
			<td class="Estilo2"><form:radiobutton
				path="mantenimientoPosicionCoils" value="Regular" /></td>
			<td class="Estilo2"><span class="Estilo5">Mala </span></td>
			<td class="Estilo2"><form:radiobutton
				path="mantenimientoPosicionCoils" value="Mala" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Adecuaci&oacute;n del stent a la
			pared vascular:</td>
			<td class="Estilo2"><span class="Estilo5">Buena </span></td>
			<td class="Estilo2"><form:radiobutton path="adecuacionPared"
				value="Buena" /></td>
			<td class="Estilo2"><span class="Estilo5">Regular </span></td>
			<td class="Estilo2"><form:radiobutton path="adecuacionPared"
				value="Regular" /></td>
			<td class="Estilo2"><span class="Estilo5">Mala </span></td>
			<td class="Estilo2"><form:radiobutton path="adecuacionPared"
				value="Mala" /></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;Acortamiento del stent:</td>
			<td class="Estilo2"><span class="Estilo5">Si </span></td>
			<td class="Estilo2"><form:radiobutton path="acortamientoStent"
				value="true" /></td>
			<td class="Estilo2"><span class="Estilo5">No </span></td>
			<td class="Estilo2"><form:radiobutton path="acortamientoStent"
				value="false" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
	</table>
	<table width="100%" class="laterales" border="0">
		<tr>
			<td bgcolor="#79A1D3"><span class="tituloCabecera">Complicaciones</span></td>
		</tr>
	</table>
	<table width="100%" class="laterales" border="0">
		<tr>
			<td width="351" bgcolor="#FFFFFF" class="Estilo2"></td>
			<td width="57" class="Estilo5">Si<form:radiobutton
				path="complicaciones" value="true" /></td>
			<td width="48" class="Estilo5">No<form:radiobutton
				path="complicaciones" value="false" /></td>
			<td width="286" class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">Fracaso de la cateterizaci&oacute;n</td>
			<td class="Estilo2"><form:checkbox path="fracasoCateter"
				value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">Mal posicionamiento del stent</td>
			<td class="Estilo2"><form:checkbox path="malaPosicionStent"
				value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">Migraci&oacute;n del stent</td>
			<td class="Estilo2"><form:checkbox path="migracionStent"
				value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">Mala liberaci&oacute;n del stent</td>
			<td class="Estilo2"><form:checkbox path="malaLiberacionStent"
				value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">Complicaci&oacute;n ligada a la
			utilizaci&oacute;n de otros dispositivos</td>
			<td class="Estilo2"><form:checkbox
				path="complicacionesOtrosDispositivos" value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;</td>
			<td class="Estilo5">Coils:</td>
			<td class="Estilo2"><form:checkbox
				path="complicacionesCoilsCheck" value="true1" /></td>
			<td class="Estilo2"><form:input path="complicacionesCoils"
				size="30" maxlength="30" cssClass="campo_formulario" /></td>
		</tr>
		<tr>
			<td style="" height="25">&nbsp;</td>
			<td class="Estilo5">Otros:</td>
			<td class="Estilo2"><form:checkbox
				path="complicacionesOtrosCheck" value="true" /></td>
			<td class="Estilo2"><form:input path="complicacionesOtros"
				size="30" maxlength="30" cssClass="campo_formulario" /></td>
		</tr>
		<tr>
			<td style="" height="25">Hemorragia durante el procedimiento</td>
			<td class="Estilo2"><form:checkbox
				path="hemorragiaProcedimiento" value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">Hemorragia en el postprocedimiento (24
			horas)</td>
			<td class="Estilo2"><form:checkbox
				path="hemorragiaPostProcedimiento" value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>

		<tr>
			<td style="" height="25">Espasmo vascular</td>
			<td class="Estilo2"><form:checkbox path="espasmoVascular"
				value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">Trombosis parcial o total del stent</td>
			<td class="Estilo2"><form:checkbox path="trombosisParcialTotal"
				value="true" /></td>
			<td class="Estilo2">&nbsp;</td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
		<tr>
			<td style="" height="25">Con complicaciones cl&iacute;nicas</td>
			<td class="Estilo5">Si<form:radiobutton
				path="complicacionesClinicas" value="true" /></td>
			<td class="Estilo5">No<form:radiobutton
				path="complicacionesClinicas" value="false" /></td>
			<td class="Estilo2">&nbsp;</td>
		</tr>
	</table>

	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td>
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
					<c:if test="${not empty procedimiento.id}">
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
									href="<c:url value="formRevisiones.html?procedimientoId=${procedimiento.id}"/>">Editar
								revisiones</a></td>
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
</form:form></div>

</body>