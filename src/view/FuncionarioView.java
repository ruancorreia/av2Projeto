package view;

import java.util.Scanner;

public class FuncionarioView {
    private final Scanner scanner = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("Menu de Gerenciamento de Funcionários:");
        System.out.println("1. Cadastrar Funcionário");
        System.out.println("2. Listar Funcionários");
        System.out.println("3. Atualizar Funcionário");
        System.out.println("4. Excluir Funcionário");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

    public double lerSalario() {
        System.out.print("Digite o salário: ");
        String entrada = scanner.next();
        entrada = entrada.replace(",", "."); 
        try {
            return Double.parseDouble(entrada); 
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número válido.");
            return lerSalario(); 
        }
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
