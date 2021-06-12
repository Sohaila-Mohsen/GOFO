
package gofo;

import java.util.ArrayList;

public class DB {
    /*******************Player**********************************/
    public static  ArrayList<Player> players = new ArrayList<>();
    public Player getPlayer (int id)
    {
        return players.get(id);
    }
    public void addPlayer(Player p)
    {
        players.add(p);
        
    }
    public void removePlayer (int id)
    {
        players.remove(id);
    }
    /*************************************************************/
    
    /*************************Owner********************************/
    public static  ArrayList<Owner> owners = new ArrayList<>();
    public Owner getowner (int id)
    {
        return owners.get(id);
    }
    public void addOwner (Owner o)
    {
        owners.add(o);
        
    }
    public void removeOwner (int id)
    {
        owners.remove(id);
    }

/****************************************************************/

/**********************Playground*********************************/    

public static  ArrayList<Playground> playgrounds = new ArrayList<>();
public static  ArrayList<Playground> joinRequests = new ArrayList<>();
    public void displayavailable()
    {
        System.out.println("/******************************************/\n");
        int counter = 0;
        for (int i = 0; i < playgrounds.size(); i++) {
            if(!playgrounds.get(i).getStatue()){
                counter++;
                System.out.println(counter + " - Playground#"+counter);
                System.out.println(playgrounds.get(i));
            System.out.println("/******************************************/\n");
            }
        }
    }
/******************************************************************/

}