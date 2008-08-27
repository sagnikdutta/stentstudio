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
				height="24" rowSpan="2">&nbsp;ESTADISTICAS</td>
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

	
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td colspan="18">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="16"><img src="<%=request.getContextPath()%>/images/t3-esq-3_02.gif" width="16" height="26"></td>
					<td style="border-bottom: 1px solid #426594">&nbsp;</td>
                    <td width="16"><img src="<%=request.getContextPath()%>/images/t3-esq-3_03gif" width="16" height="26"></td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
    
	
</div>
</body>