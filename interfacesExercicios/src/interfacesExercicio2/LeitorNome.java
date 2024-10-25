package interfacesExercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LeitorNome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JLabel lblNome;
	private JLabel lblSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeitorNome frame = new LeitorNome();
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
	public LeitorNome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(25, 37, 201, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(25, 86, 201, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);

		JLabel lblNomeCompleto = new JLabel("");
		lblNomeCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCompleto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeCompleto.setBounds(81, 151, 201, 14);
		contentPane.add(lblNomeCompleto);
		
		JButton btnNome = new JButton("Mostrar Nome Completo");
		btnNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NomeCompleto = txtNome.getText() + " " + txtSobrenome.getText();
				lblNomeCompleto.setText(NomeCompleto);
			}
		});
		btnNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNome.setBounds(81, 117, 201, 23);
		contentPane.add(btnNome);		
		
		lblNome = new JLabel("Digite Seu Nome");
		lblNome.setBounds(10, 11, 136, 14);
		contentPane.add(lblNome);
		
		lblSobrenome = new JLabel("Digite seu Sobrenome");
		lblSobrenome.setBounds(10, 68, 136, 14);
		contentPane.add(lblSobrenome);
	}
}
