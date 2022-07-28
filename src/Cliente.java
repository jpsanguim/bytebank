import java.util.Scanner;

public class Cliente {

	private String nome;
	private String Cpf;
	private ValidaCPF validacao;

	Scanner sc = new Scanner(System.in);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {

		if (ValidaCPF.isCPF(Cpf) == true) {
			System.out.println("CPF válido!");
		} else {
			do {
				this.validacao = new ValidaCPF();
				System.out.printf("Erro, CPF invalido !!!\n");
				System.out.print("Por favor, redigite seu CPF: ");
				setCpf(sc.nextLine());
			} while (ValidaCPF.isCPF(Cpf) == false);
		}
		return Cpf;
	}

	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}
}