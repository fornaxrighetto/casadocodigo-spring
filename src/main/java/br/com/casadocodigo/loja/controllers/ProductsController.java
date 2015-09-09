package br.com.casadocodigo.loja.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.daos.ProductDAO;
import br.com.casadocodigo.loja.models.Product;

/** 
*@author Danilo Righetto;
*@version 1.0.0-SNAPSHOT
*Curso da Alura - Spring MVC
*Project-name: casadocodigo
*Date: 03-09-2015 
*/

@Controller
@Transactional
/*Com a annotation '@Transactional' informamos que os metodos da classe 'ProductsController'
 *precisam de transacao*/
public class ProductsController {
	
	@Autowired //Responsavel por indicar os pontos de injecao dentro da classe
	private ProductDAO productDAO;
	
	@RequestMapping("/produtos")
	public String save(Product product){
		productDAO.save(product);
		System.out.println("Cadastrando o Produto: " + product);
		return "products/ok";
	}

	@RequestMapping("/produtos/form")
	public String form(){
		return "products/form";
	}
}
