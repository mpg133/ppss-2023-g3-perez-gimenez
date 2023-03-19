import java.time.LocalDate;

public class CalendarioStub extends Calendario{

    private int[] array={};
    public void setFestivos(int[] dias){
      array=dias;
    }


    @Override
    public boolean es_festivo(LocalDate fecha) throws CalendarioException {


            for (int i=0;i<array.length;i++){
                if(array[i]==fecha.getDayOfMonth()){

                    return true;
                }
            }


        return false;
    }
}
