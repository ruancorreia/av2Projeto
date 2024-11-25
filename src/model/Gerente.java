package model;

public class Gerente extends Funcionario implements Gerencia {
    private static final long serialVersionUID = 1L;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void organizarEquipe() {
        System.out.println(getNome() + " está organizando a equipe.");
    }

    @Override
    public void conduzirReunioes() {
        System.out.println(getNome() + " está conduzindo reuniões.");
    }

    @Override
    public String mostrarDetalhes() {
        return "Gerente: " + getNome() + ", Salário: " + getSalario();
    }
}
