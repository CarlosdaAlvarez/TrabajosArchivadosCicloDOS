/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatospoo;

/**
 *
 * @author PCENTER
 */
public abstract class Vehiculo {
    public String marca;
    public String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void mostrarInformacion();
    public abstract String getTipo();
}