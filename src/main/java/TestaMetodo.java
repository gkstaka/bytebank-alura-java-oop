public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
//        contaDoPaulo.saldo = 100;
        contaDoPaulo.setSaldo(100);
        contaDoPaulo.deposita(50);
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println("conta.saldo = " + contaDoPaulo.getSaldo());
        System.out.println("conseguiuRetirar = " + conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
        if (sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }

        System.out.println("contaDaMarcela.saldo = " + contaDaMarcela.getSaldo());
        System.out.println("contaDoPaulo.saldo = " + contaDoPaulo.getSaldo());

        Conta conta = new Conta(123,456);
        System.out.println("Conta.getTotal() = " + Conta.getTotal());

    }
}
