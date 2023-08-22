package br.com.alura.tienda.dao;

import javax.persistence.EntityManager;

import br.com.alura.tienda.modelo.Producto;

public class ProductoDao {
	
	private EntityManager em;
	
	public ProductoDao(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Producto producto) {
		this.em.persist(producto);
	}

	public void actualizar(Producto producto) {
		this.em.persist(producto);
	}
	
	public void remover(Producto producto) {
		producto = em.merge(producto);
		this.em.remove(producto);
	}
}
