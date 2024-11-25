package model;

import java.io.Serializable;

public abstract class Funcionario implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    public abstract String mostrarDetalhes();
}
