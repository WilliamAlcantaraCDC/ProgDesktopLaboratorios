package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;

public class UsuarioDAO {
	Connection conn;
	//metodo para obter a conexao com o banco de dados
	public Connection getConnection() {
		
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/laboratorios", "postgres", "pc123456");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		}
	//metodo para inserir dados no DB
	public boolean inserir(Usuario usuario) {
		Statement st;
		String query = "INSERT into cad_lab(id, nome, lad_escolhido, telefone, entrada, saida, data)"+
				"values (default,'" + usuario.getJtnome() + "','"+ usuario.getJtend() + "','" + usuario.getJttelefone()+ "','" + 
				usuario.getJtentrada() + "','" + usuario.getJtsaida()+ "','" + usuario.getJtdata()+"')";		
		try {
			st = getConnection().createStatement();
			st.executeUpdate(query);
			// atualiza dados da jtable
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
		
	}
	


