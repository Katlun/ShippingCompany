package br.com.ModelTable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.entidade.VIAGEMVOLTA;

@SuppressWarnings("serial")
public class TabelaViagemVolta extends AbstractTableModel{
	private static final int COL_ID = 0;
	private static final int COL_ID_CAMINHAO = 1;
	private static final int COL_QUANTIDADE = 2;
	private static final int COL_CUSTO = 3;
	private static final int COL_TEMPO = 4;
	private static final int COL_CIDADE = 5;
	private static final int COL_DATA = 6;
	
	List<VIAGEMVOLTA> linhas;
	private String[] colunas = new String[]{"ID VOLTA", "ID CAMINHAO", "L I T R O", "CUSTO COMBUST�VEL","T E M P O","C I D A D E","DATA RETORNO"};
	
	public TabelaViagemVolta(List<VIAGEMVOLTA> viagemida) {
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
		VIAGEMVOLTA vV = linhas.get(rowIndex);
		if (columnIndex == COL_ID) {
			return vV.getIdVolta();
		} else if (columnIndex == COL_ID_CAMINHAO) {
			return vV.getIdCaminhao();
		} else if (columnIndex == COL_QUANTIDADE) {
			return vV.getQtdLitro();
		} else if (columnIndex == COL_CUSTO) {
			return vV.getCustoComb();
		} else if (columnIndex == COL_TEMPO){
			return vV.getTempoVolta();
		} else if(columnIndex == COL_CIDADE){
			return vV.getCidadeVolta();
		} else if(columnIndex == COL_DATA){
			return	vV.getData();
		}
		return "";
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}
}