/**
 * @version 0.0.1
 * @author Abdel & Vinal
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Pedido p = new Pedido();
        ClienteEmail c = new ClienteEmail();
        
        p.setStatus(1);
        
        c.comunicarStatusPedido();
        
        
    }
    
    /***
     * Coisas para arrumar:
     * comunicarStatusPedido em ClienteEmail;
     * set e get Status em Pedido;
     * 
     * ArrayList em Pedido para servir como parâmetro em comunicarStatusPedido e depois enviar por email;
     * 
     * 
     * /
    
}
