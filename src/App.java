import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número:");
        int number = sc.nextInt();

        System.out.printf("Tabela de multiplicação de %d %n", number);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d %n", i, number, number * i);
        }
    }
}
