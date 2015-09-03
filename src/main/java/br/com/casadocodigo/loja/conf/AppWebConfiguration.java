package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.loja.controllers.HomeController;

/** 
*@author Danilo Righetto;
*@version 1.0.0-SNAPSHOT
*Curso da Alura - Spring MVC
*Project-name: casadocodigo
*Date: 03-09-2015 
*/

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class})
public class AppWebConfiguration {
	/*O objetivo de nossa classe e export para a Servlet do SpringMVC
	 *Quais sao as classes que devem ser lidas e carregadas*/
	
	/*Cliente faz request, Servlet principal atende e delega para um controller da aplicação e, 
	 *finalmente, uma página é montada para responder a requisição. 
	 *Por default, o Spring MVC segue justamente essa sequência.*/
	/**
	 * @return InternalResourceViewResolver
	 */
	@Bean
	public InternalResourceViewResolver internalResolverViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		/*Essa classe vai guardar as conf da pasta base e do sufixo
		 *que deve ser adicionado para qualquer caminho que seja
		 *retornado por metodos Controllers*/
		return resolver;
	}
}
