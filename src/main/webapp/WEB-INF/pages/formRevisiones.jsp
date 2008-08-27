<%@ include file="include.jsp" %>

<html>
<link href="css/centro.css" rel="stylesheet" type="text/css">
<link href="css/style_ex2.css" rel="stylesheet" type="text/css">
<link href="css/style_ex.css" rel="stylesheet" type="text/css">
<div id="contenedor">
<table cellSpacing="0" cellPadding="0" width="100%" valign="top" align="center" border="0">
				<tr>
					<td align="left" width="1" rowSpan="2"><IMG height="24" src="<%=request.getContextPath()%>/images/fdo_tit_izq.gif"></td>
					<td class="tituloCabecera" background="<%=request.getContextPath()%>/images/fdo_tit_centro.gif" height="24" rowSpan="2">&nbsp;REVISIONES</td>
				  <td width="22" rowSpan="2"><IMG height="24" src="<%=request.getContextPath()%>/images/fdo_tit_drch.gif"></td>
					<td width="1" bgcolor="#466492"><IMG height="1" src="<%=request.getContextPath()%>/images/spacer.gif"></td>
					<td align="right" width="7" rowSpan="2"><IMG height="24" src="<%=request.getContextPath()%>/images/t3-esq-1.gif" width="7"></td>
				</tr>
				<tr>
					<td width="80%">&nbsp;</td>
				</tr>
</table>
<div id="laterales">
<form:form commandName="revision" method="post" action="formRevisiones.html">
<form:errors path="*" cssClass="error" element="div"/>
<c:if test="${not empty revision.id}">
		<form:hidden path="id" />
</c:if>
<form:hidden path="procedimiento.id" />
<table width="100%" border="0" class="laterales">
  <tr>			
    <td width="348" class="Estilo5" height="25"><h4>Fecha de la intervención: 
    <fmt:formatDate value="${revision.procedimiento.fechaProcedimiento}" pattern="dd/MM/yyyy" /></h4></td>
    <td colspan="4" class="Estilo5"><h4 align="center"> Tras 6 meses</h4></td>
    <td colspan="4" class="Estilo5"><h4 align="center"> Tras 1 año</h4></td>
    <td colspan="4" class="Estilo5"><h4 align="center"> Tras 2 años</h4></td> 
    <td width="2%"></td>
  </tr>
  <tr height="25">
  	<td width="348" height="25"></td>
    <td colspan="2" class="Estilo5"><h4 align="center"> SI</h4></td>
    <td colspan="2" class="Estilo5"><h4 align="center"> NO</h4></td>
    <td colspan="2" class="Estilo5"><h4 align="center"> SI</h4></td>
    <td colspan="2" class="Estilo5"><h4 align="center"> NO</h4></td>
    <td colspan="2" class="Estilo5"><h4 align="center"> SI</h4></td>
    <td colspan="2" class="Estilo5"><h4 align="center"> NO</h4></td>
    <td></td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Trombosis intra-stent</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisIntrastent6m" value="true"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="62" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisIntrastent6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisIntrastent12m" value="true"/>
    </div></td>
    <td width="41" valign="middle" class="style2">&nbsp;</td>
    <td width="63" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisIntrastent12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisIntrastent24m" value="true"/>
    </div></td>
    <td width="41" valign="middle" class="style2">&nbsp;</td>
    <td width="67" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisIntrastent24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Trombosis arterial</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisArterial6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisArterial6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisArterial12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisArterial12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisArterial24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="trombosisArterial24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Prolapso de coils</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="prolapsoCoils6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="prolapsoCoils6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="prolapsoCoils12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="prolapsoCoils12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="prolapsoCoils24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="prolapsoCoils24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Hiperplasia</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hiperplasia6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hiperplasia6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hiperplasia12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hiperplasia12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hiperplasia24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hiperplasia24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Alteraciones en el calibre de la arteria</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="alteracionesCalibre6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="alteracionesCalibre6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="alteracionesCalibre12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="alteracionesCalibre12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="alteracionesCalibre24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="alteracionesCalibre24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Grado de oclusi&oacute;n del aneurisma</td>
    <td colspan="4" valign="middle" class="style2" align="center"><form:input path="gradoOclusion6m" size="20" maxlength="20" cssClass="campo_formulario"/></td>
    <td colspan="4" valign="middle" class="style2" align="center"><form:input path="gradoOclusion12m" size="20" maxlength="20" cssClass="campo_formulario"/></td>
    <td colspan="4" valign="middle" class="style2" align="center"><form:input path="gradoOclusion24m" size="20" maxlength="20" cssClass="campo_formulario"/></td>
    <td></td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Empaquetamiento de coils</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="empaquetamientoCoils6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="empaquetamientoCoils6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="empaquetamientoCoils12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="empaquetamientoCoils12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="empaquetamientoCoils24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="empaquetamientoCoils6m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Recoiling</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="recoiling6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="recoiling6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="recoiling12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="recoiling12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="recoiling24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="recoiling24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Deterioro neurol&oacute;gico</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deterioroNeurologico6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deterioroNeurologico6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deterioroNeurologico12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deterioroNeurologico12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deterioroNeurologico24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deterioroNeurologico24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">D&eacute;ficit de pares craneales</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deficitParesCraneales6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deficitParesCraneales6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deficitParesCraneales12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deficitParesCraneales12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deficitParesCraneales24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="deficitParesCraneales24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Hemorragia cerebral</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hemorragiaCerebral6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
     <form:radiobutton path="hemorragiaCerebral6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hemorragiaCerebral12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hemorragiaCerebral12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hemorragiaCerebral24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="hemorragiaCerebral24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <tr height="25">
    <td nowrap class="style2">Stroke / CVA</td>
    <td width="29" valign="middle" class="style2">&nbsp;</td>
    <td width="57" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="strokeCva6m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="strokeCva6m" value="false"/>
    </div></td>
    <td width="34" valign="middle" class="style2">&nbsp;</td>
    <td width="58" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="strokeCva12m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="strokeCva12m" value="false"/>
    </div></td>
    <td width="38" valign="middle" class="style2">&nbsp;</td>
    <td width="54" valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="strokeCva24m" value="true"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
    <td valign="middle" class="style2"><div align="left" class="style9">
      <form:radiobutton path="strokeCva24m" value="false"/>
    </div></td>
    <td valign="middle" class="style2">&nbsp;</td>
  </tr>
  <c:if test="${not empty revision.id}">
  <tr height="25"> <!-- Revisar redireccion  -->
  	<td nowrap class="style2">Imagen de control</td>
    <td colspan="4" align="center"><a href="#"onclick="window.open('<%=request.getContextPath()%>/fileRevisionUpload.html?revisionId=${revision.id}','imagenes', 'height=700,width=900,resizable=yes,scrollbars=yes');">Ver / Editar</a></td>
    <td colspan="4" align="center"><a href="#"onclick="window.open('<%=request.getContextPath()%>/fileRevisionUpload.html?revisionId=${revision.id}','imagenes', 'height=700,width=900,resizable=yes,scrollbars=yes');">Ver / Editar</a></td>
    <td colspan="4" align="center"><a href="#"onclick="window.open('<%=request.getContextPath()%>/fileRevisionUpload.html?revisionId=${revision.id}','imagenes', 'height=700,width=900,resizable=yes,scrollbars=yes');">Ver / Editar</a></td>
    <td></td>
  </tr>
  </c:if>
</table>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="16"><img src="<%=request.getContextPath()%>/images/t3-esq-3_02.gif" width="16" height="26"></td>
        <td width="75%" style="border-bottom:1px solid #426594">&nbsp;</td>
        <td width="40"><img src="<%=request.getContextPath()%>/images/fdo_tabla_ico_izq.gif" width="40" height="26"></td>
		<td style="border-top:1px solid #426594">
			<table cellpadding="0" cellspacing="0" border="0" align="center">
				<tr>
					<td rowspan="3" width="2" height="13"><img src="<%=request.getContextPath()%>/images/izda.gif" width="12" height="20" border="0" alt=""></td>
				 	<td height="1" width="85"><img src="<%=request.getContextPath()%>/images/spacerAzul.gif" width="85" height="2" border="0" alt=""></td>
					<td rowspan="3" align="right" width="2" height="13"><img src="<%=request.getContextPath()%>/images/decha.gif" width="12" height="20" border="0" alt=""></td>
			 	</tr>
				<tr align="center">
					<td height="13" bgcolor="white"><input type="submit" name="opcion" value="Guardar" class="boton"></td>	
				</tr>
				<tr>
					<td width="85" valign="bottom"><img src="<%=request.getContextPath()%>/images/spacerAzul.gif" width="85" height="2" border="0" alt=""></td>
				</tr>
			</table>
		</td>
      </tr>
    </table>
</form:form>
</div>
</html>