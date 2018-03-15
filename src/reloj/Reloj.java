package reloj;

import javax.swing.JOptionPane;

/**
 * Clase principar del programa
 *
 * @author Arturo
 */
public class Reloj{

    /**
     * 
     * Metodo Main contiene el switch para la selecion de los metodos
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Alarma al=new Alarma();
        Hora ho=new Hora();
        int s;
        do{
            s=Integer.parseInt(JOptionPane.showInputDialog("1-- Estado Alarma"
                    +"\n2-- Reloj"
                    +"\n3-- Poner hora alarma"));
            switch(s){
                case 1:
                    al.activarDesactivarAlarma();
                    break;
                case 2:
                    ho.tiempo();
                    break;
                case 3:
                    Alarma.cambiarHoraAlarma();
                    break;
                default:
                    System.out.println("Seleccion Incorrecta");
            }
        }while(true);
    }

}
