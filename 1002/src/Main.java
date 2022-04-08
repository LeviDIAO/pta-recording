import java.util.Scanner;
public class Main{
    public static void main (String [] args ) {
        Scanner a = new Scanner(System.in);
        String n=a.nextLine();
        int m=0;
        for(int i=0;i<n.length();i++){
            m=m+n.charAt(i)-'0';
        }
        String [] py = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu","shi"};
        String c=String.valueOf(m);
        String py2 []=new String[c.length()];
        for(int i=0;i<c.length();i++) {
            int b=m%10;
            m/=10;
            py2[i]=py[b];
        }
        for(int i=c.length();i!=0;i--) {
            System.out.print(py2[i-1]);
            if (i==1) break;
            else System.out.print(" ");
        }
    }
}