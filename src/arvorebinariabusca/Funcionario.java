/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinariabusca;

/**
 *
 * @author Acer
 */
public class Funcionario implements Comparable<Funcionario> {

    private String nome;
    public String cpf;
    public String ctps;
    public float salario;
    public int idade;

    public Funcionario(String nome, String cpf, String ctps, float Salario, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.ctps = ctps;
        this.salario = Salario;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float Salario) {
        this.salario = Salario;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.ctps.equals(
                ((Funcionario) obj).ctps));
    }

    @Override
    public String toString() {
//        StringBuilder builder = new StringBuilder();
//
//        builder.append("Nome: ").append(this.nome).append("\",")
//                .append("CPF: ").append(this.cpf).append("\",")
//                .append("CTPS: ").append(this.ctps).append("\",")
//                .append("Salario: ").append(this.salario).append("\",")
//                .append("Idade: ").append(this.idade).append("\",");
//        return builder.toString();
        return this.nome + " " + this.ctps;
    }

    @Override
    public int compareTo(Funcionario func) {
        return this.ctps.compareTo(func.ctps);
    }

}
