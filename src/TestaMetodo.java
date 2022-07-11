public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        conta01.deposita(50);
        System.out.println(conta01.saldo);
        conta01.saca(20);
        System.out.println(conta01.saldo);

        Conta conta02 = new Conta();
        conta02.deposita(1000);

        conta02.transfere(300, conta01);
        System.out.println(conta02.saldo);
        System.out.println(conta01.saldo);

    }
}