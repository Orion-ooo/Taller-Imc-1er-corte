import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Usuario extends ImcUsuario{
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String genero;
    protected List<ImcUsuario> imc;

    public Scanner entradaString = new Scanner(System.in);
    public Scanner entradaNum = new Scanner(System.in);

    public Usuario(){
        this.imc = new ArrayList<>();
    }

    public Usuario(int id, String nombre, String apellido, String genero, List imc, double peso, double altura, Date fecha){
        super(peso, altura, fecha);
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.imc = imc;
    }

    //Metodos

    public void registrarUsuario(){
        System.out.println("Ingrese los siguientes datos para empezar:");
        System.out.println("Nombre: ");
        nombre = entradaString.next();
        System.out.println("Apellido: ");
        apellido = entradaString.next();
        System.out.println("genero: ");
        genero = entradaString.next();
        System.out.println("ID: ");
        id = entradaNum.nextInt();
    }

    //Getters y Setters

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public List getImc(){
        return imc;
    }

    public void setImc(List imc){
        this.imc = imc;
    }
}