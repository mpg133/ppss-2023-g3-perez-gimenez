package ppss.ejercicio2;

public class CalendarioStub extends Calendario{

    private int hour;


    @Override
    public int getHoraActual(){
        return hour;
    }


    public void setHora(int hora){
        hour=hora;
    }
}
