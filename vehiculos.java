// Clase principal
public class Vehiculos {
    public static void main(String[] args){
        probarVehiculos();
    }            

    public static void probarVehiculos(){
        Vehiculo v1 = new Auto("Toyota", "Corolla", 4);
        Vehiculo v2 = new Moto("Yamaha", "R15", true);
        Vehiculo v3 = new Camion("Volvo", "FH", 20);

        v1.acelerar();
        v2.acelerar();
        v3.acelerar();
    }
}

// Clase BaseS
class Vehiculo { 
    protected String marca;
    protected String modelo;
    protected int velocidad;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar(){
        System.out.println("El vehiculo esta acelerando......");
    }
}



// Clase Auto
class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int numeroPuertas){
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void acelerar(){
        velocidad += 20;
        System.out.println("El auto acelera suavemente. Velocidad actual: " + velocidad + " Km/h");
    }
}

// Clase Moto
class Moto extends Vehiculo {
    private boolean deportiva;

    public Moto(String marca, String modelo, boolean deportiva){
        super(marca, modelo);
        this.deportiva = deportiva;
    }

    @Override 
    public void acelerar(){
        velocidad += 30;
        System.out.println("La moto acelera rapidamente. Velocidad actual: " + velocidad + " Km/h");
    }
}

// Clase Camion
class Camion extends Vehiculo {
    private double cargaMaxima;

    public Camion(String marca, String modelo, double cargaMaxima){
        super(marca, modelo);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void acelerar(){
        velocidad += 10;
        System.out.println("El camion acelera lentamente. Velocidad actual: " + velocidad + " Km/h");
    }
}