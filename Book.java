package gofo;

/**
 * Book class help player to book playground
 */
public class Book {

    protected Player bookPlayer;
    protected Playground bookPlayground;
    protected boolean reqStatus;

    /**
     * this constructor is default to initializes the attributes.
     */
    public Book() {
        reqStatus = false;
    }

    /**
     * this function to return the player who books playground.
     *
     * @return book player.
     */
    public Player getBookPlayer() {
        return bookPlayer;
    }

    /**
     * this function to set the player who books playground.
     *
     * @param bookPlayer.
     */
    public void setBookPlayer(Player bookPlayer) {
        this.bookPlayer = bookPlayer;
    }

    /**
     * this function to return the booked playground.
     *
     * @return booked playground.
     */
    public Playground getBookPlayground() {
        return bookPlayground;
    }

    /**
     * this function to set booked playground.
     *
     * @param bookPlayground.
     */
    public void setBookPlayground(Playground bookPlayground) {
        this.bookPlayground = bookPlayground;
    }

    /**
     * this function to return the request.
     *
     * @return the status of request.
     */
    public boolean isReqStatus() {
        return reqStatus;
    }

    /**
     * this function to set the request status.
     *
     * @param reqStatus
     */
    public void setReqStatus(boolean reqStatus) {
        this.reqStatus = reqStatus;
    }

    public boolean getReqStatus() {
        return reqStatus;
    }

    /**
     * this function to add the playground into the playground which player
     * booking and send the request to playground's owner.
     *
     * @param p to define the player who reserved the playground.
     * @param pg the play ground which is booked by the player p.
     */
    public void assign(Player p, Playground pg) {
        bookPlayer = p;
        bookPlayground = pg;
        reqStatus = false;
        Player.myBooking.add(this);
        bookPlayground.getOwner().addRequest(this);
    }

    /**
     * this function for getting the meaningful of information.
     *
     * @return player name, owner name,playground name,price/hour,cancellation
     * period of playground.
     */
    @Override
    public String toString() {
        if (!reqStatus) {
            return "Player name : " + bookPlayer.getName() + " Owner Name : " + bookPlayground.owner.getName()
                    + " Playground Name :  " + bookPlayground.getName() + " price/hour : " + bookPlayground.getPricePerHour()
                    + "cancelation Peroid : " + bookPlayground.getCancelationPeriod() + " status : pending";
        } else {
            return "Player name : " + bookPlayer.getName() + " Owner Name : " + bookPlayground.owner.getName()
                    + " Playground Name :  " + bookPlayground.getName() + " price/hour : " + bookPlayground.getPricePerHour()
                    + "cancelation Peroid : " + bookPlayground.getCancelationPeriod() + " status : Accepted";
        }
    }

}
