package br.com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.entidade.Tipo;
import br.com.jdbc.Persistencia;

public class TipoDAO {
	
	Persistencia persistencia = new Persistencia();
	private final String INSERT = "INSERT INTO TIPO_CAMINHAO(DESCRICAO,PESO_MAXIMO_SUPORTADO) VALUES (?,?);";
	private final String SELECT = "SELECT * FROM TIPO_CAMINHAO;";
	private final String SELECTTIPO = "SELECT DESCRICAO FROM TIPO_CAMINHAO";
	
	
	public void insert(Tipo tipoCaminhao){
		PreparedStatement pstm = null;
		try {
			pstm = persistencia.getConection().prepareStatement(INSERT);
			pstm.setString(1,tipoCaminhao.getDescricao());
			pstm.setDouble(2, tipoCaminhao.getPesoMax());
			pstm.execute();
			
			JOptionPane.showMessageDialog(null,"Tipo de Caminhao cadastrado!");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Tipo> getTipoDescricao(){
		ArrayList<Tipo> tipos  = new ArrayList<>();
		PreparedStatement pstm = null;
		ResultSet rs 		   = null;
		try {
			pstm = persistencia.getConection().prepareStatement(SELECTTIPO);
			rs = pstm.executeQuery();
			while(rs.next()){
				Tipo tipo = new Tipo();
				tipo.setDescricao(rs.getString("DESCRICAO"));
				tipos.add(tipo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Erro ao buscar lista de tipos de caminhao.");
		} finally {
			persistencia.fecharConexao();
		}
		return tipos;
	}
	
	
	
	
	public ArrayList<Tipo> getList(){
		ArrayList<Tipo> tipolist = new ArrayList<>();
		PreparedStatement pstm      = null;
		ResultSet rs                = null;
		try {
			pstm = persistencia.getConection().prepareStatement(SELECT);
			rs = pstm.executeQuery();
			while(rs.next()){
				Tipo cam = new Tipo();
				cam.setId(rs.getInt("ID"));
				cam.setDescricao(rs.getString("DESCRICAO"));
				cam.setPesoMax(rs.getDouble("PESO_MAXIMO_SUPORTADO"));
				
				tipolist.add(cam);
				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return tipolist;
	}
	public static void main(String[] args) {
		Tipo tc = new Tipo();
		
		tc.setDescricao("TOCO");
		tc.setPesoMax(230);
		new TipoDAO().insert(tc);
		new TipoDAO().getList();
	}
}
