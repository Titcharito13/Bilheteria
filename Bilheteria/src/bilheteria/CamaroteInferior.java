package bilheteria;

public class CamaroteInferior extends VIP {
    
    @Override
    public void imprime_Valor(){
        System.out.println("Bilheteria:"
                + "\n\nIngresso: R$"+this.preco);
    }
}
