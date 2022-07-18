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
                conta01.deposita(0);
                System.out.printf("Nova conta criada. Saldo inicial de R$ %.2f%n", conta01.getSaldo());
                conta01.setAgencia(01);
                System.out.print("Informe o número da conta informada pelo seu Gerente: ");
                conta01.setNumero(sc.nextInt());
                sc.nextLine();

                Cliente cliente01 = new Cliente();
                System.out.print("Informe o nome do titular da conta: ");                
                cliente01.setNome(sc.nextLine());
                System.out.print("Informe o CPF do titular da conta: ");
                cliente01.setCpf(sc.nextLine());
                System.out.print("Informe a profissão do titular da conta: ");
                cliente01.setProfissao(sc.nextLine());
                conta01.setTitular(cliente01);

                System.out.print("Deseja exibir as informações cadastradas? (S/N) ");
                char ExibirCadastro = sc.next().charAt(0);

                if (ExibirCadastro == 'S') {
                    System.out.print("Nº da conta: ");
                    System.out.print(conta01.getNumero());
                    System.out.println();
                    System.out.print("Titular da conta: ");
                    System.out.print(cliente01.getNome());
                    System.out.println();
                    System.out.print("CPF do titular: ");
                    System.out.print(cliente01.getCpf());
                    System.out.println();
                    System.out.print("Profissão do titular: ");
                    System.out.print(cliente01.getProfissao());
                }
                
            else {
                System.out.println("Saindo do sistema.");
            }
        }     
        sc.close();    
    }

}