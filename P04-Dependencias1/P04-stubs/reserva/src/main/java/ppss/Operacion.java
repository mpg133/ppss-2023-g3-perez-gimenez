package ppss;

import ppssExcepciones.IsbnInvalidoException;
import ppssExcepciones.JDBCException;
import ppssExcepciones.SocioInvalidoException;

public class Operacion implements IOperacionBO{
    @Override
    public void operacionReserva(String socio, String isbn) throws IsbnInvalidoException, JDBCException, SocioInvalidoException {
        throw new UnsupportedOperationException ("Not yet implemented");
    }
}
