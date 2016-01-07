/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Vista.Notificacion;
import Vista.Pri;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Time {

    private static int horas = 0, minutos = 0, segundos = 0;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
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

    public Time() {

    }

    public void Tiempo(
            String TiempoEnHoras,
            String TiempoEnMinutos,
            String TiempoEnSegundos
    ) throws InterruptedException {

        int TiempoHoras = Integer.parseInt(TiempoEnHoras);
        int TiempoMinutos = Integer.parseInt(TiempoEnMinutos);
        int TiempoSegundos = Integer.parseInt(TiempoEnSegundos);

        while (horas < TiempoHoras || minutos < TiempoMinutos || segundos < TiempoSegundos) {
            Thread.sleep(1000);
            segundos = segundos + 1;
            if (segundos >= 60) {
                segundos = 0;
                minutos = minutos + 1;
            }
            if (minutos >= 60) {
                minutos = 0;
                horas = horas + 1;
            }
            System.out.println("Corre Tiempo: " + horas + ":" + minutos + ":" + segundos);

        }

    }

}
