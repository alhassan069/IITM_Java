

public class Example {

    // 5
    // int i;
   
    public static void main(String[] args) {
        // 1
        // System.out.println("Addition of 10 and 20 is " + 10 + 20);
        // ANSWER - changes the integers to string and prints

        // 2
        // int[] a = {1,2,3};
        // int[] b = a;
        // System.out.println(a == b);
        // ANSWER -  true because both points to same object
        
        // 3
        // String[] str1, srt2 = {"apples", "grapes", "bananas"};
        // System.out.println(str1[1]);
        // ANSWER error in initializing str1 
        
        // 4
        // int i1 = 10, i2 = 29;
        // System.out.println(i1);
        // System.out.println(i2);
        // double d;
        // d = i1/i2 * i2;
        // System.out.print(d + " ");
        // d = i2*i1/i2;
        // System.out.print(d + " ");
        // ANSWER -- IT FOLLOWS PEMDAS
        
        // 5
        // final int i = 10;
        // i = 20;
        // System.out.println(i);
        // ANSWER - shows error
        
        // 6
        // int i = 30;
        // SClass obj = new SClass(i);
        // obj.print();
        // ANSWER - prints the i defined inside class

        // 7
        // String str = "We are here to learn java";
        // String str1 = "";
        // char[] ch = {'a', 'e', 'i', 'o', 'u'};
        // for (char c: ch){
        //     int n = str.length();
        //     for(int i = 0;i<n;i++){
        //         if(str.charAt(i)== c){
        //             str1 += c;
        //         }
        //     }
        // }
        // System.out.println(str1);
        // ANSWER - prints all the vowels in str in alphabetic order

        //8
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter any ASIA cricket team");
        // String country = sc.next();
        // switch (country) {
        //     case "India":
        //         System.out.println("Delhi is capital of " + country);
        //         
        //     case "SriLanka":
        //         System.out.println("Colombo is capital of " + country);
        //         
        //     default:
        //         System.out.println("Please enter valid contry name");
        //         break;
        // }
        // ANSWER - Lack of break statement makes it unpredictable

        // 9
        // int j = 20;
        // for(int i = 10;i<j;i++,j--){
        //     System.out.println("Hello World " + i + " " + j);
        // }
        // ANSWER -  printed 5 times

        // 10 
        // for (;;) {
        //     System.out.println("Hello World");
        // }
        // ANSWER - Hello world is printed forever

        // 11
        // int x = 10;
        // int y = 20;
        // y =+ x;
        // System.out.println(y);
        // ANSWER - 30 obviously! WRONG ANSWER
        // the correct ans is 10 because in java y =+x is y = (+x) 
        // it just assigns +10 to y


        // 12, 13, 14
        // int a = 34.0;
        // int b = 7;
        // int c = a%b;
        // System.out.println(c);
        // ANSWER - Data type mismatch during initialization of a

        // 15
        // String[] State = new String[]{"Chennai", "Kolkata", "Tripura"};
        // System.out.println(Arrays.toString(State));




    }
}
// 6
// class SClass {
//     int i = 10;

//     public SClass(int _i) {
//         i = 20;
//     }

//     public void print() {
//         System.out.println(i);
//     }
// }
