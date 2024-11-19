public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;
    private static int total = 0;


    public Conta(int agencia, int numero, double saldo, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        Conta.total++;
    }
    public Conta (int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100.0;
        System.out.println("estou criando uma conta");

    }

    public Conta() {
        Conta.total++;
        System.out.println("total de contas eh " + this.total);
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
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

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // Usar static trabalha com uma variável da classe
    public static int getTotal() {
        return total;
    }
}
