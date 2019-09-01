package test;

import com.elecciones.model.Cargo;
import com.elecciones.model.Lista;
import com.elecciones.model.Partido;
import com.elecciones.model.Postulante;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tests {

    private List<Partido> mockPartidos = new ArrayList<>();
    private List<Lista> mockListas = new ArrayList<>();

    @Before
    public void setUp() {

        // Partidos
        mockPartidos.add(new Partido("Juntos por el Cambio", new Date(), true));
        mockPartidos.add(new Partido("Despertar", new Date(), true));
        mockPartidos.add(new Partido("Consenso Federal", new Date(), true));
        mockPartidos.add(new Partido("Partido Autonomista", new Date(), false));

        // Lista 1
        List<Postulante> plista1 = new ArrayList<>();
        plista1.add(new Postulante("11222333", "Mauricio", "Macri", Cargo.PRESIDENTE));
        plista1.add(new Postulante("11444555", "Miguel", "Pichetto", Cargo.VICEPRESIDENTE));
        mockListas.add(new Lista("135 A", "Juntos somos el cambio", mockPartidos.get(0), plista1));

        // Lista 2
        List<Postulante> plista2 = new ArrayList<>();
        plista2.add(new Postulante("22666777", "Jose", "Espert", Cargo.PRESIDENTE));
        plista2.add(new Postulante("22888999", "Luis", "Rosales", Cargo.VICEPRESIDENTE));
        mockListas.add(new Lista("87", "Lista 'A' Despertar", mockPartidos.get(1), plista2));

        // Lista 3
        List<Postulante> plista3 = new ArrayList<>();
        plista3.add(new Postulante("33111222", "Roberto", "Lavagna", Cargo.PRESIDENTE));
        plista3.add(new Postulante("33555888", "Juan", "Uturbey", Cargo.VICEPRESIDENTE));
        mockListas.add(new Lista("504 A", "Consenso para el futuro", mockPartidos.get(2), plista3));


        // Lista 4
        List<Postulante> plista4 = new ArrayList<>();
        plista4.add(new Postulante("44111222", "Antonio", "Romero Feris", Cargo.PRESIDENTE));
        plista4.add(new Postulante("44333555", "Guillermo", "Sueldo", Cargo.VICEPRESIDENTE));
        mockListas.add(new Lista("36 A", "Valores y Experiencia", mockPartidos.get(3), plista4));

    }

    @Test
    public void listasPresentadas_Test() throws Exception {
        Assert.assertEquals(4, mockListas.size());
    }

    @Test
    public void postulantesPorLista_Test() throws Exception {
        mockListas.forEach(x -> {
            int postulantes = x.getPostulantes().size();
            Assert.assertEquals(x.getPostulantes().size(), postulantes);
        });
    }

    @Test
    public void listasVigentes_Test() throws Exception {
        long listasVigentes = mockListas.stream().filter(x -> x.getPartido().isVigente()).count();
        Assert.assertEquals(3, listasVigentes);
    }

    @Test
    public void cambioVigencia_Test() throws Exception {
        mockPartidos.get(3).setVigente(true);
        long listasVigentes = mockListas.stream().filter(x -> x.getPartido().isVigente()).count();
        Assert.assertEquals(4, listasVigentes);
    }

}
