package br.com.ModelTable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.entidade.Tipo;

@SuppressWarnings("serial")
public class TabelaTipoCaminhao extends AbstractTableModel{
	
	private static final int COL_ID = 0;
	private static final int COL_DESCRICAO = 1;
	private static final int COL_PESO_SUPORT = 2;
	
	List<Tipo> linhas;
	private String[] colunas = new String[]{"I D ", "DESCRICAO","PESO SUPORTADO"};
	
	public TabelaTipoCaminhao(List<Tipo> caminhao) {
		this.linhas = new ArrayList<>(caminhao);
	}
	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return linhas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Tipo tc = linhas.get(rowIndex);
		if (columnIndex == COL_ID) {
			return tc.getId();
		} else if (columnIndex == COL_DESCRICAO) {
			return tc.getDescricao();
		} else if (columnIndex == COL_PESO_SUPORT) {
			return tc.getPesoMax();
		}
		return "";
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}
}
