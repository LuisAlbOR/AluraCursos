package br.com.alura.tienda.dao;

import javax.persistence.EntityManager;

import br.com.alura.tienda.modelo.Producto;

public class ProductoDao {
	public class ProdutoDao {

	    private EntityManager em;

	    public ProdutoDao(EntityManager em) {
	        this.em = em;
	    }

	    public void cadastrar(Producto produto) {
	        this.em.persist(produto);
	    }

	}

}
