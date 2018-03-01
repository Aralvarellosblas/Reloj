package reloj;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Alarma{

    private int horaA, minutoA;
    private boolean estado=false;

    public Alarma(){
        horaA=12;
        minutoA=00;
    }

    public boolean isEstado(){
        return estado;
    }
    

    public void activarDesactivarAlarma(){
        if(estado==false){
            estado=true;
            Display.mostrarMensaje("Alarma Activada");
        }else{
            estado=false;
            Display.mostrarMensaje("Alarma Desactivada");
        }
    }

    public void cambiarHoraAlarma(){
        int selec;
        do{
            selec=Integer.parseInt(JOptionPane.showInputDialog(""
                    +"1-- Sumar horas\n"
                    +"2-- Sumar minutos\n"
                    +"0-- Salir"
                    +"\n\n"+horaA+":"+minutoA));

            switch(selec){
                case 1:
                    if(horaA<23){
                        horaA++;
                    }else{
                        horaA=0;
                    }
                    break;
                case 2:
                    if(minutoA<59){
                        minutoA++;
                    }else{
                        minutoA=0;
                    }
                    break;
            }
        }while(selec!=0);

    }

}
