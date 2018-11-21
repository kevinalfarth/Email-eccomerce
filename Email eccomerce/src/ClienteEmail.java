
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Abdel & Vinal
 */
public class ClienteEmail extends Email {
  private String nomeCliente,enderecoDeEmail,status; 
  
  private Pedido p = new Pedido();
  
  public  void setStatus(String sta){
      this.status = sta;
  }
  
  public  void setnomeCliente(String nomeC){
      this.nomeCliente = nomeC;
  }
  public  String getNomeCliente(){
      return this.nomeCliente;
  }
  public  void setenderecoDeEmail(String endE){
      this.enderecoDeEmail = endE;
  }
  public  String getenderecoDeEmail(){
      return this.enderecoDeEmail;
  }
  
    //retorna as informaçoes do pedido
  public  Pedido comunicarStatusPedido(Pedido pedido){ 
      
      return this.p.getStatus();
      
  }
  
  //retorna status do pedido e a datafinalizacao do pedido
  public  String comunicarStatusPedido(Pedido pedido, String dataFinalizacao){
     
      this.data = dataFinalizacao;
      
      String F;
      F = p.status && dataFinalizacao;
      return F;
  }
    
    
   
    
}
