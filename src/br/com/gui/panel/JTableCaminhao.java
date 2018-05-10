package br.com.gui.panel;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import br.com.ModelTable.JTableModelCaminhao;
import br.com.dao.CaminhaoDAO;
import br.com.entidade.Caminhao;

public class JTableCaminhao extends JPanel{

	private static final long serialVersionUID = 1L;
	public static List<Caminhao> caminhoes;
	private static JTable table;
	private JTableModelCaminhao modelo;
	private JScrollPane scroll;
	
	public JTableCaminhao() {
		this.setSize(800, 500);
		GridLayout layout = new GridLayout();
		layout.setColumns(1);
		layout.setRows(1);
		this.setLayout(layout);
		criarJTable();
		criarScrolPane();
		this.setVisible(true);
	}
	
	public void criarScrolPane(){
		scroll = new JScrollPane(table);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(scroll);
	}
	
	public void criarJTable(){
		table = new JTable(modelo);
		table.setFillsViewportHeight(true);
		table.setFont(new Font("consolas", Font.PLAIN, 11));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		pesquisar();
	}
	
	public void pesquisar(){
		CaminhaoDAO dao = new CaminhaoDAO();
		caminhoes = dao.getList();
		modelo = new JTableModelCaminhao(caminhoes);
		table.setModel(modelo);
	}
	
	
}
