import java.util.ArrayList;
import java.util.Optional;
public abstract class Vehiculo {

    private  String patente ;
    ArrayList<Integer> accidentes= new ArrayList<>() ;
    private double kilometraje;

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public ArrayList getAccidentes() {
        return accidentes;
    }
    public int cantidadDeAccidentesEn2024() {
        int contadorDeAccidentes = 0;
        if (accidentes.contains(2024)) {
            for (int totalAccidentesEn2024 : accidentes) {
                if (totalAccidentesEn2024 == 2024) {
                    contadorDeAccidentes += 1;
                }

            }
        }
        return contadorDeAccidentes;
    }
        public void setAccidentes(ArrayList accidentes) {
                this.accidentes = accidentes;
            }



    public void agregarAccidentes(int i) {
        accidentes.add(i);
    }

    public double calculoDeEficiencia() {

        return  (cantidadDePasajeros() * velocidadMaxima())/ gasto100Km();
    }
    public int cantidadDePasajerosAUnaVelocidad (double velocidad) {
        if (velocidad > velocidadMaxima()) {
            return 0;
        }
        else {
            return cantidadDePasajeros();
        }
    }


    public abstract double gasto100Km ();
    public abstract double velocidadMaxima();
    public abstract int cantidadDePasajeros();

    public void setCilindrada(int i) {
    }
    public void setCantidadDePasajeros(int i){}

    public  double getRodado(double i) { return 0;
    }

    public void setRodado(double i) {
    }
}
