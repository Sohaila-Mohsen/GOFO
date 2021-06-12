package gofo;

import java.util.Scanner;

public class PlayerInterface extends DB{
    
    static Scanner input;

    static {
        input = new Scanner(System.in);
    }
    public void PlayerMainMenue(Player p)
        {
            System.out.println("1- My Books \n2- My Requests\n3- Join Team \n4- Book Playground \n5- Sign Out");
            int choice = input.nextInt();
            
        switch (choice) {
            case 1:
                p.displayBooking();
                PlayerMainMenue(p);
                break;
            case 2:
                p.displayrequests();
                PlayerMainMenue(p);
                break;
            case 3:
                System.out.println("Not Included in implementation part");
                PlayerMainMenue(p);
                break;
            case 4:
                if(!playgrounds.isEmpty())
                {
                displayavailable();
                System.out.print("choose one  ");
                int choic = input.nextInt();
                choic=choic-1;
                p.sendRequest(playgrounds.get(choic));
                }
                else
                    System.out.println("No PlayGrounds in the System yet");
                PlayerMainMenue( p);
                break;
                case 5:
                break;
            default:
                System.out.println("Invalied Choice");
                PlayerMainMenue(p);
                break;
        }
        }
    public void SignMenue() {
        System.out.println("1- sign up\n2- sign in\n3- Back");
        int choice = input.nextInt();
        if (choice == 1) {
            Player p = new Player();
            ClickSignUp(p);
        }
        else if (choice == 2){
            System.out.print("Email : ");
            String email = input.next();
            System.out.print("Password : ");
            String pass = input.next();
            Player p = clicksignin(email,pass);
            if (p!=null)
                PlayerMainMenue(p);
            else
            {
                System.out.println("user not found");
                SignMenue();
            }
        }else if (choice == 3){
            
        }
        else{
            System.out.println("Invalied Choice");
            SignMenue();
        }
    }
        public Player clicksignin(String email, String pass){
        for (int i = 0; i < players.size(); i++) {
            if(players.get(i).getEmail().replaceAll("\\s+","").equalsIgnoreCase( email.replaceAll("\\s+","") )&& players.get(i).getPassword().replaceAll("\\s+","").equalsIgnoreCase( pass.replaceAll("\\s+","") )){
            return players.get(i);}
        }
               return null;
    }
    public void ClickSignUp(Player p) {
        System.out.print("Name : ");
        String name = input.next();
        System.out.print("National ID : ");
        String National_ID = input.next();
        System.out.print("Phone : ");
        String Phone =input.next();
        System.out.print("Location : ");
        String Location = input.next();
        System.out.print("Email : ");
        String Email = input.next();
        System.out.print("Password : ");
        String Password = input.next() ;
        System.out.print("Balance you would like to add to Your E_Wallet : ");
        float balance = input.nextFloat();
       if(! p.regester(name,National_ID,Phone,Location,Email,Password,balance))
       {
           System.out.println("User Already Exists");
           SignMenue();
       }
       PlayerMainMenue(p);
        
    }
}
