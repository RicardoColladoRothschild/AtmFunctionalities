
import java.io.Serializable;
import java.io.*;
public class Balance implements Serializable{
    private int balance;

    public Balance(int b){
        this.balance = b;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int b){
        this.balance = b;
    }
}
