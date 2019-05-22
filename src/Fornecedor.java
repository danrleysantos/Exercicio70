
public class Fornecedor extends Pessoa {
    
    private double Saldo;
    private String ValorCredito;
    private String ValorDivida;
    
    public double getSaldo(){
    
        return this.Saldo;
    }
    public String getValorCredito(){
    
        return this.ValorCredito;
    }
    public String getValorDivida(){
    
        return this.ValorDivida;
    }
    public void setValorCredito(String vc){
    
        this.ValorCredito = vc;
    }
    public void setValorDivida(String vd){
    
        this.ValorDivida = vd;
    }
    public Fornecedor(String n, String e, String t, String vc, String vd){
    
        super(n, e, t);
        
        this.setValorCredito(vc);
        this.setValorDivida(vd);
    }
    
    public double ObterSaldo(double valor){
    
        this.Saldo -= valor;
        return this.Saldo;
    }
    
}
