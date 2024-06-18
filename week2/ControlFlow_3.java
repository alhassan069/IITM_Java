
public class ControlFlow_3 {

    public static int sign(int v) {
        if (v < 0) {
            return -1;
        } else if (v > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int sumuptoWhile(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n;
            n--;
        }

        return sum;
    }

    public static int sumuptoDoWhile(int n) {
        int sum = 0;
        int i = 0;

        do {
            sum += i;
            i++;

        } while (i <= n);

        return sum;
    }

    public static int sumuptoForLoop(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumarray(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void printsign(int v) {
        switch (v) {
            case -1:
                System.out.println("Negative");
                break;
            case 1:
                System.out.println("Positive");
                break;
            case 0:
                System.out.println("Zero");
                break;
            // default:
            //     throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        // for (int i = 0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // for (int i: arr) {
        //     System.out.println(i);
        // }
        // int i = 1, num = 5, fact = 1;
        // while(i<num) {
        //     fact *= i;
        //     i++;
        // }
        // System.out.println(fact);
        // for (int i = 0; i <= 10 ; i++) {
        //     System.out.println(i);
        //     if(i==0)
        //         break;
        // }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (j == 1) {
                    System.out.println();
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
