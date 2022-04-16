import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] input = new String[n][3];
        int i;
        int[] score = new int[n];
        for (i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = sc.next();
            }
            score[i] = Integer.parseInt(input[i][2]);
        }
        int max, min, namemax, namemin;
        max = min = score[0];
        namemax = namemin = 0;
        for (i = 0; i < n; i++) {
            if (max < score[i]) {
                max=score[i];
                namemax=i;
            }
            if(min>score[i]){
                min=score[i];
                namemin=i;
            }

        }
        System.out.println(input[namemax][0]+" "+input[namemax][1]);
        System.out.println(input[namemin][0]+" "+input[namemin][1]);
    }
}