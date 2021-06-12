package gofo;

import java.util.Date;

/**
 * this class to add al info of playground.
 */
public class Playground extends DB {

    private String name;
    private float size;
    private String availableTime;
    private float pricePerHour;
    private int cancelationPeriod;
    private int id;
    private boolean statue;
    private boolean isActive;
    protected Owner owner;
    static int index = 0;

    /**
     * this constructor is default to initializes the attributes.
     */
    public Playground() {
        name = "";
        size = 0;
        availableTime = "";
        pricePerHour = 0;
        cancelationPeriod = 0;
        statue = false;
        isActive = false;
        id = index;
        index++;
    }

    /**
     * to get id od playground.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * to set id of playground.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * to get name of playground
     *
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * to set name of playground.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * to get size of playeground.
     *
     * @return size.
     */
    public float getSize() {
        return size;
    }

    /**
     * to enter size of playground.
     *
     * @param size
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * to get available time of playground to be reserved.
     *
     * @return available time.
     */
    public String getAvailableTime() {
        return availableTime;
    }

    /**
     * to enter available time of playground to be reserved.
     *
     * @param availableTime
     */
    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    /**
     * to get price of playground reservation per hour.
     *
     * @return pricePerHour.
     */
    public float getPricePerHour() {
        return pricePerHour;
    }

    /**
     * to enter price of playground reservation per hour.
     *
     * @param pricePerHour
     */
    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    /**
     * to get cancellation period.
     *
     * @return cancellation period.
     */
    public int getCancelationPeriod() {
        return cancelationPeriod;
    }

    /**
     * to set cancellation period.
     *
     * @param cancelationPeriod.
     */
    public void setCancelationPeriod(int cancelationPeriod) {
        this.cancelationPeriod = cancelationPeriod;
    }

    /**
     * to get the request status.
     *
     * @return status.
     */
    public boolean getStatue() {
        return statue;
    }

    /**
     * to set the request status.
     *
     * @param statue
     */
    public void setStatue(boolean statue) {
        this.statue = statue;
    }

    /**
     * to know if the playground active.
     *
     * @return the status of playground.
     */

    public boolean isIsActive() {
        return isActive;
    }

    /**
     * to set status of playground active or not.
     *
     * @param isActive.
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * to get owner info of playground.
     *
     * @return owner.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * to set playground's owner.
     *
     * @param owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * this function for getting the meaningful of information.
     *
     * @return all info of playground.
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nSize: " + size + "\n" + "Price Per Hour: " + pricePerHour + "\n" + "Available Time" + availableTime + "\nID : " + id;
    }

}
