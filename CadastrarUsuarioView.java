import java.util.Scanner;
// Usuario.java
public class CadastrarUsuarioView {
    private Scanner sc;
    public CadastrarUsuarioView(){
        this.sc = new Scanner(System.in);
    }
    public Usuario cadastro() {
        System.out.println("cadastro");
        System.out.println("nome: ");
        String nome = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();
        return new Usuario(nome, senha);
    }
}
