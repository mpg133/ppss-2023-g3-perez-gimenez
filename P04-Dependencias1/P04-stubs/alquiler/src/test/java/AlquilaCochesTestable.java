public class AlquilaCochesTestable extends AlquilaCoches {


    IService servicio;



    public void setCalendarioStub(CalendarioStub calendarioStub) {
        super.calendario= calendarioStub;

    }
    @Override
    public IService getServicio(){
        return servicio;
    }
    public void setServicio(IService servicio){
        this.servicio=servicio;
    }

    public Calendario getCalendario() {
        return calendario;
    }
}
