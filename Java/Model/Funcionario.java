package Model;

public class Funcionario extends Pessoa {

    private double salarioBase;
    private double valor;

    public void dobrarSalario() {
        this.salarioBase = salarioBase * 2;
    }

    public double calcularFerias() {
        return salarioBase * 1.33;
    }

    public void descontarAdiantamento(double valor) {
        this.salarioBase = this.salarioBase - valor;
    }

    public double calcularHorasExtras(double totalDeHoras) {
        return ((this.salarioBase / 220) * 2) * totalDeHoras;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getValor() {
        return valor;
    }
}
