package br.com.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.com.ModelTable.TabelaTipoCaminhao;
import br.com.dao.TipoDAO;
import br.com.entidade.Tipo;

public class JListTipoCaminhao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel painelFundo;
	private JPanel painelBotoes;
	private static JTable tabela;
	private JScrollPane barraRolagem;
	private JButton btInserir;
	private JButton btExcluir;
	private JButton btEditar;
	
	private TabelaTipoCaminhao modelo;
	static List<Tipo> lista;
	

	public JListTipoCaminhao() {
		super("TABELA DE CAMINHOES");
		criaJTable();
		criaJanela();
	}
	
	public void criaJanela() {
		btInserir = new JButton("Inserir");
		btExcluir = new JButton("Excluir");
		btEditar = new JButton("Editar");
		
		painelBotoes = new JPanel();
		barraRolagem = new JScrollPane(tabela);
		painelFundo = new JPanel();
		painelFundo.setLayout(new BorderLayout());
		painelFundo.add(BorderLayout.CENTER, barraRolagem);
		painelBotoes.add(btInserir);
		painelBotoes.add(btEditar);
		painelBotoes.add(btExcluir);
		painelFundo.add(BorderLayout.SOUTH, painelBotoes);
		getContentPane().add(painelFundo);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(543, 375);
		setVisible(true);
		btInserir.addActionListener(new BtInserirListener());
		btEditar.addActionListener(new BtEditarListener());
		btExcluir.addActionListener(new BtExcluirListener());
	}
	private void criaJTable() {
		tabela = new JTable(modelo);
		pesquisar();
	}
	public void pesquisar() {
		TipoDAO caminhao = new TipoDAO();
		lista = caminhao.getList();
		modelo = new TabelaTipoCaminhao(lista);
		tabela.setModel(modelo);
	}
	
	
	
	private class BtInserirListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
		}
	}

	private class BtEditarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			}
		}

	private class BtExcluirListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
		}
	}

	public static void main(String[] args) {
		try {
			JListTipoCaminhao frame = new JListTipoCaminhao();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
