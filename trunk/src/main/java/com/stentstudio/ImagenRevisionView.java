package com.stentstudio;

import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

import com.stentstudio.model.ImagenRevision;

public class ImagenRevisionView implements View {

	private ImagenRevision imagenRevision;
	
	
	
	public ImagenRevisionView(ImagenRevision imagenRevision) {
		super();
		this.imagenRevision = imagenRevision;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.View#getContentType()
	 */
	public String getContentType() {
		return imagenRevision.getContentType();
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.View#render(java.util.Map, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void render(Map model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
//		PrintWriter writer = response.getWriter();
//		response.setContentType(imagenRevision.getContentType());
//        response.setContentLength(imagenRevision.getContent().length);
//        writer.print(imagenRevision.getContent());
//		response.setContentType("text.html");
//		String texto = "sdfñl";
//        response.setContentLength(texto.getBytes().length);
//        writer.print(texto.getBytes());
//        writer.flush();
//        writer.close();
		OutputStream output = response.getOutputStream();
		output.write(imagenRevision.getContent(), 0, imagenRevision.getContent().length);
		output.flush();
		output.close();
	}

	
	
}
