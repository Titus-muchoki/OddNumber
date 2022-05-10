public class OddNumber {
    public static void main(String[] args) {
        int num = 20;
        boolean odd = false;
        for (int i = 1; i < num /2; i++) {
            if (num % 2 == 1) {
                odd = true;
                break;
            }
        }
            if (odd) {
                System.out.println(odd+ " its is an odd number");
            }else {
                System.out.println(odd+ " its not an odd number");
            }
        }
    }

