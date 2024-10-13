import java.util.Scanner;
//Questao 2
public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva uma frase");
        String frase = input.nextLine();

        if(ContaLetraA(frase)>0){
            System.out.println("Na sua frase há "+ ContaLetraA(frase)+" letra(as) 'A'.");
        }else{
            System.out.println("Não há nenhuma letra 'A' na sua frase.");
        }
        input.close();
    }

    public static int ContaLetraA(String frase){
        int contador = 0;
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i) == 'a'){
                contador++;
            }
        }
        return contador;
    }
}
