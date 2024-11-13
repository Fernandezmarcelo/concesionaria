public class Bicicleta extends Vehiculo{
    private double rodado;

    public void setRodado(double rodado) {
        this.rodado = rodado;
    }

    public double getRodado() {
        return rodado;
    }

    @Override
    public double gasto100Km() {
        return 1;
    }

    @Override
    public double velocidadMaxima() {
        return rodado * 1.2;
    }

    @Override
    public int cantidadDePasajeros() {
        return 1;
    }
}
