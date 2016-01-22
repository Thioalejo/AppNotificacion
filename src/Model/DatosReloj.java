/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


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
    public DatosReloj()
    {
        
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        //System.out.println(hora + ":" + minutos + ":" + segundos);
         
        String Hora = Integer.toString(hora);
        String Minutos = Integer.toString(hora);
        String Segundos = Integer.toString(hora);
       
       
    }
    
}
