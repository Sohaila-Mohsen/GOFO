package gofo;

import java.util.Scanner;

public class GOFO {

    static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        while (true){
        
        System.out.println("Are you \n1- Player \n2- playground owner \n3- Admin\n4- Exit");
        int choice = input.nextInt();
        if (choice==1) {
            PlayerInterface playerinterface = new PlayerInterface();
             playerinterface.SignMenue();
        } 
        else if ( choice == 2 )
        {
            OwnerInterface ownerinterface = new OwnerInterface();
            ownerinterface.SignMenue();    
        }
        else if ( choice == 3 ){
            Admin a = new Admin();
            AdminInterface admininterface = new AdminInterface();
            admininterface.AdminMainMenue(a);
        }
        else if ( choice == 4 )
            break;
        }
    }
}
/*       protected float balance;
       
	public E_Wallet()
	{
		balance=0;
	}
        public void SetBalance(float _balance)
	{
		balance=_balance;
	}
        public float GetBalance()
	{
		return balance;
	}
        public void send(float withdraw  )
	{
		if(balance >= withdraw)
		{
			balance -=withdraw; 
		}
		else
		{
			System.out.println("balane is less than: "+ withdraw +"try again");
			send(withdraw);
		}
	}
        public void receive(float _deposit)
	{
		balance+=_deposit;
	}*/

