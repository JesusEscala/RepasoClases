package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {
	//Variables globales

	//Obtener la conexión usando DAO => especificar unidad de persistencia a utilizar
	static EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("jpa_cl1");
	//establecer el manejador de las entidades
	static EntityManager em=fabrica.createEntityManager();
	
	//Eliminar un usuario
	public static void main(String[] args) {
		//Objeto donde se guardan los datos
		em.getTransaction().begin();
		Usuario u= em.find(Usuario.class, 4);
		em.remove(u);
		em.getTransaction().commit();
		em.close();
	}
}
