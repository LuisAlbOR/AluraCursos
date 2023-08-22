package br.com.alura.tienda.tests;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.tienda.dao.CategoriaDao;
import br.com.alura.tienda.dao.ProductoDao;
import br.com.alura.tienda.modelo.Categoria;
import br.com.alura.tienda.modelo.Producto;
import br.com.alura.tienda.util.JPAUtil;

public class RegistroDeProducto {

	public static void main(String[] args) {
		Categoria celulares = new Categoria("CELULARES");
		
	    EntityManager em = JPAUtil.getEntityManager();
	    
	    //iniciando transaccion
	    //V1
	    /*
	     * em.persist(celulares);
	     * celulares.setNombre("Laptops");
	     * em.getTransaction().commit();
	     * em.close()
	     * celulares.setNombre("Pantallas");
	     */
	    
	    //V2
	    /*
	     * em.persist(celulares);
	     * celulares.setNombre("Laptops");
	     * em.flush();
	     * em.clear();
	     * 
	     * celulares = em.merge(celulares);
	     * celulares.setNombre("Pantallas");
	     * em.flush();
	     * em.remove(celulares);
	     */
	    
	    //V3
	    /*
	     * em.persist(celulares);
	     * celulares.setNombre("Laptops");
	     * em.flush();
	     * em.clear();
	     * 
	     * celulares = em.merge(celulares);
	     * celulares.setNombre("Pantallas");
	     * em.flush();
	     *--em.clear();
	     *em.remove();
	     *em.flush();
	     */
	}

}
