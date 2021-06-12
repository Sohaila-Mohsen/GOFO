package gofo;

/**
 * help in setting and getting user Balance and modifying Balance.
 */
public class E_Wallet extends DB {

    private float balance;

    /**
     * this function to return an user's balance.
     *
     * @return the user's balance.
     */
    public float getBalance() {
        return balance;
    }

    /**
     * this function to set an user's balance.
     *
     * @param balance is the Balance of user
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * this function for withdrawing from the user balance.
     *
     * @param money
     * @param id
     */
    public void send(float money, int id) {
        if (balance >= money) {
            players.get(id).getEwallrt().recive(money);
            balance = balance - money;
        } else {
            System.out.println("No Enough Balance In Your E-wallet");
        }
    }

    /**
     * this function for receiving money.
     *
     * @param _deposit the deposit is added to the user's balance.
     */
    public void recive(float money) {
        balance = balance + money;
    }

}
