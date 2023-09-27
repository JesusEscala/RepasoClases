package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Producto;
import model.Usuario;

public class Demo07 {
	//Variables globales

	//Obtener la conexión usando DAO => especificar unidad de persistencia a utilizar
	static EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("jpa_cl1");
	//establecer el manejador de las entidades
	static EntityManager em=fabrica.createEntityManager();
	
	//Listar usuarios
	public static void main(String[] args) {
		//select*from...
		String jpql ="select p from Producto p";
		List<Producto> lstProductos=em.createQuery(jpql, Producto.class).getResultList();
		//Mostrar listado
		System.out.println("Listado de usuarios");
		for (Producto p : lstProductos) {
			System.out.println("Código :"+p.getId_prod());
			System.out.println("Nombre :"+p.getDes_prod());
			System.out.println("Categoría   :"+p.getObjCategoria().getDescripcion());
			System.out.println("Proveedor   :"+p.getObjProveedor().getNombre_rs()+"-"+p.getObjProveedor().getTelefono());
			System.out.println("===============================");
		}
		em.close();
	}
}
