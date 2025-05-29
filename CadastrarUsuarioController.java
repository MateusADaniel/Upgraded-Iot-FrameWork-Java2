
// CadastrarUsuarioController.java
public class CadastrarUsuarioController {
    private CadastrarUsuarioView cuv;
    private Usuario usuario;
    private UsuarioDAO uDAO;
    
    public CadastrarUsuarioController() {
        this.cuv = new CadastrarUsuarioView();
        this.usuario = cuv.cadastro();
        uDAO = new UsuarioDAO();
        uDAO.insereUsuario(this.usuario);
    }
}
