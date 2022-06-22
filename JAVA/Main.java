import java.io.Console;

public class Main{
    static void add(int x){
        System.out.println(x*2);
    }
    static void add(int x, int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        /*Console com = System.console();
        System.out.println("Hello World");
        System.out.println(Math.random());
        String in = com.readLine("Input: ");
        System.out.println("You entered \""+in+"\"");
        System.out.print("W");
        System.out.print("O");
        System.out.print("W");
        */
        add(2);
        add(2,3);

        System.out.println();
    }
}