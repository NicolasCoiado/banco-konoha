public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial, TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
            return;
        }

        double valorCorrigido = aplicaTaxa(valor);
        adicionarSaldo(valorCorrigido);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso (após taxa).");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual na Conta Corrente: R$" + getSaldo());
    }

    private double aplicaTaxa(double valor) {
        double taxa = valor * 0.02; // 2% de taxa
        return valor - taxa;
    }
}