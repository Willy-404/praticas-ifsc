package aulaLayouts;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Layout extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout frame = new Layout();
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
	public Layout() {
		setBounds(100, 100, 536, 460);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblAnahita = new JLabel("");
		lblAnahita.setBounds(235, 168, 24, 24);
		lblAnahita.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Anahita2.png"));
		getContentPane().add(lblAnahita);

		
		JLabel lblResultadoCidade = new JLabel("");
		lblResultadoCidade.setBounds(305, 78, 205, 37);
		getContentPane().add(lblResultadoCidade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Blumenau", "Gaspar", "Florianopolis", "Calmon"}));
		comboBox.setBounds(378, 11, 109, 22);
		getContentPane().add(comboBox);
		
		JButton btnMostrar = new JButton("Mostrar Seleção");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcaoSelecionada = (String) comboBox.getSelectedItem();
				lblResultadoCidade.setText("Você escolheu: "+opcaoSelecionada);
				
			}
		});
		btnMostrar.setBounds(378, 44, 109, 23);
		getContentPane().add(btnMostrar);
		
		JCheckBox chk1 = new JCheckBox("Laranja");
		chk1.setBounds(20, 34, 97, 23);
		getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("Goiaba");
		chk2.setBounds(20, 65, 97, 23);
		getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("Melancia");
		chk3.setBounds(20, 91, 97, 23);
		getContentPane().add(chk3);
		
		JButton lblValidarFruta = new JButton("Validar");
		lblValidarFruta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "";
				if (chk1.isSelected()) {
					mensagem = chk1.getText() + " ";
				}
				if (chk2.isSelected()) {
					mensagem += chk2.getText() + " ";
				}
				if (chk3.isSelected()) {
					mensagem += chk3.getText();
				}
				JOptionPane.showMessageDialog(null,mensagem);
			}
		});
		lblValidarFruta.setBounds(123, 65, 89, 23);
		getContentPane().add(lblValidarFruta);
		
		JRadioButton rb1 = new JRadioButton("Opção1");
		rb1.setBounds(20, 180, 109, 23);
		getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Opção 2");
		rb2.setBounds(20, 206, 109, 23);
		getContentPane().add(rb2);
		
		ButtonGroup grupo = new ButtonGroup();	
		grupo.add(rb1);
		grupo.add(rb2);
		
		JButton btnTestarRb = new JButton("TestarRB");
		btnTestarRb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "Nenhum Botão Selecionado";
				if(rb1.isSelected()) {
					mensagem = "Botão1 selecionado";
				}
				if(rb2.isSelected()) {
					mensagem = "Botão2 selecionado";	
				}
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		btnTestarRb.setBounds(20, 236, 89, 23);
		getContentPane().add(btnTestarRb);
	}
}
