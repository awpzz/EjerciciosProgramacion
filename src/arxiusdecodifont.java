import java.util.Scanner;

public class arxiusdecodifont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombrearchivo1 = sc.next();
        String tipo1 = sc.next();
        String extension1 = sc.next();

        String nombrearchivo2 = sc.next();
        String tipo2 = sc.next();
        String extension2 = sc.next();

        String nombrearchivo3 = sc.next();
        String tipo3 = sc.next();
        String extension3 = sc.next();

        String nombrearchivo4 = sc.next();
        String tipo4 = sc.next();
        String extension4 = sc.next();


        System.out.println(tipo1 + " " + extension1 + " " + nombrearchivo1);
        System.out.println(tipo2 + " " + extension2 + " " + nombrearchivo2);
        System.out.println(tipo3 + " " + extension3 + " " + nombrearchivo3);
        System.out.println(tipo4 + " " + extension4 + " " + nombrearchivo4);


    }
}
