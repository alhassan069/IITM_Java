
import java.util.Arrays;


public class datatypes_2 {

    public static void main(String[] args) {
        
        int a = 1;
        float b = 2.11f;
        char c = 'd';
       
        final float pi = 3.1415927f;
       
        boolean d,e;
        d = true;
        e = false;
        
        String f = "Hello";
        f += " World!";
        f = f.substring(0,3) + "p !!";

        int[] g;
        g = new int[100];
        // or int a[] instead of int[] a
        // combine as int[] a = new int[100]

        int[] h = new int[3];
        h[0] = 5;
        h[1] = 4;
        h[2] = 3;

        int[] i;
        int j;

        j = 10;

        i = new int[j];

        j = 20;
        i = new int[j];
        int[] k = {1,2};

        System.out.println("Hello World");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(f.length());

        System.out.println(g);
        System.out.println(Arrays.toString(h));
        System.out.println(h.length);

        System.out.println(i);
        System.out.println(j);
        for(int z = 1;z<j;z++){
            System.out.println(i[z]);
        }



        System.out.println(pi);
        System.out.println(Arrays.toString(k));

        String name1 = "Alimul";
        String name2 = "Hassan";
        name1 = name1.concat(name2);
        System.out.println(name1);
        System.out.println(name1.substring(1,5));

        long ali = (byte) 50;
        System.out.println(ali);

   
    }
}
