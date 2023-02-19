package ppss;

public class Cine {

 public boolean reservaButacas(boolean[] asientos, int solicitados) throws ButacasException {
     try {
         int j = 0;
         return false;
     } catch (NullPointerException e) {
         throw new ButacasException("error");
     }
 }
    // boolean reserva = false;
     /*
     int j = 0;
     int sitiosLibres = 0;
     int primerLibre;
     if (asientos == null) {
         throw new ButacasException("error");

     } else {
         return reserva;
     }/*
         while ((j < asientos.length) && (sitiosLibres < solicitados)) {
             if (!asientos[j]) {
                 sitiosLibres++;
             } else {
                 sitiosLibres = 0;
             }
             j++;
         }
         if (sitiosLibres == solicitados) {
             primerLibre = (j - solicitados);
             reserva = true;
             for (int k = primerLibre; k < (primerLibre + solicitados); k++) {
                 asientos[k] = true;
             }
         }

         return reserva;
     }*/

 }

