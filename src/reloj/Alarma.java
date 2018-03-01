package reloj;

import javax.swing.JOptionPane;

/**
 * La clase alarma permite crear una alarma para que suene el reloj
 *
 * @author Arturo
 */
public class Alarma{

    private int horaA, minutoA;
    private boolean estado=false;

    /**
     * Constructor de la clase Alarma, inicia la alarma a una hora por defecto
     */
    public Alarma(){
        horaA=12;
        minutoA=00;
    }

    /**
     * Metodo de acceso que permite el estado de la alarma
     *
     * @return un valor boolean si la alarma está activa o no
     */
    public boolean isEstado(){
        return estado;
    }

    /**
     * Metodo que cambia el estado de la alarma, si estaba activo lo desactiva y
     * si estaba desactivado la activa
     *
     * Tambien muestra un mensaje por pantalla para conocer el estado del cambio
     * (este mensaje es temporal)
     */
    public void activarDesactivarAlarma(){
        if(estado==false){
            estado=true;
            Display.mostrarMensaje("Alarma Activada");
        }else{
            estado=false;
            Display.mostrarMensaje("Alarma Desactivada");
        }
    }

    /**
     * Este metodo permite cambiar la alarma mediante una selecion. El valor de
     * la alarma se incrementa de uno en uno
     */
    public void cambiarHoraAlarma(){
        int selec;
        do{
            selec=Integer.parseInt(JOptionPane.showInputDialog(""
                    +"1-- Sumar horas\n"
                    +"2-- Sumar minutos\n"
                    +"0-- Salir"
                    +"\n\n"
                    +horaA+":"+minutoA));//Muestra el valor actual de la alarma

            switch(selec){
                case 1:
                    if(horaA<23){
                        horaA++;
                    }else{
                        horaA=0;
                    }//evita que la hora se pase de 23 y devuelve el valor a 0
                    break;
                case 2:
                    if(minutoA<59){
                        minutoA++;
                    }else{
                        minutoA=0;
                    }//evita que los minutos superen 59 y devuelve su valor a 0
                    break;
            }
        }while(selec!=0);

    }

}
