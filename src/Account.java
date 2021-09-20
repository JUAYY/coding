public class Account {
    private String name;
    private Double balance;
    private Double depositAmount;

    public Account(String name, Double balance){
        setName(name);
        setBalance(balance);
        deposit(depositAmount);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(Double balance){
        Double Balance = balance;
        if(Balance >= 0){
            this.balance = Balance;
        }
        else{
            System.out.println("You put a wrong value !!");
        }
    }

    public void deposit(Double depositAmount) {
        Double Deposit = depositAmount;
        if(Deposit >=0){
            this.depositAmount = Deposit; 
        }
        
        Double newbalance = setBalance(balance);
    }

    public String getName(){
        return name;
    }
    public Double getBalance(){
        return balance;
    }
    public Double getDeposit(){
        return depositAmount;
    }
}
