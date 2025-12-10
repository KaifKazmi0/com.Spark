package ExceptionHandling.Custom.Bank;

public class Atm {
    public static void main(String[] args) {
        double balance= 1000, amount=1500;
        try{
            withdraw(balance,amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void withdraw(double bal, double amt) throws Exception{
        if (amt>bal){
            throw new InsuficientBalanceException("Insufient bal "+bal+" withdraw amt "+amt);
        }
        bal = bal-amt;
        System.out.println("Withdraw Successful....!");
    }
}
