/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import problema3.paquete2.Institucion;

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
        Institucion Eh = new Institucion();

        String a = "La Salle";
        int b = 600;
        int c = 50;
        int d = 12;
        int e = 100;

        Eh.establecerAlumnos(b);
        Eh.establecerNombre(a);
        Eh.establecerDocentes(c);
        Eh.establecerNsedes(d);
        Eh.establecerGastos(e);
        Eh.establecerPresupuesto();

        System.out.printf("Nombre de la Institucion: %s\nNumero de alumnos: "
                + "%s\nNumero de docentes %s\nNumero de sedes: %s\nGastos "
                + "proyectado por estudiante: %s\nPresupuesto: %s\n", Eh.
                        obtenerNombre(), Eh.obtenerAlumnos(), Eh.obtenerDocentes(),
                Eh.obtenerNsedes(), Eh.obtenerGastos(), Eh.obtenerPresupuesto());

    }

}
