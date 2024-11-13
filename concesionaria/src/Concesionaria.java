import java.util.ArrayList;
import java.util.Optional;
public class Concesionaria {
    private ArrayList<Vehiculo> vehiculos= new ArrayList<>();
    public void agregarVehiculo (Vehiculo vehiculo){

        vehiculos.add(vehiculo);
    }
    public ArrayList<Vehiculo> vehiculosQueConsumenMenosQueUnParametro(double parametro) {
        ArrayList<Vehiculo> vMenos= new ArrayList<>();
        for ( Vehiculo vehiculo : vehiculos) {

            if (vehiculo.gasto100Km() < parametro) {
                vMenos.add(vehiculo);
            }
        }

        return vMenos;
    }

    public Vehiculo elMasEficiente() {
        Vehiculo elMasEficiente = null;
        if ( elMasEficiente == null && vehiculos.size() > 0) {
            elMasEficiente = vehiculos.get(0);
        }
        if (vehiculos.size() > 0) {
            for ( Vehiculo vehiculo : vehiculos) {

                if (vehiculo.calculoDeEficiencia() < elMasEficiente.calculoDeEficiencia()) {
                    elMasEficiente = vehiculo;
                }
            }



        }

        return elMasEficiente;
    }
    public ArrayList ordenarVehiculosPorAccidentes() {
        ArrayList<Vehiculo> vehiculosOrdenados = new ArrayList<>();
        ArrayList<Vehiculo> vehiculosPrueba = vehiculos;
        // Mientras haya vehículos en la lista original
        while (!vehiculosPrueba.isEmpty()) {
            // Encontrar el vehículo con la mayor cantidad de accidentes en 2024
            Vehiculo maxVehiculo = vehiculosPrueba.get(0);
            for (Vehiculo v : vehiculosPrueba) {
                if (v.cantidadDeAccidentesEn2024() > maxVehiculo.cantidadDeAccidentesEn2024()) {
                    maxVehiculo = v;
                }
            }

            // Agregar el vehículo con más accidentes a la lista ordenada
            vehiculosOrdenados.add(maxVehiculo);

            // Remover el vehículo con más accidentes de la lista original
            vehiculosPrueba.remove(maxVehiculo);
        }


        return vehiculosOrdenados;
    }
    public ArrayList ordenarVehiculosConMasKilometraje() {
        ArrayList<Vehiculo> vehiculosOrdenados = new ArrayList<>();
        ArrayList<Vehiculo> vehiculosPrueba = vehiculos;
        // Mientras haya vehículos en la lista original
        while (!vehiculosPrueba.isEmpty()) {
            // Encontrar el vehículo con la mayor cantidad de accidentes en 2024
            Vehiculo maxVehiculo = vehiculosPrueba.get(0);
            for (Vehiculo v : vehiculosPrueba) {
                if (v.getKilometraje() > maxVehiculo.getKilometraje()) {
                    maxVehiculo = v;
                }
            }

            // Agregar el vehículo con más accidentes a la lista ordenada
            vehiculosOrdenados.add(maxVehiculo);

            // Remover el vehículo con más accidentes de la lista original
            vehiculosPrueba.remove(maxVehiculo);
        }


        return vehiculosOrdenados;
    }

}







