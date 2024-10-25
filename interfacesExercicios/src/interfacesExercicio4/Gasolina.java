package interfacesExercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gasolina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gasolina frame = new Gasolina();
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
	public Gasolina() {
		setBounds(100, 100, 255, 206);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblQuantidade = new JLabel("Preço do litro: R$5");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantidade.setBounds(63, 27, 139, 14);
		getContentPane().add(lblQuantidade);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtValor.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor.setBounds(76, 52, 92, 20);
		getContentPane().add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float quantidade = Float.valueOf(txtValor.getText());
				float quantidadeAbastecida = quantidade *5;
				JOptionPane.showMessageDialog(null,"Você pode abastecer R$"+quantidadeAbastecida+"0 Reais");
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBounds(76, 83, 92, 23);
		getContentPane().add(btnCalcular);
		
		JLabel lblQuantosReaisDeseja = new JLabel("Quantos reais deseja abastecer?");
		lblQuantosReaisDeseja.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantosReaisDeseja.setBounds(20, 11, 201, 14);
		getContentPane().add(lblQuantosReaisDeseja);

	}

}
