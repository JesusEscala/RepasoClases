package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
	//Variables globales

	//Obtener la conexión usando DAO => especificar unidad de persistencia a utilizar
	static EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("jpa_cl1");
	//establecer el manejador de las entidades
	static EntityManager em=fabrica.createEntityManager();
	
	//Actualizar un usuario
	public static void main(String[] args) {
		//Objeto donde se guardan los datos
		Usuario u=new Usuario(6, "Jose", "Pichula", "jperez", "123456", "2000/05/10", 1, 1);
		//Proceso de registro empezando con una transacción
		em.getTransaction().begin();
		//En lugar de insert into...
		em.merge(u);
		//Confirmar registro
		em.getTransaction().commit();
		System.out.println("Actualización Ok");
		em.close();
	}
}
