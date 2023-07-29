import java.util.Scanner;
//2 5 3 4 5
class Main {
    static int max = 0;
    static int maxIndex = 0;
    
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("The length of Array: ");
        int length = scanner.nextInt();
        int myArray[] = new int[length]; 

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value of current Index: ");
            myArray[i] = scanner.nextInt();
            if (myArray[i] > max) {
                max = myArray[i];
                maxIndex = i;
                getStats();
            }
        }
        System.out.println(max);
        getStats();
    }
    
    public static void getStats() {
        System.out.println("The current max: " + max);
        System.out.println("The current indexMax: " + maxIndex);
                
    }
}
