package bilheteria;

public class Normal extends Ingresso{
    
    @Override
    public void imprime_Valor(){
        System.out.println("Valores:"
                + "\nIngresso: R$"+this.preco);
    }
    
}
