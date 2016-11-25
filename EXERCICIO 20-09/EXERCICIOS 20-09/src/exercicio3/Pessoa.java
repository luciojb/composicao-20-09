package exercicio3;

public final class Pessoa {
    private String nome, endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endererco) {
        this.endereco = endererco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endererco=" + endereco + '}';
    }
    
    
}
