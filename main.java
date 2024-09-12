import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conta_especial ce = new conta_especial();
        System.out.println("digite seu nome de usuario: ");
        ce.user_conta = sc.nextLine();
        System.out.println("digite o numero da sua conta: ");
        ce.n_conta = sc.nextDouble();
        System.out.println("digite o valor que deseja depositar: ");
        ce.depositar(sc.nextDouble());
        System.out.println("digite o valor que deseja sacar: ");
        ce.sacar(sc.nextDouble());
        System.out.println("1- ver saldo ");
        System.out.println("2- sair ");
        if (sc.nextInt() == 1) {
            System.out.println("seu saldo e: " + ce.get_saldo());
        }
        if (sc.nextInt() == 2) {
            System.exit(0);
        }
    }

}
