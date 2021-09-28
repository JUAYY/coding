public class AccountList {
    private Account[] accounts;
    private int count = 0;

    public AccountList(int max) {
        accounts = new Account[max];
    }

    public boolean appendAccount(Account suc) {
        if(count < accounts.length){
                accounts[count] = suc;
                count++;
            }
        
        if (count == accounts.length) {
            return false; // it's full
        } else {
            return true;
        }
    }

    public Account getAccount(int idx){
        // it cannot check 3rd value because it's null ,so it should return 3rd - 1 = 2nd for max order.
        //idx = 0 ; 0+1 = 1 ;; idx = 1 ; 1+1 = 2 id ;; idx = 2 ; 2+1 = 3
        if(idx <= accounts.length){
            return accounts[idx];
        }
        else{
            return null;
        }
    }
}
