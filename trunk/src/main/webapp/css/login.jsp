<%@ include file="/common/taglibs.jsp"%>

<body>

<div id="contenedor">

<c:if test="${param.error != null}">
	<center>
	<div class="error">
		<img src="${ctx}/images/iconWarning.gif"
			alt="<fmt:message key='icon.warning'/>" class="icon" />
		<fmt:message key="errors.password.mismatch" />
	</div>
	</center>
</c:if>

<form method="post" id="loginForm" action="<c:url value='/j_security_check'/>">

<table cellpadding="0" cellspacing="0" border="0" align="center" >
	<tr>
		<td valign="top">
		<table cellpadding="0" cellspacing="0" border="0">
			<tr>
				<td>
				<table width="380" border="0" align="center" cellPadding="0"
					cellSpacing="0" valign="top">
					<tr>
						<td align="left" width="24" rowSpan="2"><IMG height="24"
							src="images/fdo_tit_izq.gif"></td>
						<td width="171" height="24" rowSpan="2"
							background="images/fdo_tit_centro.gif" class="tituloCabecera">
						ACCESO</td>
						<td width="32" rowSpan="2"><IMG height="24"
							src="images/fdo_tit_drch.gif"></td>
						<td width="100%" bgcolor="#466492"><IMG height="1"
							src="images/spacer.gif"></td>
						<td align="right" width="29" rowSpan="2"><IMG height="24"
							src="images/t3-esq-1.gif" width="7"></td>
					</tr>
					<tr>
						<td width="380">&nbsp;</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>
				<table cellSpacing="0" cellPadding="0" width="380" align="center"
					border="0">
					<tr>
						<td width="1" bgcolor="#466492"><IMG height="1"
							src="images/spacer.gif" width="1"></td>
						<td width="378">
						<table width="100%" cellpadding="0" cellspacing="0" border="0">
							<tr>
								<td height="10"></td>
							</tr>
							<tr>
								<td>
								<table border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td height="5"></td>
									</tr>
									<tr>
										<td colspan="3" align="center">
										<table cellpadding="2" cellspacing="0" border="0" width="70%">
											<tr>
												<td width="40">&nbsp;</td>
												<td class="etiqueta">Login </td>
												<td><input type="text" name="j_username"
													id="j_username" tabindex="1" class="campo_formulario" /></td>
											</tr>
											<tr>
												<td width="40">&nbsp;</td>
												<td class="etiqueta">Contraseña </td>
												<td><input type="password"
													name="j_password" id="j_password" tabindex="2" class="campo_formulario"  /></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td height="5"></td>
									</tr>
								</table>
								</td>
							</tr>
						</table>
						</td>
						<td width="1" bgColor="#466492"><IMG height="1"
							src="images/spacer.gif" width="1"></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>
				<table cellSpacing="0" cellPadding="0" width="380" align="center"
					border="0">
					<tr>
						<td width="1" bgcolor="#466492"><IMG height="1"
							src="images/spacer.gif" width="1"></td>
						<td vAlign="top" width="80%" style="border-left:1px;"
							background="images/t3-abajo.gif"></td>
						<td vAlign="top" width="26" height="1"><IMG height="26"
							src="images/fdo_tabla_ico_izq.gif" width="40"></td>
						<td colspan="2" align="left" vAlign="bottom" height="1"
							background="images/t3-arribaGrande.gif">
						<table cellpadding="0" cellspacing="0" border="0" align="center">
							<tr>
								<td rowspan="3" width="5" height="13"><img
									src="images/izda.gif" width="12" height="20" border="0" alt=""></td>
								<td height="1" width="70"><img src="images/spacerAzul.gif"
									width="70" height="2" border="0" alt=""></td>
								<td rowspan="3" align="right" width="5" height="13"><img
									src="images/decha.gif" width="12" height="20" border="0" alt=""></td>
							</tr>
							<tr align="center">
								<td height="11" bgcolor="white"><input type="submit"
									name="login" value="Acceder" class="boton" alt=""></td>
							</tr>
							<tr>
								<td width="70" valign="bottom"><img
									src="images/spacerAzul.gif" width="70" height="2" border="0"
									alt=""></td>
							</tr>
						</table>
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>

</form>

</div>
</body>

