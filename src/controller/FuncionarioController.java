package controller;

import view.FuncionarioView;
import java.util.List;

import model.Funcionario;

import java.util.ArrayList;

public class FuncionarioController {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private FuncionarioView view = new FuncionarioView();

    public void iniciarSistema() {
        boolean continuar = true;
        while (continuar) {
            view.exibirMenu();
            int opcao = Integer.parseInt(view.scanner.nextLine());
            switch (opcao) {
                case 1:
                    Funcionario funcionario = view.cadastrarFuncionario();
                    funcionarios.add(funcionario);
                    view.mostrarMensagem("Funcionário cadastrado com sucesso.");
                    break;
                case 2:
                    view.listarFuncionarios(funcionarios);
                    break;
                case 3:
                    // Lógica de atualizar funcionário
                    break;
                case 4:
                    // Lógica de excluir funcionário
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    view.mostrarMensagem("Opção inválida.");
            }
        }
    }
}
