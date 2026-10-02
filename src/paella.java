import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float comensals = sc.nextFloat();
        float precioarroz = sc.nextFloat();
        float preciogambas = sc.nextFloat();

        float arrozkg = comensals * 0.125f;
        float gambaskg = comensals * 0.0625f;

        float precioarroz2 = precioarroz * arrozkg;
        float preciogambas2 = preciogambas * gambaskg;
        float total = precioarroz2 + preciogambas2;

        System.out.println(arrozkg + " kg arros");
        System.out.println(gambaskg + " kg gambes");
        System.out.println(precioarroz2 + " euros arros");
        System.out.println(preciogambas2 + " euros gambes");
        System.out.println("TOTAL: " + total + " euros" );
    }
}
