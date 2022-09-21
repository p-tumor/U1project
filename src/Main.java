import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Total Bill: ");
        double bill = s.nextDouble();
        System.out.print("Tip Percentage (w/o percent): ");
        double tipPercent = s.nextDouble();
        tipPercent = tipPercent/100;
        System.out.print("Number of People: ");
        int numPpl = s.nextInt();

        double tipAmt = bill*tipPercent;
        double tipPerPerson = tipAmt/numPpl;
        double totBill = bill+tipAmt;
        double totBillPerPerson= totBill/numPpl;

        System.out.println("---------------------------------------------------------");
        System.out.printf("Total Bill: $%.2f\n", totBill);
        System.out.printf("Amount Tipped: $%.2f\n", tipAmt);
        System.out.printf("Tip Per Individual: $%.2f\n", tipPerPerson);
        System.out.printf("Total Per Individual: $%.2f\n", totBillPerPerson);
    }

}
