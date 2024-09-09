import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static Scanner entradaString = new Scanner(System.in);
    public static Scanner entradaNum = new Scanner(System.in);
    
    public static void main(String[] args) {

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        

        System.out.println("--- Calculo de Masa Corporal ---");
        System.out.println("Es nuevo? Si: 1    No: 2");
        int nuevo = entradaNum.nextInt();

        switch (nuevo) {
            case 1:
                usuario.registrarUsuario();
                listaUsuarios.add(usuario);
                break;
            case 2:
                
                break;
            default:
                System.out.println("Opción incorrecta...!");
        }
        System.out.println(listaUsuarios.add(usuario));
        System.out.println(usuario.apellido);
    }

}
