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
import javax.swing.JRadioButton;

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
		
		JLabel lblPizzaria = new JLabel("Presuntos: Pizzaria e Funerária");
		lblPizzaria.setBounds(136, 11, 256, 20);
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
		chckbxSabor1.setBounds(21, 84, 136, 23);
		getContentPane().add(chckbxSabor1);
		if (chckbxSabor1.isSelected()) {
			valorPizza+=10;
		}
		
		JCheckBox chckbxSabor2 = new JCheckBox("R$10 Calabreso");
		chckbxSabor2.setBounds(21, 110, 136, 23);
		getContentPane().add(chckbxSabor2);
		if (chckbxSabor2.isSelected()) {
			valorPizza+=10;
		}
		
		JCheckBox chckbxSabor3 = new JCheckBox("R$10 Margarina");
		chckbxSabor3.setBounds(21, 136, 136, 23);
		getContentPane().add(chckbxSabor3);
		if (chckbxSabor3.isSelected()) {
			valorPizza+=10;
		}
		
		JCheckBox chckbxSabor4 = new JCheckBox("R$5 Dois-Queijos");
		chckbxSabor4.setBounds(21, 162, 136, 23);
		getContentPane().add(chckbxSabor4);
		if (chckbxSabor4.isSelected()) {
			valorPizza+=10;
		}
		
		JCheckBox chckbxSabor5 = new JCheckBox("R$5 Pinhão");
		chckbxSabor5.setBounds(21, 188, 136, 23);
		getContentPane().add(chckbxSabor5);
		if (chckbxSabor1.isSelected()) {
			valorPizza+=10;
		}		
		
		JRadioButton rdbtnComBorda = new JRadioButton("R$10 Com Borda");
		rdbtnComBorda.setSelected(true);
		rdbtnComBorda.setBounds(15, 255, 142, 23);
		getContentPane().add(rdbtnComBorda);
		
		JRadioButton rdbtnSemBorda = new JRadioButton("R$5 Sem Borda");
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
		comboBoxTeleEntrega.setModel(new DefaultComboBoxModel(new String[] {"R$5 Tele  Entrega", "R$5 Retirada no Local"}));
		comboBoxTeleEntrega.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBoxTeleEntrega.setBounds(10, 346, 191, 28);
		getContentPane().add(comboBoxTeleEntrega);
		
		JCheckBox chckbxOpcional1 = new JCheckBox("R$5 Bacon");
		chckbxOpcional1.setBounds(282, 84, 142, 23);
		getContentPane().add(chckbxOpcional1);
		
		JCheckBox chckbxOpcional2 = new JCheckBox("R$5 Batata-Frita");
		chckbxOpcional2.setBounds(282, 110, 142, 23);
		getContentPane().add(chckbxOpcional2);
		
		JCheckBox chckbxOpcional3 = new JCheckBox("R$5 Alho-Frito");
		chckbxOpcional3.setBounds(282, 136, 142, 23);
		getContentPane().add(chckbxOpcional3);
		
		JCheckBox chckbxOpcional4 = new JCheckBox("R$5 Chimarrão");
		chckbxOpcional4.setBounds(282, 162, 142, 23);
		getContentPane().add(chckbxOpcional4);

		
		JLabel lblValorPizza = new JLabel("");
		lblValorPizza.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorPizza.setBounds(270, 321, 147, 23);
		getContentPane().add(lblValorPizza);		
		
		JButton btnNewButton = new JButton("Calcular Valor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(270, 272, 132, 39);
		getContentPane().add(btnNewButton);
		
	}
	
}
