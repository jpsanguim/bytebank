import java.util.Locale;
import java.util.Scanner;

public class TestePrograma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);		
		
		System.out.print("Deseja criar uma nova conta? (S/N) ");
		char CriarNovaConta = sc.next().charAt(0);

		if (CriarNovaConta == 'S') {

			System.out.print("Digite o n�mero da ag�ncia: ");
			int agencia = sc.nextInt();
			System.out.print("Digite o n�mero da conta: ");
			int numero = sc.nextInt();
			Conta contaCorrente = new ContaCorrente(agencia, numero);
			contaCorrente.deposita(0);

			System.out.printf("Nova conta criada. Saldo inicial de R$ %.2f%n", contaCorrente.getSaldo());
			
			ContaPoupanca contaPoupanca = new ContaPoupanca(agencia, numero);
			System.out.printf("Conta Poupan�a criada. Saldo inicial de R$ %.2f%n", contaPoupanca.getSaldo());
			
			sc.nextLine();

			Cliente cliente = new Cliente();
			System.out.print("Informe o nome do titular da conta: ");
			cliente.setNome(sc.nextLine());
			System.out.print("Informe o CPF do titular da conta: ");
			cliente.setCpf(sc.nextLine());
			cliente.getCpf();
			contaCorrente.setTitular(cliente);
			System.out.print("Informe o valor para dep�sito inicial: ");
			contaCorrente.deposita(sc.nextDouble());

			System.out.print("Deseja exibir as informa��es cadastradas? (S/N) ");
			char ExibirCadastro = sc.next().charAt(0);

			if (ExibirCadastro == 'S') {
				System.out.print("N� da ag�ncia: ");
				System.out.print(contaCorrente.getAgencia());
				System.out.print("N� da conta: ");
				System.out.print(contaCorrente.getNumero());
				System.out.println();
				System.out.print("Titular da conta: ");
				System.out.print(cliente.getNome());
				System.out.println();
				System.out.print("CPF do titular: ");
				System.out.print(cliente.getCpf());
				System.out.println();
				System.out.print("Saldo atual ");
				System.out.print(contaCorrente.getSaldo());

			} else {

				do {

					System.out.print("Digite a op��o desejada: 1. Dep�sito | 2. Saque | 3. Transfer�ncia | 4. Sair ");
					int OpcaoFinanceira = sc.nextInt();

					switch (OpcaoFinanceira) {
					case 1:
						System.out.println("Op��o dep�sito selecionada");
						System.out.print("Digite o valor de dep�sito desejado: ");
						Double deposito = sc.nextDouble();
						contaCorrente.deposita(deposito);
						System.out.printf("O saldo de sua conta corrente �: R$ %.2f", contaCorrente.getSaldo());
						System.out.println();
						break;

					case 2:
						System.out.println("Op��o Saque selecionada");
						System.out.print("Digite o valor de saque desejado (taxa de R$ 0,20 por saque): ");
						Double saque = sc.nextDouble();
						contaCorrente.saca(saque);
						System.out.printf("O saldo de sua conta corrente �: R$ %.2f", contaCorrente.getSaldo());
						System.out.println();
						break;

					case 3:
						System.out.println("Op��o Transfer�ncia selecionada");
						System.out.print("Digite o valor de transfer�ncia para conta poupan�a desejado: ");
						Double transferencia = sc.nextDouble();
						contaCorrente.transfere(transferencia, contaPoupanca);
						System.out.printf("O saldo de sua conta corrente �: R$ %.2f", contaCorrente.getSaldo());
						System.out.println();
						System.out.printf("O saldo de sua conta poupan�a �: R$ %.2f", contaPoupanca.getSaldo());
						System.out.println();
						break;
						
					case 4:
						break;

					default:
						System.out.println("Op��o invalida ");
						System.out.println();
					}

					sc.nextLine();
					System.out.print("Deseja realizar outra opera��o? S/N ");

				} while (sc.nextLine().equalsIgnoreCase("S"));
			}
		} else {
			System.out.println("Saindo.");
		}
		sc.close();
	}
}