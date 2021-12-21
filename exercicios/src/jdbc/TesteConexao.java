package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		//na url de conexão digo qual o banco, qual a conexão e qual a porta
		final String url = "jdbc:mysql://localhost:3306/wm?verifyServerCertificate=false&useSSL=true";//pode não colocar a porta pq é a padrão, ou outra porta que queira
		//localhost é a conexão, 3306 a porta e wm é um banco meu qualquer que já existe
		final String usuario = "root";
		final String senha = "marcinha";
		
		
		//podemos passar todos os dados, ou um arquivo .propertie
		//método lança uma exceção checada... precisa ser tratada, estamos tratando lá em cima no throws sqlException
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}
}
