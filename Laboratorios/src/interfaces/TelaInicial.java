package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class TelaInicial {

	private JFrame frmGerenciaDeLaboratorios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frmGerenciaDeLaboratorios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGerenciaDeLaboratorios = new JFrame();
		frmGerenciaDeLaboratorios.getContentPane().setBackground(Color.DARK_GRAY);
		frmGerenciaDeLaboratorios.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema de Gerenciamento de acesso a Laboratorios ");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(44, 144, 705, 48);
		frmGerenciaDeLaboratorios.getContentPane().add(lblNewLabel);
		frmGerenciaDeLaboratorios.setTitle("Gerencia de Laboratorios -William Alcantara -Prog Desktop");
		frmGerenciaDeLaboratorios.setBounds(100, 100, 799, 473);
		frmGerenciaDeLaboratorios.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmGerenciaDeLaboratorios.setJMenuBar(menuBar);
		
		JMenu caduser = new JMenu("Cadastro de Usuarios");
		menuBar.add(caduser);
		
		JMenuItem telacadastro = new JMenuItem("Tela de Cadastro");
		telacadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// chamar outra tela
				jifcadastro cad = new jifcadastro();
				cad.setVisible(true);
				
				
			}
		});
		caduser.add(telacadastro);
	}
}
