import org.testng.annotations.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class AlquilaCochesTest {

    TipoCoche tipo;
    CalendarioStub calendario = new CalendarioStub();
    LocalDate[] fechas;
    int num_dias;


    AlquilaCochesTestable testable = new AlquilaCochesTestable();
    Servicio servicio = new Servicio();
    Ticket ticket;
    @Test
    void calculaPrecioC1() {
        tipo=TipoCoche.TURISMO;
        LocalDate fecha = LocalDate.of(2023,5,10);
        num_dias=10;
        Ticket resultado_esperado=new Ticket();
        Ticket resultado_obtenido=resultado_esperado;
        resultado_esperado.setPrecio_final(75);
        int[] dias=new int[]{-1};
        calendario.setFestivos(dias);
        servicio = new ServicioStub(10);
        testable.setServicio(servicio);
        calendario = new CalendarioStub();
        testable.setCalendarioStub(calendario);
        assertAll("grupoTestC1",
                ()->assertEquals(resultado_esperado.get(),
                assertDoesNotThrow(
                    ()-> testable.calculaPrecio(tipo,fecha,num_dias).get(),"excepcion lanzadaa"))

                );

    }
    @Test
    void calculaPrecioC2() {
        tipo=TipoCoche.CARAVANA;
        LocalDate fecha = LocalDate.of(2023,6,19);
        num_dias=7;
        int[] dias= new int []{20,24};
        calendario.setFestivos(dias);
        Ticket resultado_esperado=new Ticket();
        Ticket resultado_obtenido=resultado_esperado;
        resultado_esperado.setPrecio_final((float)62.5);

        calendario.setFestivos(dias);
        servicio = new ServicioStub(10);
        testable.setServicio(servicio);
        calendario = new CalendarioStub();
        testable.setCalendarioStub(calendario);

        //System.out.println(testable.calendario.getCalendario()[0]);
        assertAll("grupoTestC1",
                ()->assertEquals(resultado_esperado.get(),
                        assertDoesNotThrow(
                                ()-> testable.calculaPrecio(tipo,fecha,num_dias).get(),"excepcion lanzadaa"))

        );

    }


}
