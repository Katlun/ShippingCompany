package br.com.gui.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;

import br.com.dao.CaminhaoDAO;
import br.com.entidade.Caminhao;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;

public class JPanelCadastroViagens extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public JPanelCadastroViagens() {
		this.setSize(720, 300);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE VIAGENS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(20, 91, 150, 20);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMotorista = new JLabel("MOTORISTA");
		lblMotorista.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblMotorista, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(180, 91, 207, 20);
		panel_1.add(textField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "VIAGEM", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 11, 377, 56);
		panel_1.add(panel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("IDA");
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("VOLTA");
		panel_3.add(chckbxNewCheckBox_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(211, 211, 211));
		panel_4.setBounds(20, 122, 150, 20);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCaminhao = new JLabel("CAMINHAO");
		panel_4.add(lblCaminhao, BorderLayout.CENTER);
		lblCaminhao.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		CaminhaoDAO dao = new CaminhaoDAO();
		for(Caminhao c: dao.getCodCaminhao()){
			comboBox.addItem(c.getCodigo());
		}
		comboBox.setBounds(180, 122, 207, 20);
		panel_1.add(comboBox);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(211, 211, 211));
		panel_5.setBounds(397, 11, 150, 20);
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataHora = new JLabel("DATA / HORA DE SAIDA");
		lblDataHora.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblDataHora, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(211, 211, 211));
		panel_6.setBounds(560, 11, 150, 20);
		panel_1.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataHora_1 = new JLabel("DATA / HORA DE CHEGADA ");
		lblDataHora_1.setToolTipText("Horario Previsto de Chegada");
		lblDataHora_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblDataHora_1, BorderLayout.CENTER);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(397, 42, 60, 20);
		panel_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(467, 42, 80, 20);
		panel_1.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(560, 42, 60, 20);
		panel_1.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(630, 42, 80, 20);
		panel_1.add(spinner_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(211, 211, 211));
		panel_8.setBounds(20, 153, 150, 20);
		panel_1.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblEstado, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(211, 211, 211));
		panel_7.setBounds(20, 184, 150, 20);
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCidade = new JLabel("CIDADE");
		lblCidade.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblCidade, BorderLayout.CENTER);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(180, 153, 207, 20);
		panel_1.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 184, 207, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(211, 211, 211));
		panel_9.setBounds(397, 91, 150, 20);
		panel_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKmInicial = new JLabel("KM INICIAL");
		lblKmInicial.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblKmInicial, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(211, 211, 211));
		panel_10.setBounds(397, 122, 150, 20);
		panel_1.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKmFinal = new JLabel("KM FINAL");
		lblKmFinal.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblKmFinal, BorderLayout.CENTER);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(560, 91, 150, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(560, 122, 150, 20);
		panel_1.add(textField_3);
	}
}
