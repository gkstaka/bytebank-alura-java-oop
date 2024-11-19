public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
//        primeiraConta.saldo = 200;
        primeiraConta.setSaldo(200);
        System.out.println("primeiraConta.saldo = " + primeiraConta.getSaldo());

//        primeiraConta.saldo += 100;
        primeiraConta.setSaldo(primeiraConta.getSaldo() + 100);
        System.out.println("primeiraConta.saldo = " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
//        segundaConta.saldo = 50;
        segundaConta.setSaldo(50);


        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        System.out.println("primeiraConta = " + primeiraConta);
    }
}

