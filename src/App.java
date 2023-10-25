import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppg a)");
        Scanner in = new Scanner(System.in);
        System.out.println("Hur långt har du till jobbet (km)");
        int distance = in.nextInt();
        String enter = in.nextLine();
        System.out.println("Har du sambo? (ja/nej)");
        String rel_status = in.nextLine();
        System.out.println("Hur länge gäller jobbet? (år)");
            int length = in.nextInt();
        

        if(distance>=50 && rel_status.equalsIgnoreCase("nej") && length>=1){
            System.out.println("Yes män du får bo två ställen");
        }
        else if(distance>=50 && rel_status.equalsIgnoreCase("ja") && length>=3){
            System.out.println("Yes män du får bo två ställen");
        }
        else{
            System.out.println("Bo kvar där du bor");
        }

    

    }
}
