package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, "João", 2000));
		System.out.println(dao.incluir(sql, "Ana Maria", 2001));
		System.out.println(dao.incluir(sql, "Dijalma Pereira", 2002));
		
		dao.close();
	}
}
