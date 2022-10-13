import java.util.Scanner;

public class uu {
    public static void main(String[] args) {
        /*
        void - não retorna valor
        main - nome do método
        args - nome parâmetro
        string - classe String (Caracteres)
         */

        String nome; //comentario de linha

        /* comentario */ int numero;
        double salario; //tipo de dado double
        String nomeDamae;
        String nomePai;
        String enderecoCorrespondencia;
        double nota1, nota2, media;

        //class Scanner para entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota 1");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota 2");
        nota2 = teclado.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("Sua média é " + media);
    }

    //ExemploAula02
}
