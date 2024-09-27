package telaPrincipal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class ValidarIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
//	private JTextField lblResposta;

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarIdade frame = new ValidarIdade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// * Create the frame.
	public ValidarIdade() {
		setTitle("Validador");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(110, 51, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lbnIdade = new JLabel("Idade");
		lbnIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbnIdade.setBounds(110, 91, 59, 14);
		getContentPane().add(lbnIdade);
		
		txtNome = new JTextField();
		txtNome.setBounds(166, 48, 86, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(166, 88, 86, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResposta.setBounds(137, 220, 140, 31);
		getContentPane().add(lblResposta);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostrarResultado
				String nome = txtNome.getText();
				String idade = txtIdade.getText();	
				String mensagem = (nome+idade);
				
				int IdadeNum = Integer.parseInt(idade);
				if (IdadeNum<18) {
					lblResposta.setText("Menor de Idade");
				} else {
				
				lblResposta.setText(mensagem);
				}
			}
		});
		btnValidar.setBounds(163, 186, 89, 23);
		getContentPane().add(btnValidar);

	}
//	private void mostrarResultado()	{
//		String nome = txtNome.getText();
//		String idade = txtIdade.getText();	
//		lblResposta.setText(nome);
//	}
}
