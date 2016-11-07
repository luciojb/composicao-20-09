
package exercicio2;


public final class Exerciciolista {

    public static void main(String[] args) {
     Carro carrinho = new Carro();
     carrinho.dono.setNome("GOHANN");
     carrinho.dono.setEndereco("Rua dos Bobos");
     carrinho.motor.setCilindros(1);
     carrinho.motor.setCombustivel("Carne");
     carrinho.motor.setMarca("Fischer");
     carrinho.motor.setPotencia((float) 1500);
     carrinho.setCor("Vermelho");
     carrinho.setFabricante("Irmãos gasosa");
     carrinho.setModelo("Buster 9000");
     carrinho.setAno(2000);
     System.out.println(carrinho);   
    }
    
}
