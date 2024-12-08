public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(500.0);

        BancoKonoha banco = new BancoKonoha();

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();

        contaCorrente.depositar(200);
        contaCorrente.consultarSaldo();

        banco.transferir(contaCorrente, contaPoupanca, 300);
        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();
    }
}