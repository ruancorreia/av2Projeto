package model;

public class Desenvolvedor extends Funcionario implements Desenvolve {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
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
        return "Desenvolvedor: " + getNome() + ", Salário: " + getSalario();
    }
}
