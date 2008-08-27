package com.stentstudio.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.appfuse.service.GenericManager;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.stentstudio.model.Usuario;

public class UsuarioFormController extends SimpleFormController {

	private GenericManager<Usuario, Long> usuarioManager = null;

	public void setUsuarioManager(
			GenericManager<Usuario, Long> usuarioManager) {
		this.usuarioManager = usuarioManager;
	}

	public UsuarioFormController() {
		setCommandClass(Usuario.class);
		setCommandName("usuario");
	}

	
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.SimpleFormController#referenceData(javax.servlet.http.HttpServletRequest, java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		return super.referenceData(request, command, errors);
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		String id = request.getParameter("id");

		if (id != null && !"".equals("id")) {
			return usuarioManager.get(new Long(id));
		}

		return new Usuario();
	}

	public ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		Usuario usuario = (Usuario) command;
		String success = getSuccessView();

		String opcion = request.getParameter("opcion");
		if("Guardar".equals(opcion)){
			usuarioManager.save(usuario);
			success = "redirect:formUsuario.html?id=" + usuario.getId();
		}else if("Borrar".equals(opcion)){
			usuarioManager.remove(usuario.getId());
			success = "redirect:/index.jsp";
		}

		return new ModelAndView(success);
	}

}
