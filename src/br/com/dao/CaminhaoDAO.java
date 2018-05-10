package br.com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import br.com.entidade.Caminhao;
import br.com.enumeracao.ESTADO;
import br.com.jdbc.Persistencia;

public class CaminhaoDAO {
	
	Persistencia persistencia;
	private final String INSERT = "INSERT INTO CAMINHAO (TIPO_CAMINHAO,TIPO_CARGA,ESTADO_CAMINHAO) VALUES(?,?,?);";
	private final String SELECT = "SELECT * FROM CAMINHAO";
	private final String SELECTCOD = "SELECT CODIGO FROM CAMINHAO";
	
	public CaminhaoDAO() {
		this.persistencia = new Persistencia();
	}
	
	
	public void insert(Caminhao caminhao){
		PreparedStatement pstm = null;
		try {
			pstm = persistencia.getConection().prepareStatement(INSERT);
			
			pstm.execute();
			
			JOptionPane.showMessageDialog(null,"Caminhao cadastrado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			persistencia.fecharConexao();
		}	
	}
	
	/*
	 * 
	 * @return
	 */
	public List<Caminhao> getCodCaminhao(){
		ArrayList<Caminhao> caminhoes = new ArrayList<>();
		PreparedStatement pstm 		  = null;
		ResultSet rs 				  = null;
		try {
			pstm = persistencia.getConection().prepareStatement(SELECTCOD);
			rs = pstm.executeQuery();
			while(rs.next()){
				Caminhao caminhao = new Caminhao();
				caminhao.setCodigo(rs.getString("CODIGO"));
				caminhoes.add(caminhao);
			}
		} catch (SQLException e) {
			System.err.println("Erro ao buscar codigos de caminhoes.");
			e.printStackTrace();
		} finally {
			persistencia.fecharConexao();
		}
		return caminhoes;
	}
	
	
	public ArrayList<Caminhao> getList(){
		ArrayList<Caminhao> camlist = new ArrayList<>();
		PreparedStatement pstm      = null;
		ResultSet rs                = null;
		try {
			pstm = persistencia.getConection().prepareStatement(SELECT);
			rs = pstm.executeQuery();
			while(rs.next()){
				Caminhao cam = new Caminhao();
				cam.setId(rs.getInt("ID"));
				cam.setTipoCaminhao(rs.getInt("ID_TIPOCAMINHAO"));
				cam.setCodigo(rs.getString("CODIGO"));
				cam.setMarca(rs.getString("MARCA"));
				cam.setModelo(rs.getString("MODELO"));
				cam.setCor(rs.getString("COR"));
				cam.setCombustivel(rs.getString("COMBUSTIVEL"));
				cam.setPortas(rs.getInt("PORTAS"));
				cam.setCarga(rs.getString("CARGA"));
				cam.setCambio(rs.getString("CAMBIO"));
				cam.setCarroceria(rs.getString("CARROCERIA"));
				cam.setPlaca(rs.getString("PLACA"));
				cam.setComprimento(Double.parseDouble(rs.getString("COMPRIMENTO")));
				cam.setEstado(ESTADO.valueOf(rs.getString("ESTADO_CAMINHAO")));
				camlist.add(cam);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			persistencia.fecharConexao();
		}
		return camlist;
	}
	
	public static void main(String[] args) {
		Caminhao cam = new Caminhao();
		
		cam.setTipoCaminhao(1);
		cam.setCarga("PERECIVEL");
		cam.setEstado(ESTADO.PARADO);
		new CaminhaoDAO().insert(cam);
		new CaminhaoDAO().getList();
	}
}
