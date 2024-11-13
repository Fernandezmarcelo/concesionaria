public class Autos extends Vehiculo{

    private int cantidadDePasajeros;
    private double velocidadMaxima;


    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }



    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public double gasto100Km() {
        return 20 + (cantidadDePasajeros * 10);
    }

    @Override
    public double velocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public int cantidadDePasajeros() {
        return cantidadDePasajeros;
    }



}