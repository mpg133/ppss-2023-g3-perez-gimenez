package ppss;

import ppssExcepciones.IsbnInvalidoException;
import ppssExcepciones.JDBCException;
import ppssExcepciones.SocioInvalidoException;

public interface IOperacionBO {
    public void operacionReserva(String socio, String isbn)
            throws IsbnInvalidoException, JDBCException, SocioInvalidoException;


}
