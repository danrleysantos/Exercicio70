
package Quest2;

public class Professores {
    
    private String Nome;
    private String Idade;
    private String Nmatricula;
    
    public String getNome(){
    
        return this.Nome;
    }
    
    public String getIdade(){
    
        return this.Idade;
    }
    
    public String getNmatricula(){
    
        return this.Nmatricula;
    }
    
    public void setNome(String n){
    
        this.Nome = n;
    }
    
     public void setIdade(String i){
    
        this.Nome = i;
    }
     
      public void setNmatricula(String nm){
    
        this.Nome = nm;
    }
      
      public Professores(String n, String i, String nm){
      
          this.setNome(n);
          this.setIdade(i);
          this.setNmatricula(nm);
          
      }
      
}
