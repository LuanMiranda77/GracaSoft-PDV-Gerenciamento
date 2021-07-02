package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.InterFace.IContador;
import DAO.InterFace.IEmitente;
import DTO.EmitenteDTO;
/**
 * 
 * @author agemiro
 *
 */
public class ContadorMysql implements IContador{
	private Connection con = null;
	PreparedStatement pst = null;
	private EmitenteDTO emitente;
	
	public ContadorMysql() {
		emitente = new EmitenteDTO();
	}

	@Override
	public void cadastrar(EmitenteDTO novo){
		//codigo pra conexao de banco de daos pSostgre
		

			con = ConexaoSingleton.getInstance();
			try {
				pst = con.prepareStatement("INSERT INTO EMITENTE (CNPJ,EST,MUNIC,RAZAO,NOME,RUA,NUM,CEP,BAIRRO,CIDADE,UF,IBGE) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, novo.getCNPJ());
				pst.setString(2, novo.getInscEst());
				pst.setString(3, novo.getInscMunic());
				pst.setString(4, novo.getRazao());
				pst.setString(4, novo.getNomeFatasia());
				pst.setString(6, novo.getRua());
				pst.setString(7, novo.getNum());
				pst.setString(8, novo.getCep());
				pst.setString(9, novo.getBairro());
				pst.setString(10, novo.getCidade());
				pst.setString(11, novo.getUF());
				pst.setInt(12, novo.getCodIbge());
				pst.execute();
			}catch (SQLException e) {
				e.printStackTrace();
	
				
			}
			
			
	}

	@Override
	public void editar(EmitenteDTO novo) {
			String sql = "UPDATE EMITENTE SET CNPJ=?,EST=?,MUNIC=?,RAZAO=?,NOME=?,RUA=?,NUM=?,CEP=?,BAIRRO=?,CIDADE=?,UF=?,IBGE=?";
			con = ConexaoSingleton.getInstance();
			try {
				pst = con.prepareStatement(sql);
				pst.setString(1, novo.getCNPJ());
				pst.setString(2, novo.getInscEst());
				pst.setString(3, novo.getInscMunic());
				pst.setString(4, novo.getRazao());
				pst.setString(4, novo.getNomeFatasia());
				pst.setString(6, novo.getRua());
				pst.setString(7, novo.getNum());
				pst.setString(8, novo.getCep());
				pst.setString(9, novo.getBairro());
				pst.setString(10, novo.getCidade());
				pst.setString(11, novo.getUF());
				pst.setInt(12, novo.getCodIbge());
				pst.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("editado com sucesso");
			
	
	}

	@Override
	public EmitenteDTO pesquisar() {
	
		try {
			con = ConexaoSingleton.getInstance();
			pst = con.prepareStatement("SELECT *FROM EMITENTE");
			ResultSet rs=pst.executeQuery();
			
				emitente = new EmitenteDTO();
				emitente.setCNPJ(rs.getString("CNPJ"));
				emitente.setInscEst(rs.getString("EST"));
				emitente.setInscMunic(rs.getString("MUNIC"));
				emitente.setRazao(rs.getString("RAZAO"));
				emitente.setNomeFatasia(rs.getString("NOME"));
				emitente.setCep(rs.getString("CEP"));
				emitente.setRua(rs.getString("RUA"));
				emitente.setNum(rs.getString("NUM"));
				emitente.setBairro(rs.getString("BAIRRO"));
				emitente.setCidade(rs.getString("CIDADE"));
				emitente.setUF(rs.getString("UF"));
				emitente.setCodIbge(rs.getInt("IBGE"));
				
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return emitente;
		
	}

	

}
