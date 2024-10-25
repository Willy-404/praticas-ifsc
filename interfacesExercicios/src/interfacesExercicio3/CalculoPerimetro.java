package interfacesExercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculoPerimetro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JButton btnCalcular;
	private JLabel lblPerimetro;
	private JLabel lblArea;
	private JLabel lblResultadoPerimetro;
	private JLabel lblResultadoArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoPerimetro frame = new CalculoPerimetro();
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
	public CalculoPerimetro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 242, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Digite a Base do Retangulo");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBase.setBounds(23, 11, 194, 14);
		contentPane.add(lblBase);
		
		txtBase = new JTextField();
		txtBase.setBounds(65, 39, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		JLabel lblAltura = new JLabel("Digite a Altura do Retangulo");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAltura.setBounds(23, 60, 194, 14);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(62, 85, 89, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		lblPerimetro = new JLabel("Perimetro");
		lblPerimetro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPerimetro.setBounds(23, 173, 60, 14);
		contentPane.add(lblPerimetro);
		
		lblArea = new JLabel("Area");
		lblArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblArea.setBounds(151, 173, 46, 14);
		contentPane.add(lblArea);
		
		lblResultadoPerimetro = new JLabel("");
		lblResultadoPerimetro.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoPerimetro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultadoPerimetro.setBounds(23, 198, 60, 14);
		contentPane.add(lblResultadoPerimetro);
		
		lblResultadoArea = new JLabel("");
		lblResultadoArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultadoArea.setBounds(137, 198, 60, 14);
		contentPane.add(lblResultadoArea);
		
		btnCalcular = new JButton("Calcular\r\n");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double base = Double.parseDouble(txtBase.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				Retangulo calc = new Retangulo();
				double resultadoPerimetro = calc.calcularPerimetro(base,altura);
				lblResultadoPerimetro.setText(String.valueOf(resultadoPerimetro));
				
				double resultadoArea = calc.calcularArea(base,altura);
				lblResultadoArea.setText(String.valueOf(resultadoArea));
				} catch(NumberFormatException erro){
					JOptionPane.showMessageDialog(null,"Por favor, insira numeros validos","Atenção",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBounds(62, 132, 89, 30);
		contentPane.add(btnCalcular);
	}

}
