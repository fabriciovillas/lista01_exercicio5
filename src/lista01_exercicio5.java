import java.util.Scanner;

public class lista01_exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double metros, centimetros;

        System.out.print("Digite o valor em metros: ");
        metros = input.nextDouble();

        centimetros = metros * 100;

        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");
    }
}
