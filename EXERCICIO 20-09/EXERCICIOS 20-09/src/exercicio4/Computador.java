package exercicio4;

public final class Computador extends EquipamentoEletronico {
private String marca,modelo;
protected Mouse mouse;
protected Teclado teclado;
protected Monitor monitor;
protected Gabinete gabinete;

    public Computador(){
        mouse = new Mouse();
       teclado = new Teclado();
        monitor = new Monitor();
        gabinete = new Gabinete();
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", modelo=" + modelo + ", mouse=" + mouse + ", teclado=" + teclado + ", monitor=" + monitor + ", gabinete=" + gabinete + "toString ="+super.toString()+'}';
    }
    
}
