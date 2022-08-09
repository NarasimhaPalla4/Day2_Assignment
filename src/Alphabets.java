import java.util.Scanner;
public class Alphabets {
    public static void main(String[] args) {
        String sentence;
        int i,ascii;
        char small;
        Scanner s=new Scanner(System.in);
        sentence=s.nextLine();
        for(i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z') {
                ascii = (int) sentence.charAt(i) + 32;
                small = (char) ascii;
                StringBuilder str=new StringBuilder(sentence);
                str.setCharAt(i,small);
                sentence=str.toString();
            }
            else if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z') {
                ascii = (int) sentence.charAt(i) - 32;
                small = (char) ascii;
                StringBuilder str=new StringBuilder(sentence);
                str.setCharAt(i,small);
                sentence=str.toString();
            }
        }
        System.out.println(sentence);
    }
}
