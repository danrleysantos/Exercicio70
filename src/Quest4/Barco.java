
package Quest4;

public class Barco  extends Transporte {
    
    public String Nome;
    
     public String getNome(){
    
        return this.Nome;
    }
    public void setNome(String n){
       
          this.Nome = n;
       }
    public Barco(String c){
    
        super(c);
        this.setNome(c);
    }
    
}
