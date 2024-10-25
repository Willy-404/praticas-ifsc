package interfacesExercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fomelandia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtFieldPrecoDigitado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fomelandia frame = new Fomelandia();
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
	public Fomelandia() {
		setBounds(100, 100, 385, 380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Restaurante Fomelândia");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(89, 11, 181, 14);
		getContentPane().add(lblTitulo);
		
		JLabel lblValorDoQuilo = new JLabel("Valor do Quilo: R$9,95");
		lblValorDoQuilo.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorDoQuilo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorDoQuilo.setBounds(89, 51, 181, 14);
		getContentPane().add(lblValorDoQuilo);
		
		JLabel lblPesoPrato = new JLabel("Digite o Peso do Prato");
		lblPesoPrato.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoPrato.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPesoPrato.setBounds(89, 76, 181, 14);
		getContentPane().add(lblPesoPrato);
		
		txtFieldPrecoDigitado = new JTextField();
		txtFieldPrecoDigitado.setHorizontalAlignment(SwingConstants.CENTER);
		txtFieldPrecoDigitado.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtFieldPrecoDigitado.setBounds(135, 101, 86, 20);
		getContentPane().add(txtFieldPrecoDigitado);
		txtFieldPrecoDigitado.setColumns(10);
		
		JLabel lblValorPrato = new JLabel("");
		lblValorPrato.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorPrato.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorPrato.setBounds(89, 220, 181, 14);
		getContentPane().add(lblValorPrato);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float precoPagar = (float) (9.95 * (Float.valueOf(txtFieldPrecoDigitado.getText())));
				lblValorPrato.setText("Você irá pagar: "+precoPagar+"");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(135, 186, 86, 23);
		getContentPane().add(btnNewButton);

	}

}
