import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ConcesionariaTest {

    @Test
    void vehiculosQueConsumenMenosQueUnParametroTest() {
        Concesionaria concesionaria = new Concesionaria();
        Vehiculo bici = new Bicicleta() ;
        Vehiculo moto = new Moto() ;
        moto.setCilindrada( 100) ;
        Vehiculo auto1 = new Autos() ;
        auto1.setCantidadDePasajeros( 4);
        Vehiculo auto2 = new Autos() ;
        auto2.setCantidadDePasajeros(5) ;
        concesionaria.agregarVehiculo( bici) ;
        concesionaria.agregarVehiculo( moto) ;
        concesionaria.agregarVehiculo(auto1) ;
        concesionaria.agregarVehiculo( auto2) ;
        assertEquals(true, concesionaria.vehiculosQueConsumenMenosQueUnParametro( 69).size() == 4) ;
    }
    @Test
    void elMasEficienteTest() {
        Concesionaria concesionaria = new Concesionaria();
        Vehiculo bici = new Bicicleta() ;
        Vehiculo moto = new Moto() ;
        moto.setCilindrada(100) ;
        Vehiculo auto1 = new Autos() ;
        auto1.setCantidadDePasajeros( 4) ;
        Vehiculo auto2 = new Autos() ;
        auto2.setCantidadDePasajeros( 5) ;
        concesionaria.agregarVehiculo(bici) ;
        concesionaria.agregarVehiculo(moto) ;
        concesionaria.agregarVehiculo( auto1) ;
        concesionaria.agregarVehiculo(auto2) ;
        assertEquals(bici,concesionaria.elMasEficiente());


    }
    @Test
    void trasportarAUnaVelocidadTest() {
        Vehiculo bici = new Bicicleta() ;
        Vehiculo moto1 = new Moto() ;
        Vehiculo moto2 = new Moto() ;
        bici.setRodado(20);
        moto1.setCilindrada(100) ;
        moto2.setCilindrada(70) ;
        Autos auto1 = new Autos();
        auto1.setCantidadDePasajeros(2);
        auto1.setVelocidadMaxima(100);
        assertEquals(0, bici.cantidadDePasajerosAUnaVelocidad(50));
        assertEquals(1, bici.cantidadDePasajerosAUnaVelocidad(20));
        assertEquals(2, moto1.cantidadDePasajerosAUnaVelocidad(49));
        assertEquals(0, moto1.cantidadDePasajerosAUnaVelocidad(60));
        assertEquals(0, moto2.cantidadDePasajerosAUnaVelocidad(49));
        assertEquals(2, auto1.cantidadDePasajerosAUnaVelocidad(40));

    }

    @Test
    public void testOrdenarVehiculosPorAccidentes() {
        Concesionaria concesionaria = new Concesionaria();
        // Crear algunos vehículos y agregar accidentes
        Vehiculo vehiculo1 = new Bicicleta();
        vehiculo1.setPatente("AAA111");
        vehiculo1.agregarAccidentes(2024);
        vehiculo1.agregarAccidentes(2024); // 2 accidentes en 2024

        Vehiculo vehiculo2 = new Moto();
        vehiculo2.setPatente("BBB222");
        vehiculo2.agregarAccidentes(2024); // 1 accidente en 2024

        Vehiculo vehiculo3 = new Autos();
        vehiculo3.setPatente("CCC333");
        vehiculo3.agregarAccidentes(2024);
        vehiculo3.agregarAccidentes(2024);
        vehiculo3.agregarAccidentes(2024); // 3 accidentes en 2024
        concesionaria.agregarVehiculo(vehiculo1);
        concesionaria.agregarVehiculo(vehiculo2);
        concesionaria.agregarVehiculo(vehiculo3);

        ArrayList<Vehiculo> vehiculosOrdenados = concesionaria.ordenarVehiculosPorAccidentes();

        // Verificar que los vehículos están ordenados correctamente
        assertEquals("CCC333", vehiculosOrdenados.get(0).getPatente(), "El vehículo con más accidentes debería estar primero.");
        assertEquals("AAA111", vehiculosOrdenados.get(1).getPatente(), "El vehículo con la segunda mayor cantidad de accidentes debería estar en segundo lugar.");
        assertEquals("BBB222", vehiculosOrdenados.get(2).getPatente(), "El vehículo con la menor cantidad de accidentes debería estar al final.");
    }
    @Test
    void ordenarVehiculosConMasKilometrajeTest() {
        Concesionaria concesionaria = new Concesionaria();
        // Crear algunos vehículos con diferentes kilometrajes
        Vehiculo vehiculo1 = new Bicicleta();
        vehiculo1.setPatente("AAA111");
        vehiculo1.setKilometraje(50000); // Kilometraje de 50,000 km

        Vehiculo vehiculo2 = new Moto();
        vehiculo2.setPatente("BBB222");
        vehiculo2.setKilometraje(100000); // Kilometraje de 100,000 km

        Vehiculo vehiculo3 = new Autos();
        vehiculo3.setPatente("CCC333");
        vehiculo3.setKilometraje(75000); // Kilometraje de 75,000 km

        concesionaria.agregarVehiculo(vehiculo1);
        concesionaria.agregarVehiculo(vehiculo2);
        concesionaria.agregarVehiculo(vehiculo3);

        ArrayList<Vehiculo> vehiculosOrdenados = concesionaria.ordenarVehiculosConMasKilometraje();

        // Verificar que los vehículos están ordenados correctamente por kilometraje de mayor a menor
        assertEquals("BBB222", vehiculosOrdenados.get(0).getPatente(), "El vehículo con mayor kilometraje debería estar primero.");
        assertEquals("CCC333", vehiculosOrdenados.get(1).getPatente(), "El vehículo con el segundo mayor kilometraje debería estar en segundo lugar.");
        assertEquals("AAA111", vehiculosOrdenados.get(2).getPatente(), "El vehículo con el menor kilometraje debería estar al final.");
    }

    }





