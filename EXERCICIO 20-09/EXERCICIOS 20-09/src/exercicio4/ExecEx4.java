package exercicio4;

public final class ExecEx4 {

    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.gabinete.placamae.hd.setCapacidade((float) 1000);
        pc.gabinete.placamae.hd.setMarca("Toshiba");
        pc.gabinete.placamae.hd.setModelo("A0009");
        pc.gabinete.placamae.hd.setRpm(10000);
        pc.gabinete.placamae.memoria.setCapacidade(8);
        pc.gabinete.placamae.memoria.setMarca("Razer");
        pc.gabinete.placamae.memoria.setModelo("Venon 2000");
        pc.gabinete.placamae.memoria.setVelocidade(1300);
        pc.gabinete.placamae.processador.setCache(8);
        pc.gabinete.placamae.processador.setClock((float) 1.89);
        pc.gabinete.placamae.processador.setMarca("Intel");
        pc.gabinete.placamae.processador.setModelo("Core I5");
        pc.gabinete.placamae.setMarca("Intel");
        pc.gabinete.placamae.setModelo("1330");
        
        pc.gabinete.setBaias(4);
        pc.gabinete.setModelo("NHS");
        pc.gabinete.setTipo("New");
        
        pc.monitor.setMarca("Samsung");
        pc.monitor.setResolucao("1080");
        pc.monitor.setTipo("UHD");
        
        pc.mouse.setMarca("Razer");
        pc.mouse.setTipo("Optico");
        
        pc.teclado.setMarca("Samsung");
        pc.teclado.setTipo("Multimidia");
        
        pc.setMarca("Samsung");
        pc.setModelo("GHT");
        pc.setConsumo(3000);
        pc.setTensao(220);
        
        System.out.println(pc);
    }
    
}
