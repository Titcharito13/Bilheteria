package bilheteria;

import javax.swing.JOptionPane;

public class Bilheteria {

    public static void main(String[] args) {
        
        int bola;        
        bola = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para escolher Ingresso Normal" + "\nDigite 2 para escolher Ingresso VIP"));
        
        switch(bola){
            case 1:
                Normal skate = new Normal();
                skate.imprime_Valor();
                break;
            case 2:
                VIP vip = new VIP();
                vip.acrescimo();
                int cebola;
                cebola = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para reservar no Camarote Inferior\nDigite 2 para reservar no Camarote Superior"));
                    switch(cebola){
                        case 1:
                            CamaroteInferior inf = new CamaroteInferior();
                            inf.acrescimo();
                            inf.imprime_Valor();
                            break;
                        case 2:
                            CamaroteSuperior sup = new CamaroteSuperior();
                            sup.acrescimo();
                            sup.imprime_Valor();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Digite um numero válido");
                            break;
                    }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite um numero válido");
                System.exit(0);
                break;
    
    
        }
        
    }
    
}
