import java.time.LocalDate;

public class CalendarioStub extends Calendario{

    private int[] arrayFestivos={};
    private int[] arrayExcepciones={};

    public void setFestivos(int[] dias){
      arrayFestivos=dias;
    }
    public void setDiasExcepciones(int[] dias){
        arrayExcepciones=dias;
    }

    @Override
    public boolean es_festivo(LocalDate fecha) throws CalendarioException {


            for (int i=0;i<arrayFestivos.length;i++){
                if(arrayFestivos[i]==fecha.getDayOfMonth()){
                    return true;
                }
            }
            for (int i=0;i<arrayExcepciones.length;i++){
                if(arrayExcepciones[i]==fecha.getDayOfMonth()){
                    throw new CalendarioException();
                }
            }


        return false;
    }
}
