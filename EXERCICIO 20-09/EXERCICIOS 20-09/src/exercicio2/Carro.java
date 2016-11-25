package exercicio2;

public final class Carro {
    private String fabricante,modelo,cor;
    protected Motor motor;
    protected Pessoa dono;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public Carro(){
   motor = new Motor();
   dono = new Pessoa();
}
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Carro{" + "ano=" + ano + ", fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", motor=" + motor + ", dono=" + dono +  '}';
    }

}
