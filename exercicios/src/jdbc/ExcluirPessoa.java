package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o código: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1,codigo);
		int contador = stmt.executeUpdate();
		if (contador > 0) {    
		//retorna a quantidade de linhas afetadas pelas modificações do sql
			System.out.println("Pessoa excluída com sucesso");
			System.out.println("Linhas afetadas: "+ contador);
			
		}else {
			System.out.println("Nada foi feito.");
		}

		entrada.close();
		conexao.close();
	}
}
