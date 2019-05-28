
package Quest4;

public class AutoMovel extends Transporte {
    
    private String NumRodas;
    private String Cor;
    private String NumPortas;
    private String Placa;
    
    public String getNumRodas(){
    
        return this.NumRodas;
    }
    public String getCor(){
    
        return this.Cor;
    }
       public String getNumPortas(){
    
        return this.NumPortas;
    }
       public String getPlaca(){
    
        return this.Placa;
    }
       public void setNumRodas(String nr){
       
           this.NumRodas = nr;
       }
       public void setNumPortas(String np){
       
           this.NumRodas = np;
       }
       public void setCor(String co){
       
           this.Cor = co;
       }
       public void setPlaca(String p){
       
           this.Placa = p;
       }
    public AutoMovel(String c, String nr, String np, String co, String p){
    
        super(c);
        this.setNumRodas(nr);
        this.setNumPortas(np);
        this.setCor(co);
        this.setPlaca(p);
    }
    
    
}
