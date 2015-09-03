package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
*@author Danilo Righetto;
*@version 1.0.0-SNAPSHOT
*Curso da Alura - Spring MVC
*Project-name: casadocodigo
*Date: 03-09-2015 
*/

@Controller
public class HomeController {
	/*Esse e uma das nossas classes Controller*/
	
	/*A annotation RequestMapping serve para mapear qual metodo deve ser chamado para cada URL*/
	@RequestMapping("/")
	private String index() {
		// TODO Auto-generated method stub
		System.out.println("Carregando os Produtos");
		return "hello-world"; //retorna '/WEB-INF/views/hello-world.jsp'
	}
}
