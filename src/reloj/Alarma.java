package reloj;

import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase alarma permite crear una alarma para que suene el reloj
 *
 * @author Arturo
 */
public class Alarma extends TimerTask{

    private static int h, m, s, hor, min;
    protected static boolean alarma=false;

    /**
     *
     * Este metodo permite cambiar la alarma mediante una selecion. El valor de
     * la alarma se incrementa de uno en uno
     *
     */
    public static void cambiarHoraAlarma(){
        int selec;
        do{
            selec=Integer.parseInt(JOptionPane.showInputDialog(""
                    +"1-- Sumar horas\n"
                    +"2-- Sumar minutos\n"
                    +"0-- Salir"
                    +"\n\n"
                    +hor+":"+min));//Muestra el valor actual de la alarma

            switch(selec){
                case 1:
                    if(hor<23){
                        hor++;
                    }else{
                        hor=0;
                    }//evita que la hora se pase de 23 y devuelve el valor a 0
                    break;
                case 2:
                    if(min<59){
                        min++;
                    }else{
                        min=0;
                    }//evita que los minutos superen 59 y devuelve su valor a 0
                    break;
                case 3:
                    Alarma.ponerAlarma();
                    break;

            }
        }while(selec!=0);

    }

    /**
     *
     * Es un metodo encargado de dar valores a las horas y minutos de la alarma.
     *
     */
    public static void ponerAlarma(){
        do{
            hor=Integer.parseInt(JOptionPane.showInputDialog("Hora de la alarma"));
            min=Integer.parseInt(JOptionPane.showInputDialog("minutos de la alarma"));
        }while(hor>23||min>59);

    }

    /**
     *
     * Este metodo permite que la alarma suene comparando sus valores con los de
     * la hora acctual solo si la alarma está activada
     *
     * @param al Valor que indica el estado de la alarma
     */
    public static void sonarAlarma(boolean al){
        try{
            if(Hora.h==hor&&Hora.m==min&&al==true){
//                System.out.println("Alarmaaa!!!!!!!!!!");
                Display.mostrarMensaje("Alarmaaa!!!!!!!!!!");
                Thread.sleep(2000);
            }
        }catch(InterruptedException ex){
            Logger.getLogger(Alarma.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * Metodo que permite activar y desactivar la alarma
     *
     * @return Devuelve el estado de la alarma
     */
    public static boolean activarDesactivarAlarma(){
        if(alarma==false){
            alarma=true;
//            System.out.println("Alarma Activada");
            Display.mostrarMensaje("Alarma Activada");
        }else{
            alarma=false;
//            System.out.println("Alarma Desactivada");
            Display.mostrarMensaje("Alarma Desactivada");
        }
        return alarma;
    }

    /**
     *
     * Metodo de la clase TimerTask que permite que la alarma se ejecute a la
     * vez que la hora
     *
     */
    @Override
    public void run(){
        Alarma.sonarAlarma(alarma);
    }

}
