package exercicio4;

public final class Monitor {
    private String marca,tipo,Resolucao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResolucao() {
        return Resolucao;
    }

    public void setResolucao(String Resolucao) {
        this.Resolucao = Resolucao;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", tipo=" + tipo + ", Resolucao=" + Resolucao + '}';
    }
    
}
