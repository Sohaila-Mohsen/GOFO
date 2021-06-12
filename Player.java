
package gofo;

import java.util.ArrayList;


public class Player extends DB{
    private String name , nationalID , password , email , phone , location;
    private E_Wallet ewallrt;
    private final int id;
    static int index ;
    public static  ArrayList<Book> myBooking = new ArrayList<>();

    public Player() {
        name="";
        password="";
        nationalID="";
        email="";
        phone="";
        location="";
        id=index;
        index++;
        players.add(this);
    }

    public Boolean regester (String name,String National_ID,String Phone,String Location,String Email,String Password , float balance)
    {
        setName(name);
        setNationalID(nationalID);
        setPhone(Phone);
        setLocation(Location);
        setPassword(Password);
        //ewallrt.setBalance(balance);
        return (setEmail(Email));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        boolean exist = false;
        
        for (int i = 0; i < players.size() ; i++) {
            if(email == null ? players.get(i).getEmail() == null : email.equals(players.get(i).getEmail()))
            {
                exist = true ;
                break;
            }
        }
        if (exist)
        {
            players.remove(this);
            return false;
        }
        else
        {
            this.email = email;
            return true;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public E_Wallet getEwallrt() {
        return ewallrt;
    }

    public void setEwallrt(E_Wallet ewallrt) {
        this.ewallrt = ewallrt;
    }

  public void sendRequest(Playground p){
     // float balnce =  ewallrt.getBalance();
      float price = p.getPricePerHour();
      
    //if (price <=  balnce) {
      Book b = new Book();
      b.setBookPlayer(this);
      b.setBookPlayground(p);
      p.getOwner().addRequest(b);
      myBooking.add(b);
      System.out.println("Request Sent");
      //}
    /*else{
          System.out.println("No Enough Ballence in Your E_Wallet");
    }*/
      
  }
    public void displayBooking()
    {
        System.out.println("/***********************************/");
        for (int i = 0; i <myBooking.size(); i++) {
            if(myBooking.get(i).getReqStatus())
            {
                System.out.println(myBooking.get(i));
                System.out.println("/***********************************/");
            }
        }
    }
    public void displayrequests()
    {
        System.out.println("/***********************************/");
        for (int i = 0; i <myBooking.size(); i++) {
            if(!myBooking.get(i).getReqStatus())
            {
                System.out.println(myBooking.get(i));
                System.out.println("/***********************************/");
            }
        }
    } 
    @Override
    public String toString(){
                System.out.println("Player name : "+ getName());
                  displayBooking();
		  return "\nEmail :  "+getEmail()+"\nID : " + id
		  +"\nPhone : " +getPhone() ; 
        }

}
