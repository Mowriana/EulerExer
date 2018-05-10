public class FibonacciNumbers {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = x + y;
        int sumeven = 0;
        while(z < 4000000){
            x = y;
            y = z;
            z = x + y;
            if(z % 2 == 0){
                sumeven += z; /// OR sumeven = sumeven + z
            }
        }
        System.out.printf("sum of the even-valued terms: %d \n", sumeven);
        }

    }

