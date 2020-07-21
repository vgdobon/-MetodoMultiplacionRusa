import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("что такое множитель ??");
        //cual es el multiplicador???
        int multiplicador = input.nextInt();
        System.out.println("что такое умножение ??");
        //cual es el multiplicando??
        int multiplicando = input.nextInt();
        MetodoRuso mtdor = new MetodoRuso(multiplicador,multiplicando);
        mtdor.rusiando();
    }
}
