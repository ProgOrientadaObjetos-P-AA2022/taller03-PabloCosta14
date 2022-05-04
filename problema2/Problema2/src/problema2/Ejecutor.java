/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import problema2.paquete2.EquivalenteHora;

/**
 *
 * @author DELL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquivalenteHora Eh = new EquivalenteHora();
        int horas = 48;

        Eh.establecerhoras(horas);
        Eh.establecerMinutos();
        Eh.establecerSegundos();
        Eh.establecerDias();

        System.out.printf("Numero de horas: %s\nEn minutos: %s\nEn segundos: "
                + "%s\nEn dias: %s\n", Eh.obtenerHoras(), Eh.obtenerMinutos(),
                Eh.obtenerSegundos(), Eh.obtenerDias());

    }
}
