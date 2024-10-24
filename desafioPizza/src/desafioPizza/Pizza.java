package desafioPizza;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class Pizza extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		setBounds(100, 100, 546, 435);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		int valorPizza = 0;
		
		JLabel lblPizzaria = new JLabel("Willian & Willys: Pizzaria e Conveniência");
		lblPizzaria.setBounds(94, 11, 342, 20);
		lblPizzaria.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblPizzaria);
		
		JLabel lblSabores = new JLabel("Sabores de Pizza");
		lblSabores.setBounds(15, 60, 115, 17);
		lblSabores.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblSabores);
		
		JLabel lblBordaSemBorda = new JLabel("Borda");
		lblBordaSemBorda.setBounds(25, 226, 42, 17);
		lblBordaSemBorda.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblBordaSemBorda);
		
		JLabel lblTeleEntrega = new JLabel("Tele-Entrega");
		lblTeleEntrega.setBounds(15, 318, 89, 17);
		lblTeleEntrega.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblTeleEntrega);
		
		JLabel lblOpcionais = new JLabel("Opcionais");
		lblOpcionais.setBounds(294, 60, 66, 17);
		lblOpcionais.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblOpcionais);
		
		JCheckBox chckbxSabor1 = new JCheckBox("R$10 Peperoni");
		chckbxSabor1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSabor1.setBounds(21, 84, 136, 23);
		getContentPane().add(chckbxSabor1);
		
		JCheckBox chckbxSabor2 = new JCheckBox("R$10 Calabreso");
		chckbxSabor2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSabor2.setBounds(21, 110, 136, 23);
		getContentPane().add(chckbxSabor2);
		
		JCheckBox chckbxSabor3 = new JCheckBox("R$10 Margarina");
		chckbxSabor3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSabor3.setBounds(21, 136, 136, 23);
		getContentPane().add(chckbxSabor3);
		
		JCheckBox chckbxSabor4 = new JCheckBox("R$5 Dois-Queijos");
		chckbxSabor4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSabor4.setBounds(21, 162, 136, 23);
		getContentPane().add(chckbxSabor4);
		
		JCheckBox chckbxSabor5 = new JCheckBox("R$15 Pinhão");
		chckbxSabor5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSabor5.setBounds(21, 188, 136, 23);
		getContentPane().add(chckbxSabor5);
		
		JRadioButton rdbtnComBorda = new JRadioButton("R$10 Com Borda");
		rdbtnComBorda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnComBorda.setSelected(true);
		rdbtnComBorda.setBounds(15, 255, 142, 23);
		getContentPane().add(rdbtnComBorda);
		
		JRadioButton rdbtnSemBorda = new JRadioButton("R$5 Sem Borda");
		rdbtnSemBorda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnSemBorda.setBounds(15, 281, 142, 23);
		getContentPane().add(rdbtnSemBorda);
		
		
		
		ButtonGroup grupo = new ButtonGroup();	
		grupo.add(rdbtnComBorda);
		grupo.add(rdbtnSemBorda);
		if (rdbtnComBorda.isSelected()) {
			valorPizza+=10;
		}	else {
			valorPizza+=5;
		}
		
		JComboBox comboBoxTeleEntrega = new JComboBox();
		comboBoxTeleEntrega.setModel(new DefaultComboBoxModel(new String[] {"R$10 Tele  Entrega", "Retirada no Local"}));
		comboBoxTeleEntrega.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBoxTeleEntrega.setBounds(10, 346, 191, 28);
		getContentPane().add(comboBoxTeleEntrega);
		
		JCheckBox chOpcional1 = new JCheckBox("R$5 Bacon");
		chOpcional1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chOpcional1.setBounds(282, 84, 142, 23);
		getContentPane().add(chOpcional1);
		
		JCheckBox chOpcional2 = new JCheckBox("R$5 Batata-Frita");
		chOpcional2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chOpcional2.setBounds(282, 110, 142, 23);
		getContentPane().add(chOpcional2);
		
		JCheckBox chOpcional3 = new JCheckBox("R$5 Alho-Frito");
		chOpcional3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chOpcional3.setBounds(282, 136, 142, 23);
		getContentPane().add(chOpcional3);
		
		JCheckBox chOpcional4 = new JCheckBox("R$5 Chimarrão");
		chOpcional4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chOpcional4.setBounds(282, 162, 142, 23);
		getContentPane().add(chOpcional4);

		
		JLabel lblValorPizza = new JLabel("");
		lblValorPizza.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorPizza.setBounds(277, 318, 147, 23);
		getContentPane().add(lblValorPizza);		
		
		JButton btnNewButton = new JButton("Calcular Valor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contadorSabor = 0;
				int valorPizza = 0;
				if (chckbxSabor1.isSelected()) {
					contadorSabor +=1;
					valorPizza+=10;
				}
				if (chckbxSabor2.isSelected()) {
					contadorSabor +=1;
					valorPizza+=10;
				}
				if (chckbxSabor3.isSelected()) {
					contadorSabor +=1;
					valorPizza+=10;
				}
				if (chckbxSabor4.isSelected()) {
					contadorSabor +=1;
					valorPizza+=5;
				}
				if (chckbxSabor5.isSelected()) {
					contadorSabor +=1;
					valorPizza+=15;
				}
				
				if(rdbtnComBorda.isSelected()) {
					valorPizza+=10;
				}else {
					valorPizza+=5;
				}
				
				String opcaoSelecionada = (String) comboBoxTeleEntrega.getSelectedItem();
				if (opcaoSelecionada == "R$10 Tele  Entrega") {
					valorPizza+=10;
				}
				
				if (chOpcional1.isSelected()) {
					valorPizza+=5;
				}if (chOpcional2.isSelected()) {
					valorPizza+=5;
				}if (chOpcional3.isSelected()) {
					valorPizza+=5;
				}if (chOpcional4.isSelected()) {
					valorPizza+=5;
				}
				
				if (contadorSabor > 3||contadorSabor < 1) {
					JOptionPane.showMessageDialog(null, "Selecione no mínimo 1 e no máximo 3 Sabores");
				}else {
					lblValorPizza.setText("O Valor é R$"+valorPizza+",00");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(270, 272, 132, 39);
		getContentPane().add(btnNewButton);
		
		JLabel Icone1 = new JLabel("");
		Icone1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\praticas-ifsc-main\\desafioPizza\\Imagens\\esfinge.png"));
		Icone1.setBounds(435, 10, 31, 39);
		getContentPane().add(Icone1);
		
		JLabel Icone2 = new JLabel("");
		Icone2.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\praticas-ifsc-main\\desafioPizza\\Imagens\\esfingeC.png"));
		Icone2.setBounds(53, 10, 31, 39);
		getContentPane().add(Icone2);
		
	}
}
