package Aula5;

public class Pessoa {
    public String nome;
    private int idade;
    private double peso;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
}
