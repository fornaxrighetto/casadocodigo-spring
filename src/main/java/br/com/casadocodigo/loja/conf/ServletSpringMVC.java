package br.com.casadocodigo.loja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/** 
*@author Danilo Righetto;
*@version 1.0.0-SNAPSHOT
*Curso da Alura - Spring MVC
*Project-name: casadocodigo
*Date: 03-09-2015 
*/

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{
	/*Essa nossa Servlet sera responsavel por tratar
	 *todas as requisicoes que chegam para o SpringMVC
	 */
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return AppWebConfiguration
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{AppWebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
