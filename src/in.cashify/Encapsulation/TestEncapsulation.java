package in.cashify.Encapsulation;

public class TestEncapsulation{
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setAcc_no(7560504000L);
        acc.setName("Sandeep");
        acc.setEmail("abc@cashify.in");
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail());
    }
}