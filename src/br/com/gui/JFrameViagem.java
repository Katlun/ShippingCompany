package br.com.gui;
import java.awt.GridLayout;
import br.com.gui.panel.JPanelCadastroViagens;
import br.com.gui.panel.JPanelBotoes;

public class JFrameViagem  extends javax.swing.JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public JFrameViagem() {
		setResizable(false);
		this.setTitle("CADASTRO DE VIAGENS.");
		this.setSize(750, 500);
		getContentPane().setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanelCadastroViagens panelCadastroViagens = new JPanelCadastroViagens();
		getContentPane().add(panelCadastroViagens);
		
		JPanelBotoes panelBotoes = new JPanelBotoes();
		getContentPane().add(panelBotoes);
		
		this.setVisible(true);
	}

	

	public static void main(String[] args) {
		
	}

}
