public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial, TipoConta.POUPANCA);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
            return;
        }
        adicionarSaldo(valor);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual na Conta Poupança: R$" + getSaldo());
    }
}