package br.com.viewers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;

public class CadastroUsuarioViewer extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextPane txtpnEmail;
	private JTextField tfEmaill;
	private JTextPane txtpnEndereo;
	private JTextField textField;
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
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setBackground(SystemColor.window);
		txtpnNome.setText("Nome:");
		txtpnNome.setBounds(24, 87, 59, 16);
		contentPane.add(txtpnNome);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		tfNome.setBounds(23, 108, 395, 35);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		txtpnEmail = new JTextPane();
		txtpnEmail.setBackground(SystemColor.window);
		txtpnEmail.setText("Email:");
		txtpnEmail.setBounds(28, 148, 59, 16);
		contentPane.add(txtpnEmail);
		
		tfEmaill = new JTextField();
		tfEmaill.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		tfEmaill.setBounds(23, 165, 395, 35);
		contentPane.add(tfEmaill);
		tfEmaill.setColumns(10);
		
		txtpnEndereo = new JTextPane();
		txtpnEndereo.setBackground(SystemColor.window);
		txtpnEndereo.setText("Endereço");
		txtpnEndereo.setBounds(28, 212, 182, 16);
		contentPane.add(txtpnEndereo);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		textField.setBounds(23, 229, 395, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnCadastrar.setBounds(156, 290, 131, 40);
		contentPane.add(btnCadastrar);
		
		txtpnNovoCadastroDe = new JTextPane();
		txtpnNovoCadastroDe.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		txtpnNovoCadastroDe.setBackground(SystemColor.window);
		txtpnNovoCadastroDe.setText("Novo Cadastro de Usuário");
		txtpnNovoCadastroDe.setBounds(86, 30, 278, 35);
		contentPane.add(txtpnNovoCadastroDe);
	}
}
