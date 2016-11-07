
package exercicio1;

public final class HomeTheater {
   
    /* toda vez que tivermos um losango pintado, temos uma composição;
    Losango não pintado é agregado;
    
    compor é obrigatória a existência do objeto;
    
    agragar é facultativo.
    */
    
    
    protected SistemaDeSom som;
    protected SistemaDeVideo video;

    public HomeTheater() {
        som = new SistemaDeSom();
        video = new SistemaDeVideo();
    }

    
    
    public SistemaDeSom getSom() {
        return som;
    }

    public void setSom(SistemaDeSom som) {
        this.som = som;
    }

    public SistemaDeVideo getVideo() {
        return video;
    }

    public void setVideo(SistemaDeVideo video) {
        this.video = video;
    }
    
    


    @Override
    public String toString() {
        return "\n\nHomeTheather{" + "som=" + som + ", video=" + video + '}';
    }
    
    
    
    
}
