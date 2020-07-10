package bilheteria;

public class CamaroteSuperior extends VIP {
    
    @Override
    public double acrescimo(){
        this.preco = this.preco + 100;
        return this.preco;
    } 
    
    @Override
    public void imprime_Valor(){
        System.out.println("Valor:"
                + "\nCamarote: Superior"
                + "\nTotal: R$"+this.preco
        );
    }
    
}
