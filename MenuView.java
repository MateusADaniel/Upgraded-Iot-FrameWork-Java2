import java.util.Scanner;

public class MenuView {
	private Scanner sc;
	public MenuView(){
		this.sc = new Scanner(System.in);
	}
	public int telaDeMenu(){
		this.sc = new Scanner(System.in);
		System.out.println("\n(1) Cadastrar Usuario");
		System.out.println("(2) Listar Usuario\n");
		System.out.println("(9) Sair\n");
		System.out.println("Opcao:");
		return sc.nextInt();
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao invalida!");
	}
}
