public class Main {
    public static void main(String[] args) {

        //Account KapsAccount = new Account("12345",1000.00,"Kaps Mah","myemail@gmail.com","+91-494548");

        Account KapsAccount = new Account();
        System.out.println(KapsAccount.getNumber());
        System.out.println(KapsAccount.getBalance());

//        KapsAccount.setNumber("12345");
//        KapsAccount.setBalance(1000.00);
//        KapsAccount.setCustomerName("Kaps Mah");
//        KapsAccount.setCustomerEmail("myemail@gmail.com");
//        KapsAccount.setCustomerPhone("+91-494548");
        KapsAccount.withdrawFunds(100);
        KapsAccount.depositFunds(500);
        KapsAccount.withdrawFunds(100);

        KapsAccount.withdrawFunds(400);

        KapsAccount.depositFunds(100);
        KapsAccount.withdrawFunds(45.55);
        KapsAccount.withdrawFunds(54.46);

        Account mukulsAccount = new Account("Mukul","mukul6789@gmail.com","1234");
        System.out.println("Account No: " + mukulsAccount.getNumber() + "; name: " + mukulsAccount.getCustomerName());
    }
}