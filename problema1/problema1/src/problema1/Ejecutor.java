/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import problema1.newpackage.Terreno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Terreno Terr = new Terreno();
        double ancho = 20;
        double largo = 30;
        double metroCuadrado = 500;
        Terr.establecerAncho(ancho);
        Terr.establecerlargoM(largo);
        Terr.establecerValorMcuadrado(metroCuadrado);

        Terr.establecerArea();
        Terr.valor_CostoTerreno();

        System.out.printf("Factura de Terreno\n\nAncho: %.2f\n"
                + "Largo: %.2f\nMetroCuadrado: %.2f\n"
                + "Area: %.2f\nValor del Terreno: %.2f\n", Terr.obtenerAncho(),
                Terr.obtenerLargoM(), Terr.obtenerValorMcuadrado(),
                Terr.obtenerArea(), Terr.obtenerValor_CostoTerreno());

    }

}
