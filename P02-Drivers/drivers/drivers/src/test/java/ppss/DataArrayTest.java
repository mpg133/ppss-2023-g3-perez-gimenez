package ppss;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;


public class DataArrayTest {

    int elemento;
    int[] coleccion;
    int[] resultado_esperado;
    int numElementos;
    int elementosEsperados;
    DataArray dataArray = new DataArray();

    @Test
    public void deleteC1() {
        elemento= 5;
        coleccion = new int[] {1,3,5,7};
        elementosEsperados = 3;
        dataArray = new DataArray(coleccion);
        resultado_esperado= new int[]{1,3,7};

        assertDoesNotThrow(
                ()->dataArray.delete(elemento),"excepcion lanzada");
        assertAll("grupoTestC1",
                ()->assertArrayEquals(resultado_esperado, dataArray.getColeccion()),
                ()->assertEquals(elementosEsperados,dataArray.size())

        );

    }
    @Test
    public void deleteC2() {
        elemento= 3;
        coleccion = new int[] {1,3,3,5,7};
        elementosEsperados = 4;
        dataArray = new DataArray(coleccion);
        resultado_esperado= new int[]{1,3,5,7};

        assertDoesNotThrow(
                ()->dataArray.delete(elemento),"excepcion lanzada");
        assertAll("grupoTestC1",
                ()->assertArrayEquals(resultado_esperado, dataArray.getColeccion()),
                ()->assertEquals(elementosEsperados,dataArray.size())

        );
    }
    @Test
    public void deleteC3() {
        elemento= 4;
        coleccion = new int[] {1,2,3,4,5,6,7,8,9,10};
        elementosEsperados = 9;
        dataArray = new DataArray(coleccion);
        resultado_esperado= new int[]{1,2,3,5,6,7,8,9,10};

        assertDoesNotThrow(
                ()->dataArray.delete(elemento),"excepcion lanzada");
        assertAll("grupoTestC1",
                ()->assertArrayEquals(resultado_esperado, dataArray.getColeccion()),
                ()->assertEquals(elementosEsperados,dataArray.size())

        );
    }
    @Test
    public void deleteC4() {
        elemento= 8;
        coleccion = new int[] {};
        //elementosEsperados = 9;
        dataArray = new DataArray(coleccion);
        // resultado_esperado= new int[]{1,2,3,5,6,7,8,9,10};
        String msg_esperado="No hay elementos en la colección";

        DataException excepcion = assertThrows( DataException.class, ()->dataArray.delete(elemento));

        assertEquals(msg_esperado,excepcion.getMessage());


    }
    @Test
    public void deleteC5() {
        elemento= -5;
        coleccion = new int[] {1,3,5,7};
        //elementosEsperados = 9;
        dataArray = new DataArray(coleccion);
        // resultado_esperado= new int[]{1,2,3,5,6,7,8,9,10};
        String msg_esperado="El valor a borrar debe ser > 0";

        DataException excepcion = assertThrows( DataException.class, ()->dataArray.delete(elemento));

        assertEquals(msg_esperado,excepcion.getMessage());

    }
    @Test
    public void deleteC6() {
        elemento= 0;
        coleccion = new int[] {};
        //elementosEsperados = 9;
        dataArray = new DataArray(coleccion);
        // resultado_esperado= new int[]{1,2,3,5,6,7,8,9,10};
        String msg_esperado="Colección vacía. "+
                "Y el valor a borrar debe ser > 0";

        DataException excepcion = assertThrows( DataException.class, ()->dataArray.delete(elemento));

        assertEquals(msg_esperado,excepcion.getMessage());
    }
    @Test
    public void deleteC7() {
        elemento= 8;
        coleccion = new int[] {1,3,5,7};
        //elementosEsperados = 9;
        dataArray = new DataArray(coleccion);
        // resultado_esperado= new int[]{1,2,3,5,6,7,8,9,10};
        String msg_esperado="Elemento no encontrado";

        DataException excepcion = assertThrows( DataException.class, ()->dataArray.delete(elemento));

        assertEquals(msg_esperado,excepcion.getMessage());
    }

}
