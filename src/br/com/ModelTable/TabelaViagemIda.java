package br.com.ModelTable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.entidade.Viagem;

@SuppressWarnings("serial")
public class TabelaViagemIda extends AbstractTableModel{
	private static final int COL_ID = 0;
	private static final int COL_ID_CAMINHAO = 1;
	private static final int COL_QUANTIDADE = 2;
	private static final int COL_CUSTO = 3;
	private static final int COL_TEMPO = 4;
	private static final int COL_CIDADE = 5;
	private static final int COL_DATA = 6;
	
	List<Viagem> linhas;
	private String[] colunas = new String[]{"ID VIDA", "ID CAMINHAO", "L I T R O", "CUSTO COMBUST�VEL","T E M P O","C I D A D E","DATA DE IDA"};
	
	public TabelaViagemIda(List<Viagem> viagemida) {
		this.linhas = new ArrayList<>(viagemida);
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
		Viagem vi = linhas.get(rowIndex);
		if (columnIndex == COL_ID) {
			return vi.getIdIda();
		} else if (columnIndex == COL_ID_CAMINHAO) {
			return vi.getIdCaminhao();
		} else if (columnIndex == COL_QUANTIDADE) {
			return vi.getQtdLitro();
		} else if (columnIndex == COL_CUSTO) {
			return vi.getCustoComb();
		} else if (columnIndex == COL_TEMPO){
			return vi.getTempoIda();
		} else if(columnIndex == COL_CIDADE){
			return vi.getCidadeIda();
		} else if(columnIndex == COL_DATA){
			return vi.getData();
		}
		return "";
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}
}