/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4.paquete2;

/**
 *
 * @author DELL
 */
public class DispositivosE {

    private String Sistema;
    private double TP;
    private double Ci;
    private double Iva;
    private double ivaCostoinicial;
    private double ivaCostoFinal;
    private String DMac;
    private String IMEI;
    private double costofinal;

    public void establecerSistema(String c) {
        Sistema = c;
    }

    public void establecerTamano(double c) {
        TP = c;

    }

    public void establecerCostoInicial(double c) {
        Ci = c;
    }

    public void establecerCI(double c) {
        ivaCostoinicial = c;

    }
    public void establecerIva(double c) {
        Iva = c;

    }

    public void establecerCF(double c) {
        ivaCostoFinal = c;

    }

    public void establecerMac(String c) {
        DMac = c;

    }

    public void establecerIme(String c) {
        IMEI = c;

    }

    public void establecerCostoFinal() {
        costofinal = Ci + ivaCostoinicial;

    }

    public String obtenerSistema() {
        return Sistema;
    }

    public String obtenerDmac() {
        return DMac;
    }

    public String obtenerImei() {
        return IMEI;
    }

    public double obtenerIva() {
        return Iva;
    }

    public double obtenerTamano() {
        return TP;
    }

    public double obtenerCostoIncial() {
        return Ci;
    }

    public double obtenerIvaCi() {
        return ivaCostoinicial;
    }

    public double obtenerIvaCF() {
        return ivaCostoFinal;
    }

    public double obtenerCostoFinal() {
        return costofinal;
    }

}
