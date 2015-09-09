package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.casadocodigo.loja.models.Product;

/** 
*@author Danilo Righetto;
*@version 1.0.0-SNAPSHOT
*Curso da Alura - Spring MVC
*Project-name: casadocodigo
*Date: 03-09-2015 
*/

@Repository
public class ProductDAO {

	@PersistenceContext
	private EntityManager manager;
	
	/*A annotation '@PersistenceContext' serve para pedirmos injecao do EntityManager*/
	
	public void save(Product product) {
		manager.persist(product);
	}

}
