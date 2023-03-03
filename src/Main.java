import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       System.out.println("Scrie o valoare pentru a calcula suma Gauss:");

       Long numar = scanner.nextLong();
        System.out.println("Suma Gauss="+  Gauss2(numar));

    }
    private static Long  Gauss2(Long n){
        return n*(n+1)/2;
    }

}