import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size (for NxN array): ");
            int n = sc.nextInt();
            System.out.println();
            int [][] arr = new int[n][n];
            Random r = new Random();
            for(int i = 0 ; i<n ; i++){
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 2*(r.nextInt(10)+1);
                }
            }
            print(n , arr , 0);
        System.out.print("Enter a number to highlight (even number 2-20): ");
        int f = sc.nextInt();
        System.out.println();
        System.out.println("Array with "+f+" highlighted:");
        print(n,arr,f);
        }
        static void print(int n , int [][] arr , int f) {
            System.out.print("     ");
            for (int i = 0; i < n; i++) {
                System.out.print(0 + "" + i + "   ");
            }
            System.out.println();
            pattern(n);
            int x = 0;
            int y = 0;
            for(int[]ab : arr){
                System.out.print(x+""+y++ +" |");
                for(int a : ab){
                    if(a==f) {
                        if(a>=10) System.out.print("["+a+"]|");
                        else System.out.print(" ["+a+"]|");
                    }
                    else if(a>=10) System.out.print(" "+a+" |");
                    else System.out.print("  "+a+" |");
                }
                System.out.println();
                pattern(n);
            }
            
        }
        
        static void pattern(int n){
        if(n>0) {
            System.out.print("   +");
        }
            for (int i = 0; i <n ; i++) {
                System.out.print("----+");
            }
            System.out.println();
        }
    }
