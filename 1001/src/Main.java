
    import java.util.Scanner;
    public class Main{
        public static void main (String[] args){
            Scanner a = new Scanner(System.in);
            int n = a.nextInt();
            int count=0;
            while (n!=1){
                count++;
                if(n%2==0){
                    n/=2;
                }
                else{
                    n=(3*n+1)/2;
                }
            }
            System.out.println(count);
        }
    }

