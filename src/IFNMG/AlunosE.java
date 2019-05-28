
package IFNMG;

public class AlunosE extends GadEPos {
    private String Nome;
    private String Telefone;
    private String Matricula;
    
    public String getNome(){
    
        return this.Nome;
    }
    public String getTelefone(){
    
        return this.Telefone;
    }
    public String getMatricula(){
    
        return this.Matricula;
    }
    public void setNome(String n){
    
        this.Nome = n;
    }
    public void setTelefone(String t){
    
        this.Telefone = t;
    }
    public void setMatricula(String m){
    
        this.Telefone = m;
    }
    public AlunosE(String dg,String dpg, String n, String t,  String m){
    
        super(dg, dpg);
        this.setNome(n);
        this.setTelefone(t);
        this.setMatricula(m);
        
    }
    
}
