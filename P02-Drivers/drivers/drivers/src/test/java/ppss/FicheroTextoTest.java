package ppss;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.*;

public class FicheroTextoTest {


    int resultado_esperado;
    String nombreFichero;
    FicheroTexto ficheroTexto = new FicheroTexto();
    @Test
    public void ContarCaracteresC1(){
            nombreFichero= "ficheroC1.txt";
            String msg_esperado = nombreFichero + " (No existe el archivo o el directorio)";
              FicheroException exception = assertThrows(FicheroException.class,
                                                        () -> ficheroTexto.contarCaracteres(nombreFichero)
                                                        );
              assertEquals(msg_esperado,exception.getMessage());

    }
    @Test
    public void ContarCaracteresC2(){
         nombreFichero= "FicheroCorrecto.txt";
         resultado_esperado= 3;

         assertEquals(resultado_esperado, assertDoesNotThrow(
                        ()->ficheroTexto.contarCaracteres(nombreFichero),"excepcion lanzada"));



    }




}
