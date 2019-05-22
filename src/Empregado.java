
public class Empregado extends Pessoa{
    
    private String CodigoSetor;
    private String SalarioBase;
    private String Impostos;
    
    public String getCodigoSetor(){
    
        return this.CodigoSetor;
    }
    public String getSalarioBase(){
    
        return this.SalarioBase;
    }
    public String getImpostos(){
    
        return this.Impostos;
    }
    public void setCodigoSetor(String cs){
    
        this.CodigoSetor = cs;
    }
    public void setSalarioBase(String sb){
    
        this.SalarioBase = sb;
    }
    public void setImpostos(String i){
    
        this.Impostos = i;
    }
    public Empregado(String n, String e, String t, String cs, String sb, String i){
    
        super(n, e, t);
        this.setCodigoSetor(cs);
        this.setSalarioBase(sb);
        this.setImpostos(i);
        
    }
    
}
