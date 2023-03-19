package ppss.ejercicio1;

public class Calendar {
    public static int HOUR = 1 ;

    public static Calendar getInstance(){
        Calendar c = new Calendar();
        return c;
    }
    public int get(int hour){
        return hour;
    }

    public void setHora(int hora){
        Calendar.HOUR=hora;
    }


}
