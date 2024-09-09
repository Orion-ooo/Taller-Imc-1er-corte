import java.util.Date;

public abstract class ImcUsuario {
    private double peso;
    private double altura;
    private Date fecha;

    public ImcUsuario(){
    }

    public ImcUsuario(double peso, double altura, Date fecha){
        this.peso = peso;
        this.altura = altura;
        this.fecha = fecha;
    }

    //Metodos

    public void pesar(){

    }

    //Getters y Setters

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public Date getFecha(){
        return fecha;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

}
