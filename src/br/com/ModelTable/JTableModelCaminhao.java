package br.com.ModelTable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.entidade.Caminhao;

@SuppressWarnings("serial")
public class JTableModelCaminhao extends AbstractTableModel{
	
	private static final int COL_ID = 0;
	private static final int COL_TIPO = 1;
	private static final int COL_CODIGO = 2;
	private static final int COL_MARCA = 3;
	private static final int COL_MODELO = 4;
	private static final int COL_COR = 5;
	private static final int COL_COMBUSTIVEL = 6;
	private static final int COL_PORTAS = 7;
	private static final int COL_CAMBIO = 8;
	private static final int COL_CARROCERIA = 9;
	private static final int COL_COMPRIMENTO = 10;
	private static final int COL_ESTADO = 11;
	private static final int COL_CARGA = 12;
	private static final int COL_PLACA = 13;	
	
	List<Caminhao> linhas;
	private String[] colunas = new String[]{"ID","TIPO DE CAMINHAO","CODIGO","MARCA","MODELO","COR","COMBUSTIVEL","PORTAS","CAMBIO","CARROCERIA","COMPRIMENTO","ESTADO","CARGA","PLACA"};
	
	public JTableModelCaminhao(List<Caminhao> caminhao) {
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
		Caminhao caminhao = linhas.get(rowIndex);
		if (columnIndex == COL_ID) {
			return caminhao.getId();
		} else if(columnIndex == COL_TIPO){
			return caminhao.getTipoCaminhao();
		} else if(columnIndex == COL_CODIGO){
			return caminhao.getCodigo();
		} else if(columnIndex == COL_MARCA){
			return caminhao.getMarca();
		} else if(columnIndex == COL_MODELO){
			return caminhao.getModelo();
		} else if(columnIndex == COL_COR){
			return caminhao.getCor();
		} else if(columnIndex == COL_COMBUSTIVEL){
			return caminhao.getCombustivel();
		} else if(columnIndex == COL_PORTAS){
			return caminhao.getPortas();
		} else if(columnIndex == COL_CAMBIO){
			return caminhao.getCambio();
		} else if(columnIndex == COL_CARROCERIA){
			return caminhao.getCarroceria();
		} else if(columnIndex == COL_COMPRIMENTO){
			return caminhao.getComprimento();
		} else if(columnIndex == COL_ESTADO){
			return caminhao.getEstado();
		} else if(columnIndex == COL_CARGA){
			return caminhao.getCarga();
		} else if(columnIndex == COL_PLACA){
			return caminhao.getPlaca();
		}
		return "";
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}
}
