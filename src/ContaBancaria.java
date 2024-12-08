public abstract class ContaBancaria implements Conta {
    private double saldo;
    private TipoConta tipoConta;

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    protected void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    protected void subtrairSaldo(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para a operação.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public TipoConta getTipoConta() {
        return this.tipoConta;
    }
}