import java.util.Scanner;
//EoinWickens
public class Main {
    private static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {

        menu();
    }

    public static int add(int i, int j){
        return i+j;
    }
    public static int subtract(int i, int j){
        return i-j;
    }
    public static void menu(){
      add(1,2);
      subtract (5,4);
        }
}
