import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] input = new Student[n];
        int i;
        for (i = 0; i < n; i++) {
            input[i] = new Student(sc.next(), sc.next(), sc.nextInt());
        }
        int max, min, namemax, namemin;
        max = min = input[0].getscore();
        namemax = namemin = 0;
        for (i = 0; i < n; i++) {
            if (max < input[i].getscore()) {
                max = input[i].getscore();
                namemax = i;
            }
            if (min > input[i].getscore()) {
                min = input[i].getscore();
                namemin = i;
            }

        }
        System.out.println(input[namemax].getname() + " " + input[namemax].getid());
        System.out.println(input[namemin].getname() + " " + input[namemin].getid());
    }
}
class Student {
    private String name;
    private String id;
    private int score;

    public Student(String name, String id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public int getscore() {
        return score;
    }

    public String getname() {
        return name;
    }

    public String getid() {
        return id;
    }
}
