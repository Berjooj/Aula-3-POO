import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Funcionario;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Funcionario f1 = new Funcionario();

        f1.setNome(reader.readLine());
        f1.setSalarioBase(800);
        // invoca seus metodos sem retotno e sem argumento
        f1.dobrarSalario();

        f1.descontarAdiantamento(300);

        double ferias = f1.calcularFerias();
        double horasExtras = f1.calcularHorasExtras(ferias);

        System.out.printf("Ola %s, seu salaro eh: R$ %.2f\n", f1.getNome(), f1.getSalarioBase());
        System.out.printf("O valor de suas ferias sera: R$ %.2f\n", ferias);
        System.out.printf("O valor de horas extras eh: R$ %.2f\n", horasExtras);
    }
}