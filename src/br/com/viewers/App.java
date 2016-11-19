package br.com.viewers;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.windowBorder);
		frame.setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		mnCadastro.setBackground(SystemColor.windowBorder);
		menuBar.add(mnCadastro);
		
		JMenuItem mntmUsurio = new JMenuItem("Usuário");
		mntmUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroUsuarioViewer v = new CadastroUsuarioViewer();
				v.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				v.setResizable(false);
				v.setLocationRelativeTo(null);
				v.setVisible(true);
			}
		});
		mnCadastro.add(mntmUsurio);
		
		JMenu mnRelatrios = new JMenu("Relatórios");
		mnRelatrios.setBackground(SystemColor.windowBorder);
		mnRelatrios.setForeground(Color.BLACK);
		menuBar.add(mnRelatrios);
		
		JMenuItem mntmUsurios = new JMenuItem("Usuários");
		mntmUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Gera Relatorios
				
			}
		});
		mnRelatrios.add(mntmUsurios);
	}

}
