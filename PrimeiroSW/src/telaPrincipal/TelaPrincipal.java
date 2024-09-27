package telaPrincipal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				TelaPrincipal frame = new TelaPrincipal();
				frame.setVisible(true);
			}
		});
	}

	// Create the frame.
	public TelaPrincipal() {
		setTitle("PrimeiraTela");
		setBounds(100, 100, 450, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Rotulo1 = new JLabel("Selecione uma Opção");
		Rotulo1.setBounds(114, 67, 205, 21);
		Rotulo1.setBackground(Color.WHITE);
		Rotulo1.setHorizontalAlignment(SwingConstants.CENTER);
		Rotulo1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JButton botaoDesistir = new JButton("Desistir da Vida");
		botaoDesistir.setBounds(264, 206, 145, 23);
		
		JButton btnTeste1 = new JButton("Desistir da Morte");
		btnTeste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Não Faça Isso");
			}
		});
		btnTeste1.setBounds(36, 206, 151, 23);
				botaoDesistir.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					setVisible(false);
					}
					});
		;
		getContentPane().setLayout(null);
		getContentPane().add(btnTeste1);
		getContentPane().add(Rotulo1);
		getContentPane().add(botaoDesistir);
		
		JButton btnTeste2 = new JButton("Quer um conselho?");
		btnTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Só Deus sabe como tá a mente"
						+ " do palhaço ",
						"O conselho é:", JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					JOptionPane.showMessageDialog(null, "Que Legal");
				} else {
					JOptionPane.showMessageDialog(null, "Porra", "NÃO ENTENDEU?", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnTeste2.setBounds(144, 240, 151, 29);
		getContentPane().add(btnTeste2);
		
		JButton btnTeste3 = new JButton("Digite seu Nome");
		btnTeste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog(null,"Qual seu Nome","Entrada de Nome",
						JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, "O nome Digitado foi: " + nome);
			}
		});
		btnTeste3.setBounds(144, 137, 151, 29);
		getContentPane().add(btnTeste3);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);

	}
}
