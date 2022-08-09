import java.util.Scanner;
public class Students {
    public static void main(String[] args) {
        int[] student;
        int[][] a;
        int i, j, sum,sum1=0;
        float ave;
        a = new int[15][5];
        student = new int[15];
        Scanner s = new Scanner(System.in);
        for (i = 0; i < 15; i++) {
            for (j = 0; j < 5; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (i = 0; i < 15; i++) {
            sum = 0;
            for (j = 0; j < 5; j++) {
                sum += a[i][j];
            }
            student[i] = sum;
        }
        System.out.println("Totals are ");
        for (i = 0; i < 15; i++) {
            System.out.print(" "+student[i]);
            sum1+=student[i];
        }
        ave=(float)(sum1)/75;
        System.out.println("Average of class performance overall= "+sum1);
    }
}
