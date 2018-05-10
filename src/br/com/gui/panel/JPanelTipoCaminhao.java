package br.com.gui.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JPanelTipoCaminhao extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public JPanelTipoCaminhao() {
		this.setSize(760, 150);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("TIPOS DE CAMINHAO");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(10, 11, 150, 20);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDescricao = new JLabel("DESCRICAO");
		lblDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblDescricao, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(170, 11, 207, 20);
		panel_1.add(textField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(10, 42, 150, 20);
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPeso = new JLabel("PESO");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblPeso, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(211, 211, 211));
		panel_4.setBounds(387, 11, 150, 20);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLitrosPorKm = new JLabel("LITROS POR KM");
		lblLitrosPorKm.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblLitrosPorKm, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(211, 211, 211));
		panel_5.setBounds(387, 42, 150, 20);
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblStatus, BorderLayout.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(170, 42, 207, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(547, 11, 207, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(547, 42, 207, 20);
		panel_1.add(textField_3);
	}

}
