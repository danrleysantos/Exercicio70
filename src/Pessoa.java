
public class Pessoa {
    private String Nome;
    private String Endereco;
    private String Telefone;
    
    public String getNome(){
    
        return this.Nome;
    }
    public String getEndereco(){
    
        return this.Endereco;
    }
    public String getTelefone(){
    
        return this.Telefone;
    }
    public void setNome(String n){
    
        this.Nome = n;
    }
    public void setEndereco(String e){
    
        this.Endereco = e;
    }
    public void setTelefone(String t){
    
        this.Telefone = t;
    }
    public Pessoa(String n, String e, String t){
    
        this.setNome(n);
        this.setEndereco(e);
        this.setTelefone(t);
        
    }
}
