package COM.BRIDGELABZ;
import java.util.*;
class Account{
    public static class AccountTest {
        public static void main(String[] args) {
                Account obj = new Account();
                obj.Debit();
            }
        }
        private void Debit() {

        long BALANCE = 1000000l;

            System.out.println(" Enter amount to debit : ");
            Scanner sc = new Scanner(System.in);
            int AMOUNT = sc.nextInt();
            long REMAINS = BALANCE-AMOUNT;

            if( AMOUNT <= BALANCE) {
                System.out.println("Your Money " + AMOUNT + " is Debited from Account xxxxxx400 ");
                System.out.println(" Your BALANCE is "+REMAINS);
            }
            else{
                System.out.println(" Debit amount exceeded account balance ");
            }
        }

    }




