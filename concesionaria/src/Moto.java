public class Moto extends Vehiculo {
    private boolean habilitadaRuta;
    private double cilindrada;

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    public void setHabilitadaRuta(boolean habilitadaRuta) {
        this.habilitadaRuta = habilitadaRuta;
    }
    public boolean getHabilitadaRuta (){
        return this.habilitadaRuta;
    }
    @Override
    public double gasto100Km() {
        return 50 + (cilindrada/10);
    }

    @Override
    public double velocidadMaxima() {
        return this.cilindrada/2;
    }

    @Override
    public int cantidadDePasajeros() {
        if (cilindrada > 75) {
            return 2;}
        else {
            return 1;}
    }


}
