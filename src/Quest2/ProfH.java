
package Quest2;

public class ProfH extends Professores{
    
    private double Horastrabalhadas;
    private double Valorhora;
    
     public double getHorastrabalhadas(){
    
        return this.Horastrabalhadas;
    }
      public double getValorhora(){
    
        return this.Valorhora;
    }
      public void setHorastrabalhadas(double ht){
    
        this.Horastrabalhadas = ht;
    }
       public void setValorhora(double vh){
    
        this.Valorhora = vh;
    }
    
    public ProfH(String n, String i, String nm, double vh,  double ht){
    
        super(n, i, nm);
        this.setValorhora(vh);
        this.setHorastrabalhadas(ht);
        
    } 
}


