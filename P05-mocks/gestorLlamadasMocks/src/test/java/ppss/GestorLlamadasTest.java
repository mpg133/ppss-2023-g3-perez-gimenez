package ppss;
import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.easymock.internal.MockBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.partialMockBuilder;

public class GestorLlamadasTest {
 /*Calendario calendario_mock = EasyMock.mock(Calendario.class);
        EasyMock.expect(calendario_mock.getHoraActual()).andReturn(10);
        EasyMock.replay(calendario_mock);*/

    IMocksControl imc;
    GestorLlamadas partialSut;
    Calendario mCalendario;
    @BeforeEach
    void createControl(){
         //CREATE STRICT CONTROL (STRICTS MOCKS!)
         imc = EasyMock.createStrictControl();
         mCalendario = imc.createMock(Calendario.class);
         partialSut = partialMockBuilder(GestorLlamadas.class)
                 .addMockedMethod("getCalendario").createMock(imc);
    }
    @Test
    public void calculaConsumoC1(){

        float resultado_esperado = (float)457.6;



        partialSut = partialMockBuilder(GestorLlamadas.class).
                                            addMockedMethod("getCalendario").createMock(imc);
        //GestorLlamadas sut = new GestorLlamadas();

        EasyMock.expect(partialSut.getCalendario()).andReturn(mCalendario);
        EasyMock.expect(mCalendario.getHoraActual()).andReturn(10);

        imc.replay();
        Assertions.assertEquals(resultado_esperado, partialSut.calculaConsumo(22),0.001);
        imc.verify();

    }
    @Test
    public void calculaConsumoC2(){

        float resultado_esperado = (float)136.5;



        partialSut = partialMockBuilder(GestorLlamadas.class).
                addMockedMethod("getCalendario").createMock(imc);
        //GestorLlamadas sut = new GestorLlamadas();

        EasyMock.expect(partialSut.getCalendario()).andReturn(mCalendario);
        EasyMock.expect(mCalendario.getHoraActual()).andReturn(21);

        imc.replay();
        Assertions.assertEquals(resultado_esperado, partialSut.calculaConsumo(13),0.001);
        imc.verify();

    }
}
