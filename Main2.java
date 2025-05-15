/* Write a program to take x and print multiples of x till 1000.

Input:

100

Expected Output:

100

200

300

400

500

600

700

800

900

1000 */


import java.util.Scanner;
class Main2{
    public static void main(String[] args){
        System.out.println("Enter the value of x");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        for(int i=x; i<=1000 ; i = i + x){
            System.out.println(i);
            
        }
    }
}