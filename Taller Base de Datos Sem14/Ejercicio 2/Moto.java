/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatospoo;

/**
 *
 * @author PCENTER
 */
public class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto: " + marca + " " + modelo);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}