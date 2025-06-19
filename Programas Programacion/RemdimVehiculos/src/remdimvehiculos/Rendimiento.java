package remdimvehiculos;

public class Rendimiento {
    private String marca;
    private String modelo;
    private String placa;
    private double[] metrosaceleracion;
    private double[] velocidadalcanzada;
    private double[] tiempoalcanzado;

    public Rendimiento(String marca, String modelo, String placa, double[] metrosaceleracion, double[] velocidadalcanzada, double[] tiempoalcanzado) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.metrosaceleracion = metrosaceleracion;
        this.velocidadalcanzada = velocidadalcanzada;
        this.tiempoalcanzado = tiempoalcanzado;
    }

    public String getMarca() { 
        return marca; 
    }
    
    public String getModelo() { 
        return modelo; 
    }
    
    public String getPlaca() { 
        return placa; 
    }
    
    public double[] getMetrosaceleracion() { 
        return metrosaceleracion; 
    }
    
    public double[] getVelocidadalcanzada() { 
        return velocidadalcanzada; 
    }
    
    public double[] getTiempoalcanzado() { 
        return tiempoalcanzado; 
    }

    public void setMarca(String marca) { 
        this.marca = marca; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    
    public void setPlaca(String placa) { 
        this.placa = placa; 
    }
    
    public void setMetrosaceleracion(double[] metrosaceleracion) { 
        this.metrosaceleracion = metrosaceleracion; 
    }
    
    public void setVelocidadalcanzada(double[] velocidadalcanzada) { 
        this.velocidadalcanzada = velocidadalcanzada; 
    }
    public void setTiempoalcanzado(double[] tiempoalcanzado) { 
        this.tiempoalcanzado = tiempoalcanzado; 
    }

    public double calcularTiempoPromedio100() {
        for (int i = 0; i < velocidadalcanzada.length; i++) {
            if (velocidadalcanzada[i] == 100) return tiempoalcanzado[i];
        }
        return -1;
    }

    public double calcularEspacioPromedio100() {
        for (int i = 0; i < velocidadalcanzada.length; i++) {
            if (velocidadalcanzada[i] == 100) return metrosaceleracion[i];
        }
        return -1;
    }

    public String calcularMesMatriculacion() {
        char ultimoDigito = placa.charAt(placa.length() - 1);
        return switch (ultimoDigito) {
            case '1' -> "Febrero";
            case '2' -> "Marzo";
            case '3' -> "Abril";
            case '4' -> "Mayo";
            case '5' -> "Junio";
            case '6' -> "Julio";
            case '7' -> "Agosto";
            case '8' -> "Septiembre";
            case '9' -> "Octubre";
            case '0' -> "Noviembre";
            default -> "Desconocido";
        };
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Tiempos: ");
        for (double t : tiempoalcanzado) System.out.print(t + " ");
        System.out.println("\nMetros: ");
        for (double m : metrosaceleracion) System.out.print(m + " ");
        System.out.println("\nVelocidades: ");
        for (double v : velocidadalcanzada) System.out.print(v + " ");

        System.out.println("\nTiempo promedio hasta 100 km/h: " + calcularTiempoPromedio100() + " seg");
        System.out.println("Espacio promedio hasta 100 km/h: " + calcularEspacioPromedio100() + " metros");
        System.out.println("Mes de matriculación: " + calcularMesMatriculacion());
    }
}