package reloj;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Reloj{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Alarma al=new Alarma();
        int s=Integer.parseInt(JOptionPane.showInputDialog("1-- Estado de alarma"
                +"\n2 Reloj"));
//        do{
            switch(s){
                case 1:
                    al.activarDesactivarAlarma();
                    break;
                case 2:
                    Hora.tiempo();
                    break;
                default:
                    System.out.println("Seleccion Incorrecta");
            }
//        }while(s!=0);
    }

}
