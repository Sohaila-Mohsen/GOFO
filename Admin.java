package gofo;

/**
 * this class to enter all info about the player and help in active and remove
 * playground.
 */
public class Admin extends DB {

    private String name;
    private String email;

    /**
     * this constructor is default to initializes the attributes.
     */
    public Admin() {
        this.name = "";
        this.email = "";
    }

    /**
     * to get name of admin.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * to set name of admin.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * to get email of admin.
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * to set email of admin.
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * function to activate playground.
     *
     * @param index
     */
    public void activate(int index) {
        joinRequests.get(index).setIsActive(true);
        playgrounds.add(joinRequests.get(index));
        joinRequests.remove(index);
    }

    /**
     * function to delete playground.
     *
     * @param index
     */
    public void deletePlayground(int index) {
        joinRequests.remove(index);
    }

    /**
     * to display all players in system.
     */
    public void displayAllPlayers() {
        System.out.println("/**************************************/");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
            System.out.println("/**************************************/");
        }
    }

    /**
     * to display all playgrounds in system.
     */
    public void displayAllPlaygrounds() {
        System.out.println("/**************************************/");
        for (int i = 0; i < playgrounds.size(); i++) {
            System.out.println(playgrounds.get(i));
            System.out.println("/**************************************/");
        }
    }

    /**
     * to display all owner in system.
     */
    public void displayAllOwners() {
        System.out.println("/**************************************/");
        for (int i = 0; i < owners.size(); i++) {
            System.out.println(owners.get(i));
            System.out.println("/**************************************/");
        }
    }

    /**
     * to display all requests.
     */
    public void displayAllrequests() {
        System.out.println("/**************************************/");
        for (int i = 0; i < joinRequests.size(); i++) {
            System.out.println(joinRequests.get(i));
            System.out.println("/**************************************/");
        }
    }

}
