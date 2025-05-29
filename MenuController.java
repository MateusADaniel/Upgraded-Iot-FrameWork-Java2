public class MenuController {
    private MenuView menuView;
    private CadastrarUsuarioController cuc;
    private int opcao;
    
    public MenuController() {
        menuView = new MenuView();
        this.opcao = 0;
        while (this.opcao != 9) {
            this.opcao = menuView.telaDeMenu();
            if (opcao == 1) {
                cuc = new CadastrarUsuarioController();
            } else {
                menuView.telaOpcaoInvalida();
            }
        }
    }
}
