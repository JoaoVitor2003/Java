import java.util.Scanner;
class Exercicio4{  
    public static void main(String args[]){
    
    Scanner ler = new Scanner(System.in);
    int b, delta, a;

    System.out.printf("Informe o valor de b : ");
    b = ler.nextInt();

    System.out.printf("Informe o valor de delta : ");
    delta = ler.nextInt();

    System.out.printf("Informe o valor de a : ");
    a = ler.nextInt(); 

    System.out.println("O resultado da formula de bhaskara para x1:" + (-b + Math.sqrt(delta)) / (2 * a));
    System.out.println("O resultado da formula de bhaskara para x2:" + (-b - Math.sqrt(delta)) / (2 * a));

    }
}  