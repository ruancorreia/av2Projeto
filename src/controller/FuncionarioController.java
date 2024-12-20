package controller;

import model.*;
import view.FuncionarioView;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class FuncionarioController {
    private final ArrayList<Funcionario> funcionarios;
    private final FuncionarioView view;
    private final Scanner scanner;

    private static final String ARQUIVO_FUNCIONARIOS = "funcionarios.dat"; 

    public FuncionarioController() {
        this.funcionarios = new ArrayList<>();
        this.view = new FuncionarioView();
        this.scanner = new Scanner(System.in);
        carregarFuncionarios();  
    }

    public void executar() {
        int opcao;
        do {
            try {
                opcao = view.exibirMenu();
                switch (opcao) {
                    case 1 -> cadastrarFuncionario();
                    case 2 -> listarFuncionarios();
                    case 3 -> atualizarFuncionario();
                    case 4 -> excluirFuncionario();
                    case 5 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida! Use números.");
                scanner.nextLine(); 
            }
        } while (true);
    }

    private void cadastrarFuncionario() {
        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1 - Desenvolvedor");
        System.out.println("2 - Gerente");
        System.out.println("3 - Treinador");
        System.out.println("4 - Gerente Desenvolvedor");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        Funcionario novoFuncionario;
        switch (tipo) {
            case 1 -> novoFuncionario = new Desenvolvedor(nome, salario);
            case 2 -> novoFuncionario = new Gerente(nome, salario);
            case 3 -> novoFuncionario = new Treinador(nome, salario);
            case 4 -> novoFuncionario = new GerenteDesenvolvedor(nome, salario);
            default -> {
                System.out.println("Tipo inválido!");
                return;
            }
        }

        funcionarios.add(novoFuncionario);
        salvarFuncionarios();  
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }

    private void atualizarFuncionario() {
        System.out.print("Digite o nome do funcionário a ser atualizado: ");
        String nome = scanner.nextLine();

        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Digite o novo salário: ");
                double novoSalario = scanner.nextDouble();
                f.setSalario(novoSalario);
                salvarFuncionarios(); 
                System.out.println("Salário atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Funcionário não encontrado.");
    }

    private void excluirFuncionario() {
        System.out.print("Digite o nome do funcionário a ser excluído: ");
        String nome = scanner.nextLine();

        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
        salvarFuncionarios();  
        System.out.println("Funcionário removido com sucesso!");
    }

    
    public void salvarFuncionarios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO_FUNCIONARIOS))) {
            oos.writeObject(funcionarios);
            System.out.println("Funcionários salvos no arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    public void carregarFuncionarios() {
        File arquivo = new File(ARQUIVO_FUNCIONARIOS);
        if (arquivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO_FUNCIONARIOS))) {
                funcionarios.clear();
                funcionarios.addAll((ArrayList<Funcionario>) ois.readObject());
                System.out.println("Funcionários carregados do arquivo.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao carregar os dados: " + e.getMessage());
            }
        } else {
            System.out.println("Arquivo de dados não encontrado. Criando um novo arquivo.");
        }
    }
}

//package controller;
//
//import model.*;
//import view.FuncionarioView;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class FuncionarioController {
//    private final ArrayList<Funcionario> funcionarios;
//    private final FuncionarioView view;
//    private final Scanner scanner;
//
//
////private static final String ARQUIVO_FUNCIONARIOS = "src/resources/funcionarios.dat";
//    private static final String ARQUIVO_FUNCIONARIOS = "funcionarios.dat";
//
//    public FuncionarioController() {
//        this.funcionarios = new ArrayList<>();
//        this.view = new FuncionarioView();
//        this.scanner = new Scanner(System.in); 
//   }
//
//    public void executar() {
//        int opcao;
//        do {
//            try {
//                opcao = view.exibirMenu();
//                switch (opcao) {
//                    case 1 -> cadastrarFuncionario();
//                    case 2 -> listarFuncionarios();
//                    case 3 -> atualizarFuncionario();
//                    case 4 -> excluirFuncionario();
//                    case 5 -> System.out.println("Saindo...");
//                    default -> System.out.println("Opção inválida!");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Erro: Entrada inválida! Use números.");
//                scanner.nextLine(); 
//            }
//        } while (true);
//    }
//
//    private void cadastrarFuncionario() {
//        System.out.println("Escolha o tipo de funcionário:");
//        System.out.println("1 - Desenvolvedor");
//        System.out.println("2 - Gerente");
//        System.out.println("3 - Treinador");
//        System.out.println("4 - Gerente Desenvolvedor");
//        int tipo = scanner.nextInt();
//        scanner.nextLine(); 
//
//        System.out.print("Digite o nome: ");
//        String nome = scanner.nextLine();
//        System.out.print("Digite o salário: ");
//        double salario = scanner.nextDouble();
//
//        Funcionario novoFuncionario;
//        switch (tipo) {
//            case 1 -> novoFuncionario = new Desenvolvedor(nome, salario);
//            case 2 -> novoFuncionario = new Gerente(nome, salario);
//            case 3 -> novoFuncionario = new Treinador(nome, salario);
//            case 4 -> novoFuncionario = new GerenteDesenvolvedor(nome, salario);
//            default -> {
//                System.out.println("Tipo inválido!");
//                return;
//            }
//        }
//
//        funcionarios.add(novoFuncionario);
//        System.out.println("Funcionário cadastrado com sucesso!");
//    }
//
//    private void listarFuncionarios() {
//        if (funcionarios.isEmpty()) {
//            System.out.println("Nenhum funcionário cadastrado.");
//            return;
//        }
//
//        for (Funcionario f : funcionarios) {
//            System.out.println(f.toString());
//        }
//    }
//
//    private void atualizarFuncionario() {
//        System.out.print("Digite o nome do funcionário a ser atualizado: ");
//        String nome = scanner.nextLine();
//
//        for (Funcionario f : funcionarios) {
//            if (f.getNome().equalsIgnoreCase(nome)) {
//                System.out.print("Digite o novo salário: ");
//                double novoSalario = scanner.nextDouble();
//                f.setSalario(novoSalario);
//                System.out.println("Salário atualizado com sucesso!");
//                return;
//            }
//        }
//
//        System.out.println("Funcionário não encontrado.");
//    }
//
//    private void excluirFuncionario() {
//        System.out.print("Digite o nome do funcionário a ser excluído: ");
//        String nome = scanner.nextLine();
//
//        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
//        System.out.println("Funcionário removido com sucesso!");
//    }
//}
