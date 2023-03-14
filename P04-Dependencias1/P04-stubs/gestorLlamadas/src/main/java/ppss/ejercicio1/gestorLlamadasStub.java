package ppss.ejercicio1;

public class gestorLlamadasStub extends GestorLlamadas{
    private int hora;
    public void setHoraStub(int hora){
        this.hora=hora;
    }
    @Override
    public int getHoraActual(){
        return hora;
    }


    

}
