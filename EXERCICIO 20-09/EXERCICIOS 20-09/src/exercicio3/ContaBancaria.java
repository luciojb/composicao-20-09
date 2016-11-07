
package exercicio3;

public abstract class ContaBancaria {
    private int agencia, numeroDaConta;
    private double saldo;
    protected Pessoa correntista;
    protected Banco banco;

    public ContaBancaria(){
        correntista= new Pessoa();
        banco = new Banco();
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        if (numeroDaConta>0)
            this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public boolean deposito(double valor){
        if (valor>0)
            setSaldo(getSaldo() + valor);
        return valor>0;
    }
    
    public boolean saque(double valor){
        if (valor<getSaldo()){
            setSaldo(getSaldo()-valor);
        }
        return valor>0;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "agencia=" + agencia + ", numeroDaConta=" + numeroDaConta + ", saldo=" + saldo + ", correntista=" + correntista + ", banco=" + banco + '}';
    }
    
    
    
}
