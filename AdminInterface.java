package gofo;

import static gofo.PlayerInterface.input;

/**
 * interface to help admin to use app easily.
 */
public class AdminInterface extends DB {

    /**
     * function to enable admin to choose if he want display player, owner,
     * playground or playground's request or exit.
     *
     * @param a
     */
    public void AdminMainMenue(Admin a) {
        System.out.println("1- Display All Players\n2- Display All Owners\n3- Display All Playgrounds\n4- Display All Playgroungs Requests\n5- Exit");
        int choice = input.nextInt();

        switch (choice) {
            case 1:

                a.displayAllPlayers();
                AdminMainMenue(a);
                break;
            case 2:
                a.displayAllOwners();
                AdminMainMenue(a);
                break;
            case 3:
                a.displayAllPlaygrounds();
                AdminMainMenue(a);
                break;
            case 4:
                a.displayAllrequests();
                clickRequests(a);
                AdminMainMenue(a);
                break;
            case 5:

                break;
            default:
                System.out.println("Invalied Choice");
                AdminMainMenue(a);
                break;
        }
    }

    /**
     * enable admin to active or delete request.
     *
     * @param a
     */
    public void clickRequests(Admin a) {
        System.out.println("1- Choose one\n2- Back");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Enter the Number of request");
            int c = input.nextInt();
            System.out.println("1- Activzte\n2- Delete\n3- Back");
            choice = input.nextInt();
            switch (choice) {
                case 1:

                    a.activate(c);
                    break;
                case 2:
                    a.deletePlayground(c);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalied Choice");
                    break;
            }
        }
    }

}
