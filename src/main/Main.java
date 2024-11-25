package main;

import controller.FuncionarioController;
import view.FuncionarioView;

public class Main {
    public static void main(String[] args) {
        FuncionarioView view = new FuncionarioView();
        FuncionarioController controller = new FuncionarioController(view);
        controller.executar();
    }
}
