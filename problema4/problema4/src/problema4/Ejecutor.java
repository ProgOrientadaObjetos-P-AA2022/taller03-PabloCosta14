/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import problema4.paquete2.DispositivosE;

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
        DispositivosE Eh = new DispositivosE();
        Eh.establecerSistema("Android");
        Eh.establecerTamano(2);
        Eh.establecerCI(15);
        Eh.establecerIva(8);
        Eh.establecerIme("192.228.17.57");
        Eh.establecerMac("00:1e:c2:9e:28:6b");
        Eh.establecerCostoInicial(200);
        Eh.establecerCF(14);
        Eh.establecerCostoFinal();

        System.out.printf("El tipo de sistema es %s\nEl tamaño de la pantalla "
                + "es %s\n", Eh.obtenerSistema(), Eh.obtenerTamano());
        System.out.printf("Costo Inicial es %s\nEl iva porcentaje es %s\n",
                Eh.obtenerCostoIncial(), Eh.obtenerIva());
        System.out.printf("iva del costo Inicial es %s\niva del costo final "
                + "es %s\nDireccion mac es %s\nLa informacion IMEI es %s\nEl C"
                + "osto final es %s",
                Eh.obtenerIvaCi(), Eh.obtenerIvaCF(), Eh.obtenerDmac(),
                Eh.obtenerImei(), Eh.obtenerCostoFinal());
    }

}
