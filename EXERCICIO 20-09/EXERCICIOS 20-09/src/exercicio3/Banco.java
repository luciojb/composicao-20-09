package exercicio3;

public final class Banco {
    private int codigo, numeroAgencias;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroAgencias() {
        return numeroAgencias;
    }

    public void setNumeroAgencias(int numeroAgencias) {
        this.numeroAgencias = numeroAgencias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{" + "codigo=" + codigo + ", numeroAgencias=" + numeroAgencias + ", nome=" + nome + '}';
    }
    
    
    
}
