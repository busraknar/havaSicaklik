import java.util.Scanner;
public class Hava {
    public static void main(String[] args) {
        int hava;
        System.out.println("Hava sıcaklığını giriniz:");
        Scanner input = new Scanner(System.in);
        hava = input.nextInt();
        System.out.print(hava<5 ? "Kayak yapabilirsiniz" : "");
        System.out.print(5<hava && hava<15 ? "Sinemaya gidebilirsiniz" : "");
        System.out.print(hava>10 && hava<25 ? "\nPiknik yapabilirsiniz" : "");
        System.out.print(hava>25 ? "Yüzmeye gidebilirsiniz." : "");
    }
}
