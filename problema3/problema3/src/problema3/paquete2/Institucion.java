/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3.paquete2;

/**
 *
 * @author PabloCosta14
 */
public class Institucion {

    private String nombre;
    private int alumnos;
    private int docentes;
    private int Nsedes;
    private double gastos;
    private double presupuesto;

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerAlumnos(int c) {
        alumnos = c;

    }

    public void establecerDocentes(int c) {
        docentes = c;
    }

    public void establecerNsedes(int c) {
        Nsedes = c;

    }

    public void establecerGastos(int c) {
        gastos = c;

    }

    public void establecerPresupuesto() {
        presupuesto = alumnos * gastos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerAlumnos() {
        return alumnos;
    }

    public int obtenerDocentes() {
        return docentes;
    }

    public int obtenerNsedes() {
        return Nsedes;
    }

    public double obtenerGastos() {
        return gastos;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
