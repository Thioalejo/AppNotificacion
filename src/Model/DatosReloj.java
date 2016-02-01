/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Vista.Notificacion;
import java.awt.AWTException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class DatosReloj 
{
   int hora, minutos, segundos;


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
   Calendar calendario = Calendar.getInstance();
   //Calendar calendario = new GregorianCalendar();
    public void DatosReloj(String Horas, String Minutos, String Segundos) throws AWTException
    {
       // LocalDate FechaActual = LocalDate.now();
      
        String HoraTiempo="";
        String MinutosTiempo="";
        String SegundosTiempo="";
        
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
         System.out.println("Hora: "+hora+"Minutos: "+minutos+"Segundos: "+segundos);
        
        
        HoraTiempo = Integer.toString(hora);
        MinutosTiempo = Integer.toString(minutos);
        SegundosTiempo = Integer.toString(segundos);
           
        
        
        if(Horas.equals(HoraTiempo) && Minutos.equals(MinutosTiempo) && Segundos.equals(SegundosTiempo))
        {
            Vista.Notificacion ventana = new Notificacion();
            ventana.ParametrosDeVentana();
            
        }
        
        
       
        
        
        
        
//         
//        String Hora = Integer.toString(Horas);
//        String Minutos = Integer.toString(Minutos);
//        String Segundos = Integer.toString(Segundos);
       
       
    }
    
}
