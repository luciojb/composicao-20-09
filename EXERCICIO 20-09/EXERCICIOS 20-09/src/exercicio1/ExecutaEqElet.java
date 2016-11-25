
package exercicio1;

public final class ExecutaEqElet {

    
    public static void main(String[] args) {
        HomeTheater ht = new HomeTheater();
        
        ht.som.setConsumo((float)5.14);
        ht.som.setMarca("Philips");
        ht.som.setModelo("HT SS009");
        ht.som.setPotencia(10000);
        ht.som.setTensao(220);
        
        ht.video.setConsumo(10000);
        ht.video.setMarca("Samsung");
        ht.video.setModelo("Galaxy OMH");
        ht.video.setResolucao("UHD");
        ht.video.setTensao(110);
        ht.video.setTipo("4K");
        
        System.out.println(ht);     
        
    }
    
}
