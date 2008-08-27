
	package com.stentstudio.controller;

	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import org.springframework.validation.BindException;
	import org.springframework.web.servlet.ModelAndView;
	import org.springframework.web.servlet.mvc.SimpleFormController;
	import com.stentstudio.model.UsuarioSearchCriteria;
	import com.stentstudio.service.UsuarioManager;

	public class UsuarioSearchController extends SimpleFormController {

		private UsuarioManager usuarioManager = null;

		public void setUsuarioManager(
				UsuarioManager usuarioManager) {
			this.usuarioManager = usuarioManager;
		}

		public UsuarioSearchController() {
			setCommandClass(UsuarioSearchCriteria.class);
			setCommandName("searchUsuario");
		}

		public ModelAndView onSubmit(HttpServletRequest request,
				HttpServletResponse response, Object command, BindException errors)
				throws Exception {

			UsuarioSearchCriteria searchUsuario = (UsuarioSearchCriteria) command;
			String success = getSuccessView();

			Map model = new HashMap();
			List usuarios = usuarioManager.searchUsuarios(searchUsuario); 
			model.put("usuarios", usuarios);
			model.put("searchUsuario", searchUsuario);
			
			return new ModelAndView(success,model);
		}
	}
