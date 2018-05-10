package br.com.gui;

import java.awt.GridLayout;
import br.com.gui.panel.JPanelDadosCaminhao;
import br.com.gui.panel.JPanelTipoCaminhao;
import br.com.gui.panel.JPanelBotoes;

public class JFrameCadastro extends javax.swing.JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public JFrameCadastro() {
		this.setTitle("CADASTRO DE CAMINHOES.");
		this.setSize(800, 500);
		
		this.getContentPane().setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanelDadosCaminhao panelDadosCaminhao = new JPanelDadosCaminhao();
		getContentPane().add(panelDadosCaminhao);
		
		JPanelTipoCaminhao panelTipoCaminhao = new JPanelTipoCaminhao();
		getContentPane().add(panelTipoCaminhao);
		
		JPanelBotoes panelBotoes = new JPanelBotoes();
		getContentPane().add(panelBotoes);
		this.setVisible(true);
	}

	

	
	
	public static void main(String[] args) {
		new JFrameCadastro();
	}

}
