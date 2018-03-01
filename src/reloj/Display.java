package reloj;

import javax.swing.JOptionPane;

/**
 * Esta clase contiene los metodos necesarios para mostrar la informacion del
 * programa
 *
 * @author Arturo
 */
public class Display{

    /**
     * Metodo que muestra la hora actual del Reloj
     *
     * @param h hora
     * @param m minutos
     * @param s segundos
     * @param alarma valor que permite saber si la alarma está activada o no
     */
    public static void mostrarHora(int h, int m, int s, boolean alarma){
        if(alarma==true){
            System.out.println(h+":"+m+":"+s+" Alarm");
        }else{
            System.out.println(h+":"+m+":"+s);
        }
    }

    /**
     * Metodo que permite mostrar mensajes de información
     *
     * @param m contenido del mensaje
     */
    public static void mostrarMensaje(String m){
        JOptionPane.showMessageDialog(null, m);
    }

    /**
     * Metodo que permite que se muestre la hora a la que está puesta la alarma
     *
     * @param ah hora de la alarma
     * @param am minuto de la alarma
     */
    public static void mostrarAlarma(int ah, int am){
        System.out.println(ah+":"+am);
    }
}
