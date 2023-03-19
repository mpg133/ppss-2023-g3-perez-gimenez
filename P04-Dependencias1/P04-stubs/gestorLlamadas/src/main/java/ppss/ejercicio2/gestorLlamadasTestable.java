package ppss.ejercicio2;

public class gestorLlamadasTestable extends GestorLlamadas{

    private CalendarioStub calen;
    public CalendarioStub setCalendario(CalendarioStub calendario){
        calen=calendario;
        return calen;
    }

    @Override
    public CalendarioStub getCalendario(){

        return calen;
    }

}
