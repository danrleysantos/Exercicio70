
public class Teste {
    public static void main(String[] args ){
        
        Pessoa p1 = new Pessoa("Danrley", "Rua B", "37434537");
        
               System.out.println(p1.getNome());
                 System.out.println(p1.getEndereco());
                   System.out.println(p1.getTelefone());
        
        Fornecedor f1 = new Fornecedor("Coca", "EUA", "3743", 2000, 500);
        
                System.out.println(f1.ObterSaldo());
        
         Empregado e1 = new Empregado("Danrley", "Rua B", "37434537", "001", 5000, 0.25);
        
                System.out.println(e1.calcularSalario());
        
    }
}
