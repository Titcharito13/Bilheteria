package bilheteria;

public class VIP extends Ingresso{
        
    public double acrescimo(){
        this.preco = this.preco + 80;
        return this.preco;
    } 
    
    @Override
    public void imprime_Valor(){
        System.out.println("Bilheteria:"
                + "\n\nIngresso VIP: R$"+this.preco);
    }
    
}
