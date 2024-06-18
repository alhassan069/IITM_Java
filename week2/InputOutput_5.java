public class InputOutput_5 {
    public static void main(String[] args) {
        // output 
        System.out.println("Hello World");
        // implicitly converts argument to a string 
        // prints in a new line

        System.out.print("hell");
        // same but does not advance to new line

        System.out.printf("Hello world");
        // generates formated output
        // same as printf in C
        
        
        
        
        // input
        // Console class within System
        // simalar to python input()

        Console cons = System.console();

        String username = cons.readLine("User name: "); // returns string, echo characters in screen

        char[] passwd = cons.readPassword("Password: "); // returns array of character -- for security reasons
        // and doesn't echo characters in screen

        // More general Scanner class
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextLine();
        
    }
}