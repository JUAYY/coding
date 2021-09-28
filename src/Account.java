public class Account {
    private String name;
    private Double balance;

    public Account(String name, Double balance){
        setName(name);
        setBalance(balance);
        //deposit(balance);
        getName();
        getBalance();
    }
    public void setName(String name){
        this.name = name;
    }
    public Double setBalance(Double balance){
        
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            System.out.println("You put a wrong value !!");
        }
        return balance;
    }
    
    public void deposit(Double depositAmount) {
        if(depositAmount >= 0){
            this.balance  = this.balance + depositAmount;
        }
        else{
            System.out.println("You put a wrong value !!");
        }
    }

    public String getName(){
        return this.name;
    }

    public Double getBalance(){
        return this.balance;
    }
}
