
public class Empregado extends Pessoa{
    
    private String CodigoSetor;
    private double SalarioBase;
    private double Impostos;
    
    public String getCodigoSetor(){
    
        return this.CodigoSetor;
    }
    public double getSalarioBase(){
    
        return this.SalarioBase;
    }
    public double getImpostos(){
    
        return this.Impostos;
    }
    public void setCodigoSetor(String cs){
    
        this.CodigoSetor = cs;
    }
    public void setSalarioBase(double sb){
    
        this.SalarioBase = sb;
    }
    public void setImpostos(double i){
    
        this.Impostos = i;
    }
    public Empregado(String n, String e, String t, String cs, double sb, double i){
    
        super(n, e, t);
        this.setCodigoSetor(cs);
        this.setSalarioBase(sb);
        this.setImpostos(i);
        
    }
    
    public double calcularSalario(){
    
        double salario;
        salario = this.SalarioBase * this.Impostos;
        return salario;
    }
    
}
