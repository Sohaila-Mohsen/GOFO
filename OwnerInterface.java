package gofo;

import static gofo.PlayerInterface.input;

/**
 * interface to help owner to use app easily.
 */
public class OwnerInterface extends DB {

    /**
     * function enable owner to choose: display his playground, requests,booking
     * or sign out.
     *
     * @param o
     */
    public void OwnerMainMenue(Owner o) {
        System.out.println("1- My Playgrounds \n2- My Requests \n3- Books\n4- Sign Out");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                o.displayMyPlaygrounds();
                System.out.println("\n\n1- Add playground\n2- Back");
                choice = input.nextInt();
                if (choice == 1) {
                    clickAddPlayground(o);
                }
                OwnerMainMenue(o);
                break;
            case 2:
                o.displayrequests();
                clickRequest(o);
                OwnerMainMenue(o);
                break;
            case 3:
                o.displaybooks();
                OwnerMainMenue(o);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalied Choice");
                OwnerMainMenue(o);
                break;
        }

    }

    /**
     * enable owner to accept or refuse requests.
     *
     * @param o
     */
    public void clickRequest(Owner o) {
        System.out.println("1- Choose one\n2- Back");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Enter the Number of request");
            int c = input.nextInt();
            System.out.println("1- Accept\n2- Delete\n3- Back");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    o.acceptRequest(c);
                    OwnerMainMenue(o);
                    break;
                case 2:
                    o.deleteRequest(c);
                    OwnerMainMenue(o);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalied Choice");
                    OwnerMainMenue(o);
                    break;
            }
        }
    }

    public void SignMenue() {
        System.out.println("1- sign up\n2- sign in\n3- Back");
        int choice = input.nextInt();
        if (choice == 1) {
            Owner o = new Owner();
            ClickSignUp(o);
        } else if (choice == 2) {
            String email = input.next();
            String pass = input.next();
            Owner o = clicksignin(email, pass);
            if (o != null) {
                OwnerMainMenue(o);
            } else {
                System.out.println("user not found");
                SignMenue();
            }
        } else if (choice == 3) {

        } else {
            System.out.println("Invalied Choice");
            SignMenue();
        }
    }

    public Owner clicksignin(String email, String pass) {
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getEmail().replaceAll("\\s+", "").equalsIgnoreCase(email.replaceAll("\\s+", "")) && owners.get(i).getPassword().replaceAll("\\s+", "").equalsIgnoreCase(pass.replaceAll("\\s+", ""))) {
                return owners.get(i);
            }
        }
        return null;
    }

    public void ClickSignUp(Owner o) {
        System.out.print("Name : ");
        String name = input.next();
        System.out.print("National ID : ");
        String National_ID = input.next();
        System.out.print("Phone : ");
        String Phone = input.next();
        System.out.print("Location : ");
        String Location = input.next();
        System.out.print("Email : ");
        String Email = input.next();
        System.out.print("Password : ");
        String Password = input.next();
        boolean check = o.regester(name, National_ID, Phone, Location, Email, Password);
        if (!check) {
            System.out.println("User Already Exists");
            SignMenue();
        }
        OwnerMainMenue(o);

    }

    public void clickAddPlayground(Owner o) {
        System.out.print("Name : ");
        String name = input.next();
        System.out.print("Size : ");
        float Size = input.nextFloat();
        System.out.println("Available Time : ");
        System.out.print("Day : ");
        String day = input.next();
        System.out.print("Month : ");
        String Month = input.next();
        System.out.print("yerar : ");
        String year = input.next();
        System.out.print("From\nHour : ");
        String h1 = input.next();
        System.out.print("to\nHour : ");
        String h2 = input.next();
        String Available_Time = "From " + day + "/" + Month + "/" + year + " At " + h1 + " To " + h2;
        System.out.print("Price Per Hour : ");
        float PricePerHour = input.nextFloat();
        System.out.print("Cancelation Period : ");
        int CancelationPeriod = input.nextInt();
        o.addPlayground(name, Size, Available_Time, PricePerHour, CancelationPeriod);

    }
}
