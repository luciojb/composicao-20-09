package exercicio3;

public final class ExecEx3 {
    public static void main(String[] args) {
        ContaSimples cs = new ContaSimples();
        ContaEspecial ce = new ContaEspecial();
        
        ce.banco.setCodigo(1);
        ce.banco.setNome("BB");
        ce.banco.setNumeroAgencias(100);
        ce.cartao.setLimite(1500);
        ce.cartao.setNumero(145332982);
        ce.cartao.setOperadora("Visa");
        ce.cartao.setTipoDeCartao("Credito");
        ce.correntista.setEndereco("Brasil");
        ce.correntista.setNome("Lucio");
        ce.setDiasSemJuros(10);
        ce.setLimite(1200);
        ce.setAgencia(54046);
        ce.setNumeroDaConta(1234);
        ce.setSaldo(2000);
        
        cs.banco.setCodigo(2);
        cs.banco.setNome("Itau");
        cs.banco.setNumeroAgencias(10);
        cs.correntista.setEndereco("Argentina");
        cs.correntista.setNome("Lucio");
        cs.setAgencia(39000);
        cs.setNumeroDaConta(1234);
        cs.setSaldo(18999);
        cs.setSaldoPoupanca(2000);
        
        System.out.println(cs);
        System.out.println();
        System.out.println(ce);
        
        

    }
    
}
