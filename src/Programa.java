import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Deseja criar uma nova conta? (S/N) ");
        char CriarNovaConta = sc.next().charAt(0);
        
            if (CriarNovaConta == 'S') {
                Conta conta01 = new Conta();
                conta01.saldo = 0;
                conta01.agencia = 01;
                System.out.print("Informe o número da conta informada pelo seu Gerente: ");
                conta01.numero = sc.nextInt();
                sc.nextLine();
                conta01.titular = new Cliente();
                System.out.print("Informe o nome do titular da conta: ");
                conta01.titular.nome = sc.nextLine();
                System.out.print("Informe o CPF do titular da conta: ");
                conta01.titular.cpf = sc.nextLine();
                System.out.print("Informe a profissão do titular da conta: ");
                conta01.titular.profissao = sc.nextLine();
            } else {
                System.out.println("Saindo do sistema.");
            }
       
        sc.close();    
    }
}
