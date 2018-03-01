package reloj;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Display{

    public static void mostrarHora(int h, int m, int s, boolean alarma){
        if(alarma==true){
            System.out.println(h+":"+m+":"+s+" Alarm");
        }else System.out.println(h+":"+m+":"+s);
    }

    public static void mostrarMensaje(String m){
        JOptionPane.showMessageDialog(null, m);
    }

    public static void mostrarAlarma(int ah, int am){
        System.out.println(ah+":"+am);
    }
}
