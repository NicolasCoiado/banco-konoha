public class BancoKonoha {
    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (valor <= 0) {
            System.out.println("O valor da transferência deve ser positivo.");
            return;
        }

        if (origem.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para transferência.");
            return;
        }

        origem.subtrairSaldo(valor);
        destino.adicionarSaldo(valor);

        System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        System.out.println("Origem: " + origem.getTipoConta() + ", Saldo atual: R$" + origem.getSaldo());
        System.out.println("Destino: " + destino.getTipoConta() + ", Saldo atual: R$" + destino.getSaldo());
    }
}