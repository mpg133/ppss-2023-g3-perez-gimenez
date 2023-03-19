public class ServicioStub extends Servicio{

    private float precio;
    public ServicioStub(float precio){
        this.precio=precio;
    }
    @Override
    public float consultaPrecio(TipoCoche tipo) {
        return precio;
    }
}
