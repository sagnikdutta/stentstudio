package com.stentstudio;

import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

import com.stentstudio.model.ImagenAneurisma;

public class ImagenView implements View {

	private ImagenAneurisma imagenAneurisma;
	
	
	
	public ImagenView(ImagenAneurisma imagenAneurisma) {
		super();
		this.imagenAneurisma = imagenAneurisma;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.View#getContentType()
	 */
	public String getContentType() {
		return imagenAneurisma.getContentType();
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.View#render(java.util.Map, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void render(Map model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
//		PrintWriter writer = response.getWriter();
//		response.setContentType(imagenAneurisma.getContentType());
//        response.setContentLength(imagenAneurisma.getContent().length);
//        writer.print(imagenAneurisma.getContent());
//		response.setContentType("text.html");
//		String texto = "sdfñl";
//        response.setContentLength(texto.getBytes().length);
//        writer.print(texto.getBytes());
//        writer.flush();
//        writer.close();
		OutputStream output = response.getOutputStream();
		output.write(imagenAneurisma.getContent(), 0, imagenAneurisma.getContent().length);
		output.flush();
		output.close();
	}

	
	
}
