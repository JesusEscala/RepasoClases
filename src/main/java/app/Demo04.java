package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {
	//Variables globales

	//Obtener la conexión usando DAO => especificar unidad de persistencia a utilizar
	static EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("jpa_cl1");
	//establecer el manejador de las entidades
	static EntityManager em=fabrica.createEntityManager();
	
	//Buscar un usuario y actualizar
	public static void main(String[] args) {
		//Objeto donde se guardan los datos
		em.getTransaction().begin();
		Usuario u= em.find(Usuario.class, 1);
		u.setApe_usua("Peruano");
		em.merge(u);
		em.getTransaction().commit();
		System.out.println(u);
		em.close();
	}
}
