public abstract class Conta {
 
    protected double saldo;
    private int agencia, numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor + 0.2;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
    	if (this.saldo >= valor) {
            this.saldo -= valor;    	
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Erro: o valor digitado não pode ser menor ou igual a zero!");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Erro: o valor digitado não pode ser menor ou igual a zero!");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
    
}