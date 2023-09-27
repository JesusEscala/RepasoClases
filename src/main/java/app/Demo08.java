package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import model.Usuario;

public class Demo08 {
	// Login del usuario
	public static void main(String[] args) {
		String usuario = JOptionPane.showInputDialog("Ingrese el usuario");
		String clave = JOptionPane.showInputDialog("Ingrese la clave");

		// Obtener la conexión usando DAO => especificar unidad de persistencia a
		// utilizar
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_cl1");
		// establecer el manejador de las entidades
		EntityManager em = fabrica.createEntityManager();
		String jpql = "select u from Usuario u where u.usr_usua= :xusr and u.cla_usua=:xcla";
		try {
			Usuario u = em.createQuery(jpql, Usuario.class).setParameter("xusr", usuario).setParameter("xcla", clave)
					.getSingleResult();
			JOptionPane.showMessageDialog(null, "Bienvenido "+u.getNom_usua());
			//abrir ventana principal
			FrmManteProd fr=new FrmManteProd();
			fr.setVisible(true);
			//dispose();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error : Usuario o clave incorrecto");
		}
		em.close();
	}
}
