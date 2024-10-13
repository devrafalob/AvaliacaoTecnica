import java.util.Scanner;

//1º Questão
public class Questao1 {
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
        //A e B para os casos base
    public static boolean Fibonacci(int numero) {
        return FibonacciRecussao(0, 1, numero);
    }
        //Recurssao
    private static boolean FibonacciRecussao(int a, int b, int numero) {
        if (a == numero || b == numero) {
            return true;
        }
        if (b > numero) {
            return false;
        }
        return FibonacciRecussao(b, a + b, numero);
    }
}
