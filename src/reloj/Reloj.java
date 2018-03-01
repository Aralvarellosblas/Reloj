package reloj;

import javax.swing.JOptionPane;

/**
 * Clase principar del programa
 *
 * @author Arturo
 */
public class Reloj{

    /**
     * Metodo Main contiene el switch para la selecion de los metodos
     *
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
