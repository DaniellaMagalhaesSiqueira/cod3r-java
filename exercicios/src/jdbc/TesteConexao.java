package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		//na url de conex�o digo qual o banco, qual a conex�o e qual a porta
		final String url = "jdbc:mysql://localhost:3306/wm?verifyServerCertificate=false&useSSL=true";//pode n�o colocar a porta pq � a padr�o, ou outra porta que queira
		//localhost � a conex�o, 3306 a porta e wm � um banco meu qualquer que j� existe
		final String usuario = "root";
		final String senha = "marcinha";
		
		
		//podemos passar todos os dados, ou um arquivo .propertie
		//m�todo lan�a uma exce��o checada... precisa ser tratada, estamos tratando l� em cima no throws sqlException
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conex�o efetuada com sucesso!");
		conexao.close();
	}
}
