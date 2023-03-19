package ppss;

import ppss.ejercicio1.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
public class gestorLlamadasTest {
        public double resultado_real;
        public double resultado_esperado;
        public CalendarioStub calendarioStub = new CalendarioStub();



        @Test
        public void calculaConsumoC1(){
                gestorLlamadasTestable testable = new gestorLlamadasTestable();
                calendarioStub.setHora(15);
                testable.setHoraStub(calendarioStub);
                resultado_esperado=208;
                resultado_real=testable.calculaConsumo(10);
                assertEquals(resultado_esperado,resultado_real);
        }
        @Test
        public void calculaConsumoC2(){
                gestorLlamadasTestable testable = new gestorLlamadasTestable();
                calendarioStub.setHora(22);
                testable.setHoraStub(calendarioStub);
                resultado_esperado=105;
                resultado_real=testable.calculaConsumo(10);
                assertEquals(resultado_esperado,resultado_real);
        }

}
