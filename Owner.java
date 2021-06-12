package gofo;

import java.util.ArrayList;

/**
 * this class to enter all info about the owner and his playground and help in
 * displaying all requests.
 */
public class Owner extends DB {

    private String name;
    private String password;
    private String nationalID;
    private String email;
    private String phone;
    private String location;
    private final int id;
    private E_Wallet myEwallet;
    ArrayList<Playground> myplaygrounds = new ArrayList<>();
    protected ArrayList<Book> requests = new ArrayList<>();
    static int index;

    /**
     * this constructor is default to initializes the attributes.
     */
    public Owner() {
        name = "";
        password = "";
        nationalID = "";
        email = "";
        phone = "";
        location = "";
        id = index;
        index++;
        addOwner(this);
    }

    public int getId() {
        return id;
    }

    /**
     * this function to set all owners info.
     *
     * @param name to set the name of owner.
     * @param National_ID to set the national id of owner.
     * @param Phone to set the phone number of the owner.
     * @param Location to set the location of owner.
     * @param Email to set the contact email of owner.
     * @param Password to add password for owner's account on the app.
     * @return true if the email is valid.
     */
    public Boolean regester(String name, String National_ID, String Phone, String Location, String Email, String Password) {
        setName(name);
        setNationalID(nationalID);
        setPhone(Phone);
        setLocation(Location);
        setPassword(Password);
        return (setEmail(Email));
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String _password) {
        password = _password;
    }

    public String getPassword() {
        return password;
    }

    public void setNationalID(String _id) {
        nationalID = _id;
    }

    public String getNationalID() {
        return nationalID;
    }

    public boolean setEmail(String email) {
        boolean exist = false;

        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getEmail() == email) {
                exist = true;
                break;
            }
        }
        if (exist) {
            owners.remove(this);
            return false;
        } else {
            this.email = email;
            return true;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String _phone) {
        phone = _phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setLocation(String _location) {
        location = _location;
    }

    public String getLocation() {
        return location;
    }

    /**
     * this function to add owner's playground.
     *
     * @param name to set the name of playground.
     * @param Size to set size of playground.
     * @param Available_Time to set the non-reserved time of playground.
     * @param PricePerHour to set the price of reservation.
     * @param CancelationPeriod to set the period which available cancellation.
     */
    public void addPlayground(String name, float Size, String Available_Time, float PricePerHour, int CancelationPeriod) {
        Playground p = new Playground();
        p.setName(name);
        p.setSize(Size);
        p.setOwner(this);
        p.setAvailableTime(Available_Time);
        p.setPricePerHour(PricePerHour);
        p.setCancelationPeriod(CancelationPeriod);
        myplaygrounds.add(p);
        joinRequests.add(p);
    }

    /**
     * to know the requests.
     *
     * @param book
     */
    public void addRequest(Book book) {
        requests.add(book);
    }

    /**
     * to accep the request of reservation playground.
     *
     * @param index
     */
    public void acceptRequest(int index) {
        /*float price = requests.get(index).getBookPlayground().getPricePerHour();
            int i = requests.get(index).getBookPlayground().getOwner().getId();
            requests.get(index).getBookPlayer().getEwallrt().send(price, i);*/
        requests.get(index).setReqStatus(true);
    }

    /**
     * to cancel the acceptance of request reservation.
     *
     * @param index
     */
    public void deleteRequest(int index) {
        requests.remove(index);
    }

    /**
     * to display all playground of owner.
     */
    public void displayMyPlaygrounds() {
        if (!myplaygrounds.isEmpty()) {
            System.out.println(myplaygrounds);
        } else {
            System.out.println("You Haven't Added Playgrounds yet");
        }
    }

    /**
     * display all requests.
     */
    public void displayrequests() {
        System.out.println(" /*************************************************/");
        for (int i = 0; i < requests.size(); i++) {
            if (!requests.get(i).isReqStatus()) {
                System.out.println(requests.get(i));
                System.out.println(" /*************************************************/");
            }
        }
    }

    /**
     * display all booking.
     */
    public void displaybooks() {
        System.out.println(" /*************************************************/");
        for (int i = 0; i < requests.size(); i++) {
            if (requests.get(i).isReqStatus()) {
                System.out.println(requests.get(i));
                System.out.println(" /*************************************************/");
            }
        }
    }

    /**
     * this function for getting the meaningful of information.
     *
     * @return all info of owner.
     */
    @Override
    public String toString() {
        System.out.println("Owner name : " + getName());
        displayMyPlaygrounds();
        return "\nEmail :  " + getEmail() + "\nID : " + id
                + "\nPhone : " + getPhone();
    }

}
