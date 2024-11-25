package view;

import java.util.List;
import java.util.Scanner;

public class FuncionarioView {
    public Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("1. Cadastrar Funcionário");
        System.out.println("2. Listar Funcionários");
        System.out.println("3. Atualizar Funcionário");
        System.out.println("4. Excluir Funcionário");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public Funcionario cadastrarFuncionario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = Double.parseDouble(scanner.nextLine());
       
        return new Funcionario(nome, salario);
    }

    public void listarFuncionarios(List<Funcionario> funcionarios) {
        for (Funcionario func : funcionarios) {
            func.mostrarDetalhes();
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

	public Funcionario cadastrarFuncionario1() {
		// TODO Auto-generated method stub
		return null;
	}
}
