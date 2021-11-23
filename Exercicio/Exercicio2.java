import java.util.Scanner;
class Exercicio2{  
    public static void main(String args[]){
    
    Scanner ler = new Scanner(System.in);
    int d1, d2;

    System.out.printf("Informe o D1 valor: ");
    d1 = ler.nextInt();

    System.out.printf("Informe o D2 valor.: ");
    d2 = ler.nextInt(); 

    System.out.println("A área do losângo é de:" + (d1 * d2) / 2);

    }
}  