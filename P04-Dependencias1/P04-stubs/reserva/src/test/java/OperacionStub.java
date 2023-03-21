import ppss.IOperacionBO;
import ppssExcepciones.IsbnInvalidoException;
import ppssExcepciones.JDBCException;
import ppssExcepciones.SocioInvalidoException;

public class OperacionStub implements IOperacionBO {
    @Override
    public void operacionReserva(String socio, String isbn) throws IsbnInvalidoException, JDBCException, SocioInvalidoException {

    }
}
