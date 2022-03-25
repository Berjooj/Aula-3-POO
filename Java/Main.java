import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Aula5.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pessoa p1 = new Pessoa();

        p1.nome = reader.readLine();
        p1.setIdade(Integer.parseInt(reader.readLine()));
        p1.setPeso(Double.parseDouble(reader.readLine()));

        System.out.println("/------------------/");
        System.out.println(p1.nome);
        System.out.println(p1.getIdade());
        System.out.println(p1.getPeso());

    }
}