public class Bank {
    public static void main(String[] args) {
        float balance1 = 60000, balance2 = 100000;
        float interest1 = 0,interest2,amt;
        interest2=(float) ((3 * balance2) / 100);;
        interest2 = (float)interest2/4;
        System.out.println("Total Interest of Gopal " + interest1);
        System.out.println("Total Interest of Amrita " + interest2);
        amt = (float)(20*balance1)/100;
        amt=amt+balance1;
        if (amt >= 70000) {
            System.out.println("Gopal can withdraw 70k");
        } else {
            System.out.println("Not possible");
        }
    }
}
