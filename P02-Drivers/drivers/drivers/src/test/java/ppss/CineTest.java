package ppss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CineTest {
    boolean[] asientos ;
    int solicitados=0;
    Cine cine = new Cine();
    boolean resultado_obtenido;
    boolean resultado_esperado;

    boolean[] asientos_esperados;


    @Test
    public void ReservaButacasC1(){
        solicitados=1;

        resultado_esperado= true;
        asientos= new boolean[]{false, false, false};
        asientos_esperados = new boolean[]{true,false,false};





        assertAll("grupoTestC1",
                ()->assertEquals(resultado_esperado, resultado_obtenido= assertDoesNotThrow(
                        ()->cine.reservaButacas(asientos,solicitados),"excepcion lanzada")),
                ()->assertArrayEquals(asientos,asientos_esperados)

        );



    }
    @Test
    public void ReservaButacasC2(){
        solicitados=1;
        resultado_esperado=false;
        asientos= new boolean []{true};
        asientos_esperados= asientos;
        asientos_esperados[0]=true;


        assertAll("grupoTestC2",
                ()->assertEquals(resultado_esperado,
                        assertDoesNotThrow(()->cine.reservaButacas(asientos,solicitados),"excepcion lanzada")),
                ()->assertEquals(asientos,asientos_esperados)
        );



    }
    private static Stream<Arguments> casosDeprueba(){
        boolean[] vacio= new boolean[]{};
        boolean[] c3=new boolean[] {false,false,false,true,true};
        boolean[] c4=new boolean[] {true,true,true};
        return Stream.of(
                Arguments.of(vacio,3),
                Arguments.of(vacio,0),
                Arguments.of(c3,2),
                Arguments.of(c4,1)

        );


    }
    @ParameterizedTest
    @MethodSource("casosDePrueba")
    public void ReservaButacasC5(boolean[] expected_asientos,int expected_solicitados) {
        boolean[] expectedC2 = new boolean[]{};
        boolean c2= false;
        assertArrayEquals(expectedC2, ()-> cine.reservaButacas(expected_asientos,expected_solicitados));
        assertEquals(c2,()->cine.reservaButacas((expected_asientos,expected_solicitados));
    }




}
