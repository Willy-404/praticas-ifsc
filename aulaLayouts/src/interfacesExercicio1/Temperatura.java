package interfacesExercicio1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Temperatura extends JFrame {
	private JLabel lblTexto1;
	private JTextField textTempFahrenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatura frame = new Temperatura();
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
	public Temperatura() {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblTexto1 = new JLabel(" Digite uma Temperatura em Fahrenheit para converte-la");
		lblTexto1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTexto1.setBounds(22, 11, 388, 21);
		getContentPane().add(lblTexto1);
		
		JLabel lblTexto1_1 = new JLabel("em Celsius");
		lblTexto1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTexto1_1.setBounds(22, 27, 168, 27);
		getContentPane().add(lblTexto1_1);
		
		textTempFahrenheit = new JTextField();
		textTempFahrenheit.setFont(new Font("Tahoma", Font.BOLD, 12));
		textTempFahrenheit.setBounds(22, 65, 145, 20);
		getContentPane().add(textTempFahrenheit);
		textTempFahrenheit.setColumns(10);
		
		JLabel lblTexto2 = new JLabel(" A temperatura em Celsius é:");
		lblTexto2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTexto2.setBounds(22, 96, 214, 14);
		getContentPane().add(lblTexto2);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultado.setBounds(22, 121, 145, 21);
		getContentPane().add(lblResultado);
		
		JButton btnBotaoCalcular = new JButton("Calcular");
		btnBotaoCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Double temperaturaF = Double.parseDouble(textTempFahrenheit.getText());
				CalculoTemperatura calc = new CalculoTemperatura();
				Double temperaturaC = calc.calcularTemperatura(temperaturaF);
				lblResultado.setText(String.format("%.2f",temperaturaC));
				} catch(NumberFormatException erro){
					JOptionPane.showMessageDialog(null,"Por favor, insira um"
							+ " numero valido","Atenção",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnBotaoCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBotaoCalcular.setBounds(159, 198, 89, 23);
		getContentPane().add(btnBotaoCalcular);
		

	}
}
