package exercicio3;

public final class ContaSimples extends ContaBancaria{
    private double saldoPoupanca;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    @Override
    public Pessoa getCorrentista() {
        return correntista;
    }
    @Override
    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }
    @Override
    public Banco getBanco() {
        return banco;
    }
    @Override
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public boolean depositoPopanca(double valor){
        if (valor>0)
            setSaldoPoupanca(getSaldoPoupanca() + valor);
        return valor>0;
    }
    
    public boolean saquePopanca(double valor){
        if (valor<getSaldoPoupanca())
            setSaldoPoupanca(getSaldoPoupanca()-valor);
        return valor<getSaldoPoupanca();
    }

    @Override
    public String toString() {
        return "ContaSimples{" + "saldoPoupanca=" + saldoPoupanca +"\ntoString() ="+super.toString()+ '}';
    }
    
    
}
