package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.beans.Usuario;

public class UsuarioDAO {

	EntityManager em;
	
	public UsuarioDAO(){
		em = Persistence.createEntityManagerFactory("usuarioPU").createEntityManager();
	}
	
	public void addUser(Usuario usuario){
		try {
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}
}
