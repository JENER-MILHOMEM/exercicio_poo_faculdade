public class conta_especial extends conta_corrente {
    public double limite = 0;

    public void sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            System.out.println("valor sacado, seu novo saldo e: " + this.saldo);
        } else {
            System.out.println("sem saldo suficiente");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("valor depositado, seu novo saldo e: " + this.saldo);
    }

}
