/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.newpackage;

/**
 *
 * @author PabloCosta14
 */
public class Terreno {

    private double ancho;
    private double largoM;
    private double valorMcuadrado;
    
    private double area;
    private double costo;

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerlargoM(double c) {
        largoM = c;
    }

    public void establecerValorMcuadrado(double c) {
        valorMcuadrado = c;
    }

    public void establecerArea() {
        area = largoM * ancho;
    }

    public void valor_CostoTerreno() {
        costo = area * valorMcuadrado;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargoM() {
        return largoM;
    }

    public double obtenerValorMcuadrado() {
        return valorMcuadrado;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValor_CostoTerreno() {
        return costo;
    }

}
