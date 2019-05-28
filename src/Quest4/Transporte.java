
package Quest4;

public class Transporte {
    
   private String Capacidade;
   
   public String getCapacidade(){
   
       return this.Capacidade;
   }
   public void setCapacidade(String c){
   
       this.Capacidade = c;
   }
   public Transporte(String c){
   
       this.setCapacidade(c);
   }
    
}
