package ExceptionHandling.Custom.Bank;

public class InsuficientBalanceException extends Exception{
    InsuficientBalanceException(String str){
            super(str);
    }
}
