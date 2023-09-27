package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo06 {
	//Variables globales

	//Obtener la conexión usando DAO => especificar unidad de persistencia a utilizar
	static EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("jpa_cl1");
	//establecer el manejador de las entidades
	static EntityManager em=fabrica.createEntityManager();
	
	//Listar usuarios
	public static void main(String[] args) {
		//select*from...
		String jpql ="select u from Usuario u";
		List<Usuario> lstUsuarios=em.createQuery(jpql, Usuario.class).getResultList();
		//Mostrar listado
		System.out.println("Listado de usuarios");
		for (Usuario u : lstUsuarios) {
			System.out.println("Código :"+u.getCod_usua());
			System.out.println("Nombre :"+u.getNom_usua()+ " "+u.getApe_usua());
			System.out.println("Tipo   :"+u.getIdtipo()+ "-"+u.getObjTipo().getDescripcion());
			System.out.println("===============================");
		}
	}
}
