import java.util.Scanner;

public class TesteCPF {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String CPF;

		System.out.printf("Informe um CPF: ");
		CPF = ler.next();

		System.out.printf("\nResultado: ");

		if (ValidaCPF.isCPF(CPF) == true)
			System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
		else
			System.out.printf("Erro, CPF invalido !!!\n");
	}
}