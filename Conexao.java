import java.sql.*;

public class Conexao {
    private static Conexao conex;
    private final String con_banco;
    private final String usuario_mysql;
    private final String senha_mysql;
    private Connection conn;

    private Conexao() {
		conex = null;
		usuario_mysql = "root";
		senha_mysql = "root";
		con_banco = "jdbc:mariadb://127.0.0.1:3307/meow";
		try {
			this.conn = DriverManager.getConnection(con_banco, usuario_mysql, senha_mysql);
		} catch (Exception e) {
		    e.printStackTrace();
		}
    }
    public static Conexao getInstance() {
		if(conex == null) {
		    conex = new Conexao();
		}
		return conex;
    }
    public Connection getConexao() {
		return this.conn;
    }
}
