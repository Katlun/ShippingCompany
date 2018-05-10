package br.com.gui.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import br.com.dao.TipoDAO;
import br.com.entidade.Tipo;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;

public class JPanelDadosCaminhao extends JPanel{

	private static final long serialVersionUID = 1L;
	//campos de texto
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	
	//Labels
	
	//paineis
	
	public JPanelDadosCaminhao() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel(" DADOS DE CAMINHAO");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(10, 11, 150, 20);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("MARCA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(10, 42, 150, 20);
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblModelo = new JLabel("MODELO");
		lblModelo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblModelo, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(211, 211, 211));
		panel_4.setBounds(10, 73, 150, 20);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCor = new JLabel("COR");
		lblCor.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblCor, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(211, 211, 211));
		panel_5.setBounds(10, 104, 150, 20);
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCombustivel = new JLabel("COMBUSTIVEL");
		lblCombustivel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblCombustivel, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(211, 211, 211));
		panel_6.setBounds(10, 135, 150, 20);
		panel_1.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPortas = new JLabel("PORTAS");
		lblPortas.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblPortas, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(211, 211, 211));
		panel_7.setBounds(387, 11, 150, 20);
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblComboio = new JLabel("CAMBIO");
		lblComboio.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblComboio, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(211, 211, 211));
		panel_8.setBounds(387, 42, 150, 20);
		panel_1.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("CARROCERIA");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(211, 211, 211));
		panel_9.setBounds(387, 73, 150, 20);
		panel_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("PLACA");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_3, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(211, 211, 211));
		panel_10.setBounds(387, 104, 150, 20);
		panel_1.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("COMPRIMENTO");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_4, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setBounds(170, 11, 207, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(170, 42, 207, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		textField_2.setBounds(170, 73, 207, 20);
		panel_1.add(textField_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(545, 42, 207, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(545, 73, 207, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(545, 104, 207, 20);
		panel_1.add(textField_8);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(211, 211, 211));
		panel_11.setBounds(387, 135, 150, 20);
		panel_1.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblEstado, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(211, 211, 211));
		panel_12.setBounds(10, 166, 150, 20);
		panel_1.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCarga = new JLabel("CARGA");
		lblCarga.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblCarga, BorderLayout.CENTER);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(170, 166, 207, 20);
		panel_1.add(textField_10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(211, 211, 211));
		panel_13.setBounds(387, 166, 150, 20);
		panel_1.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTipoDeCaminhao = new JLabel("TIPO DE CAMINHAO");
		lblTipoDeCaminhao.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblTipoDeCaminhao, BorderLayout.CENTER);
		
		TipoDAO tipodao = new TipoDAO();
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("SELECIONE");
		for(Tipo t : tipodao.getTipoDescricao()){
			comboBox.addItem(t.getDescricao());
		}
		comboBox.addItem("NOVO");
		comboBox.setBounds(545, 166, 207, 20);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECIONE", "MANUAL", "AUTOMATICO"}));
		comboBox_1.setBounds(547, 11, 205, 20);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"SELECIONE", "DIESEL", "ETANOL", "GASOLINA", "GAS", "ELETRICO"}));
		comboBox_2.setBounds(170, 104, 207, 20);
		panel_1.add(comboBox_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(170, 135, 207, 20);
		panel_1.add(spinner);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"SELECIONE", "PARADO", "EM VIAGEM"}));
		comboBox_3.setBounds(545, 135, 207, 20);
		panel_1.add(comboBox_3);
	}
}
