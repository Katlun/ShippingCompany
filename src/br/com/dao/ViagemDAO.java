package br.com.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.com.entidade.Viagem;
import br.com.jdbc.Persistencia;

public class ViagemDAO {
	
	Persistencia persistencia;
	
	private final String INSERT = "INSERT INTO VIAGEM(ID_CAMINHAO,TIPO,MOTORISTA,KM_INICIAL,KM_FINAL,CIDADE,ESTADO,CUSTO_COMBUSTIVEL,DATA_SAIDA"
	+ ",HORA_SAIDA,DATA_CHEGADA,HORA_CHEGADA) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	private final String SELECT = "SELECT * FROM VIAGEM";
	
	
	public ViagemDAO() {
		this.persistencia = new Persistencia();
	}
	
	public void insert(Viagem viagem){
		PreparedStatement pstm = null;
		try {
			pstm = persistencia.getConection().prepareStatement(INSERT);
			pstm.setInt(2, viagem.getIdCaminhao());
			pstm.setString(3, viagem.getTipoViagem());
			pstm.setString(4, viagem.getMotorista());
			pstm.setInt(5, viagem.getKmInicial());
			pstm.setInt(6, viagem.getKmFinal());
			pstm.setString(7, viagem.getCidade());
			pstm.setString(8, viagem.getEstado().toString());
			pstm.setDouble(9, viagem.getCustoCombustivel());
			pstm.setInt(10, viagem.getDataSaida());
			pstm.setInt(11, viagem.getHoraSaida());
			pstm.setInt(12, viagem.getDataChegada());
			pstm.setInt(13, viagem.getHoraChegada());
			pstm.execute();
			
			JOptionPane.showMessageDialog(null,"Viagem de volta cadastrada!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Erro ao realizar cadastro de viagem");
		} finally {
			persistencia.fecharConexao();
		}	
	}
	
	public ArrayList<Viagem> getList(){
		ArrayList<Viagem> viagens = new ArrayList<>();
		PreparedStatement pstm      = null;
		ResultSet rs                = null;
		try {
			pstm = persistencia.getConection().prepareStatement(SELECT);
			rs = pstm.executeQuery();
			while(rs.next()){
				Viagem viagem = new Viagem();
				viagem.setId(rs.getInt("ID"));
				viagem.setIdCaminhao(rs.getInt("ID_CAMINHAO"));
				viagem.setTipoViagem(rs.getString("TIPO"));
				viagem.setMotorista(rs.getString("MOTORISTA"));
				viagem.setKmInicial(rs.getInt("KM_INICIAL"));
				viagem.setKmFinal(rs.getInt("KM_FINAL"));
				viagem.setCidade(rs.getString("CIDADE"));
				viagem.setEstado(rs.getString("ESTADO"));
				viagem.setCustoCombustivel(rs.getDouble("CUSTO_COMBUSTIVEL"));
				viagem.setDataSaida(rs.getInt("DATA_SAIDA"));
				viagem.setHoraSaida(rs.getInt("HORA_SAIDA"));
				viagem.setDataChegada(rs.getInt("DATA_CHEGADA"));
				viagem.setHoraChegada(rs.getInt("HORA_CHEGADA"));
				viagens.add(viagem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Erro ao listar viagens.");
		} finally {
			persistencia.fecharConexao();
		}
		return viagens;
	}
	
}
