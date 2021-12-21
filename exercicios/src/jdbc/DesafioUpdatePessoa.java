package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioUpdatePessoa {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o id da pessoa: ");
		
		int codigo = entrada.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		
		stmt.setInt(1,codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso.");
			
		}else {
			System.out.println("Pessoa não encontrada.");
		}
		
		
		
		
		
		
		
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
