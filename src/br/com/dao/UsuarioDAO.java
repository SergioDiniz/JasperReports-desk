package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	
	
	public List<Usuario> listUsuario(){
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			
			Query query = em.createQuery("from Usuario");
			usuarios = query.getResultList();
			
		} finally {
			em.close();
		}
		
		return usuarios;
		
	}
}
