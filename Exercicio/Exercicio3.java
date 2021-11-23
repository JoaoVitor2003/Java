import java.util.Scanner;
class Exercicio3{  
    public static void main(String args[]){
    
    Scanner ler = new Scanner(System.in);
    int B, b, h;

    System.out.printf("Informe o valor da base maior: ");
    B = ler.nextInt();

    System.out.printf("Informe o valor da base menor: ");
    b = ler.nextInt();

    System.out.printf("Informe o valor da altura: ");
    h = ler.nextInt(); 

    System.out.println("A área do trapézio é de:" + ((B + b)*h) / 2);

    }
}  