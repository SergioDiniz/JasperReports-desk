package be.com.main;

import java.util.Calendar;

import br.com.beans.Usuario;
import br.com.dao.UsuarioDAO;

public class App {
	public static void main(String[] args) {
		Usuario u = new Usuario();
		u.setDataNascimento(Calendar.getInstance());
		u.setNome("Sergio Diniz");
		u.setEmail("sergio@g.com");
		u.setEndereco("Rua Pedro Muniz de Brito, 71");
		
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.addUser(u);
		
		System.out.println("OK!");
	}
}
