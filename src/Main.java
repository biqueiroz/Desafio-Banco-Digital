
public class Main {

    public static void main(String[] args) {
        Cliente bianca = new Cliente();
        bianca.setNome("Bianca");

        Conta cc = new ContaCorrente(bianca);
        Conta poupanca = new ContaPoupanca(bianca);

        cc.depositar(300);
        cc.transferir(150, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}