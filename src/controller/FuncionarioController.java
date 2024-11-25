package controller;

import model.*;
import view.FuncionarioView;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private final FuncionarioView view;
    private final List<Funcionario> funcionarios;

    public FuncionarioController(FuncionarioView view) {
        this.view = view;
        this.funcionarios = new ArrayList<>();
    }

    public void executar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> atualizarFuncionario();
                case 4 -> excluirFuncionario();
                case 5 -> view.exibirMensagem("Saindo do sistema...");
                default -> view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void cadastrarFuncionario() {
        String nome = view.lerTexto("Digite o nome do funcionário: ");
        double salario = view.lerSalario();
        String tipo = view.lerTexto("Digite o tipo (Desenvolvedor, Gerente, Treinador, GerenteDesenvolvedor): ");

        Funcionario funcionario = switch (tipo.toLowerCase()) {
            case "desenvolvedor" -> new Desenvolvedor(nome, salario);
            case "gerente" -> new Gerente(nome, salario);
            case "treinador" -> new Treinador(nome, salario);
            case "gerentedesenvolvedor" -> new GerenteDesenvolvedor(nome, salario);
            default -> null;
        };

        if (funcionario != null) {
            funcionarios.add(funcionario);
            view.exibirMensagem("Funcionário cadastrado com sucesso!");
        } else {
            view.exibirMensagem("Tipo de funcionário inválido.");
        }
    }

    private void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            view.exibirMensagem("Nenhum funcionário cadastrado.");
        } else {
            funcionarios.forEach(f -> view.exibirMensagem(f.mostrarDetalhes()));
        }
    }

    private void atualizarFuncionario() {
        // Implementação futura
    }

    private void excluirFuncionario() {
        // Implementação futura
    }
}
