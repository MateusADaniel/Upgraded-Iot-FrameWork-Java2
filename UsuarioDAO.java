
import java.sql.*;

public class UsuarioDAO {
	private Conexao conexao;
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;

	public UsuarioDAO(){
		conexao = conexao.getInstance();
	}
	public void insereUsuario(Usuario usuario) {
		try {
			query = "INSERT INTO usuario (email, senha) VALUES (?, ?)";
			ps = conexao.getConexao().prepareStatement(query);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getSenha());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	

}
