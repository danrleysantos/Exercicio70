
package Universidade;

public class ProfRI extends Professores {
    
    private double horastrabalhadas;
    private double salario;
    
    public double gethorastrabalhadas(){
    
        return this.horastrabalhadas;
    }
    
    public double getsalario(){
    
        return this.salario;
    }
    
    public void setsalario(double v){
    
        this.salario = v;
    }
    
    
    public ProfRI(String n, String i, String nm, double v){
    
        super(n, i, nm);
        this.setsalario(v);
    } 
    
    
    
}