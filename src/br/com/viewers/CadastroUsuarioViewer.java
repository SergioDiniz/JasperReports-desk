package br.com.viewers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.beans.Usuario;
import br.com.dao.UsuarioDAO;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class CadastroUsuarioViewer extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextPane txtpnEmail;
	private JTextField tfEmaill;
	private JTextPane txtpnEndereo;
	private JTextField tfEndereco;
	private JButton btnCadastrar;
	private JTextPane txtpnNovoCadastroDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuarioViewer frame = new CadastroUsuarioViewer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroUsuarioViewer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		tfNome.setBounds(23, 108, 395, 35);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEmaill = new JTextField();
		tfEmaill.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		tfEmaill.setBounds(23, 165, 395, 35);
		contentPane.add(tfEmaill);
		tfEmaill.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		tfEndereco.setBounds(23, 229, 395, 35);
		contentPane.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(SystemColor.window);
		txtpnNome.setText("Nome:");
		txtpnNome.setBounds(24, 87, 59, 16);
		contentPane.add(txtpnNome);
		
		txtpnEmail = new JTextPane();
		txtpnEmail.setEditable(false);
		txtpnEmail.setBackground(SystemColor.window);
		txtpnEmail.setText("Email:");
		txtpnEmail.setBounds(28, 148, 59, 16);
		contentPane.add(txtpnEmail);
		
		txtpnEndereo = new JTextPane();
		txtpnEndereo.setEditable(false);
		txtpnEndereo.setBackground(SystemColor.window);
		txtpnEndereo.setText("Endereço:");
		txtpnEndereo.setBounds(28, 212, 182, 16);
		contentPane.add(txtpnEndereo);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					// add new User
					Usuario usuario = new Usuario();
					usuario.setDataNascimento(Calendar.getInstance());
					usuario.setNome(tfNome.getText());
					usuario.setEmail(tfEmaill.getText());
					usuario.setEndereco(tfEndereco.getText());
					
					UsuarioDAO dao = new UsuarioDAO();
					dao.addUser(usuario);
					
					JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com Sucesso!");
					
					dispose();
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar Cadastro. Tente novamento!" + e2.getMessage());
				}
				
				
			}
		});
		btnCadastrar.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnCadastrar.setBounds(156, 290, 131, 40);
		contentPane.add(btnCadastrar);
		
		txtpnNovoCadastroDe = new JTextPane();
		txtpnNovoCadastroDe.setEditable(false);
		txtpnNovoCadastroDe.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		txtpnNovoCadastroDe.setBackground(SystemColor.window);
		txtpnNovoCadastroDe.setText("Novo Cadastro de Usuário");
		txtpnNovoCadastroDe.setBounds(86, 30, 310, 35);
		contentPane.add(txtpnNovoCadastroDe);
	}
}
