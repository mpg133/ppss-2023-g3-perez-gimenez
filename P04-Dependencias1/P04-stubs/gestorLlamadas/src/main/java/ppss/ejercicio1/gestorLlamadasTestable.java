package ppss.ejercicio1;


public class gestorLlamadasTestable extends GestorLlamadas{
    private int hora;
    public void setHoraStub(CalendarioStub calendario){
        this.hora= calendario.get(calendario.HOUR);
    }
    @Override
    public int getHoraActual(){
        return hora;
    }




}
