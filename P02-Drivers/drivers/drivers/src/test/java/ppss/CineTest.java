package ppss;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CineTest {
    boolean[] asientos ;
    int solicitados=0;
    Cine cine;
    boolean resultado_obtenido;
    boolean resultado_esperado;

    boolean[] asientos_esperados;


    @Test
    public void ReservaButacasC1(){
        solicitados=3;


        assertEquals(asientos,null);
                assertThrows(ButacasException.class,
                             () -> cine.reservaButacas(asientos,solicitados)
                            );



    }
    @Test
    public void ReservaButacasC2(){
        solicitados=0;
        resultado_esperado=false;
        assertDoesNotThrow(()->cine.reservaButacas(asientos,solicitados),"excepcion lanzada");
        try {
            resultado_obtenido = cine.reservaButacas(asientos, solicitados);
        }catch(Exception e){

        }
        assertAll("grupoTestC2",
                ()->assertEquals(resultado_obtenido,resultado_esperado),
                ()->assertEquals(asientos,asientos_esperados)
        );



    }



}
