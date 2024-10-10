import java.util.Scanner;

//1º Questão
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número para verificação da sua presença na sequência de Fibonnaci.");
        int numero = input.nextInt();

        if(Fibonacci(numero)){
            System.out.println("O número pertence à sequência de Fibonnaci.");
        }else{
            System.out.println("Não pertence à sequência de Fibonnaci.");
        }
        input.close();
    }

    public static boolean Fibonacci(int numero) {
        int a = 0, b = 1, c = 0;

        if (numero == 0 || numero == 1) { return true;
        }

        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == numero;
    }
}
