package model;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve {
    private static final long serialVersionUID = 1L;

    public GerenteDesenvolvedor(String nome, double salario) {
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
    public void codar() {
        System.out.println(getNome() + " está codando.");
    }

    @Override
    public void resolverProblemas() {
        System.out.println(getNome() + " está resolvendo problemas técnicos.");
    }

    @Override
    public String mostrarDetalhes() {
        return "Gerente Desenvolvedor: " + getNome() + ", Salário: " + getSalario();
    }
}
