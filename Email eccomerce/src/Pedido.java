
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Abdel & Vinal
 */
public class Pedido {
    
    private ClienteEmail c = new ClienteEmail();
    
    private Random ran = new Random();
    
    private Date hoje = new Date();
    
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    private ArrayList<String> produtos = new ArrayList();
    
    private double ValorT;
    private String data = "";
    private int numPedido;
    private String nomeCliente = c.getNomeCliente();
    private String status = "";
    
    
    public void setProdutos(ArrayList<String> produtosParam){
        
        this.produtos = produtosParam;
        
    }
    
    public ArrayList<String> getProdutos(){
        
        return this.produtos;
        
    }
    
    public void setValorT(double valor){
        
        this.ValorT = valor;
        
    }
    
    public double getValorT(){
        
        return this.ValorT;
        
    }
    
    public void setData(){
        
        this.data = df.format(this.hoje);
        
    }
    
    public String getData(){
        
        return this.data;
        
    }
    
    public void setNumPedido(){
        
        this.numPedido = ran.nextInt(51);
        
    }
    
    public int getNumPedido(){
        
        return this.numPedido;
        
    }
    
    public String getNomeCliente(){
        
        return this.nomeCliente;
        
    }
    
    public void setStatus(int stat){
        
        if (stat == 1) {
            
            this.status = "Pedido sendo processado.";
            
        } else if(stat == 2) {
            
            
            
        } else if(stat == 3){
            
            
            
        }
        
    }
    
    public String getStatus(){
        
        return this.status;
        
    }
    
}
