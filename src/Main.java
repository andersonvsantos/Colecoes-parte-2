import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        List<Pessoa> listaMasculina = new ArrayList<Pessoa>();
        List<Pessoa> listaFeminina = new ArrayList<Pessoa>();

        System.out.println("****************************************************");

        System.out.println("Por favor informe seu nome:");
        String nome = s.nextLine();

        System.out.println("Por favor informe seu sexo (M/F):");
        String sexo = s.nextLine();

        Pessoa p = new Pessoa(nome, sexo);

        if (sexo.equalsIgnoreCase("M")) {
            listaMasculina.add(p);
            System.out.println("Adicionado a lista masculina");
        } else if (sexo.equalsIgnoreCase("F")) {
            listaFeminina.add(p);
            System.out.println("Adicionado a lista feminina");

        } else {
            System.out.println("Valor de sexo inválido, por favor tente novamente!");
        }

        System.out.println("****************************************************");
    }
}