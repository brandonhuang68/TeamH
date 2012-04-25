/* Program131
 *  Create 3 bug files named bug1.java, bug2.java, bug3.java
 *  3 bug classes that draw a word (2 letters min).
 *  Created a main file called main.java that ties in each bug class
 *  produces a saying of choice.
 *  Adjusts your grid size as needed. 
 */
 
 
 //writes the phrase "LOTS OF FUN"

//import the gridworld files
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import java.awt.Color;
import info.gridworld.actor.Flower;


public class main //extends bug1
{
    
    public static void main(String[] args)
    {
    
        //spells lots with the letters l - o - t - s
        //setup bug 1
        bug1 theBug1 = new bug1();
        theBug1.setColor(Color.GREEN);
        Location theBug1location = new Location(2, 1);
        
        //spells of with the letters o - f
        //setup bug 2 
        bug2 theBug2 = new bug2();
        theBug2.setColor(Color.GREEN);
        Location theBug2location = new Location(9, 5);
        
        //spells fun of with the letters f - u - n
        //setup bug 3
        bug3 theBug3 = new bug3();
        theBug3.setColor(Color.GREEN);
        Location theBug3location = new Location(17, 1);
        
        
       
       
        //setup Grid
        BoundedGrid myGrid = new BoundedGrid(30, 25);
       
        //setup World
        ActorWorld world = new ActorWorld(myGrid);
        
        //adding an extra flower here for fun
        world.add(new Location(1, 1), new Flower());
        
        world.add(theBug1location, theBug1);
        world.add(theBug2location, theBug2);
        world.add(theBug3location, theBug3);
        
        
        //.add(bug2location, bug2);
        //world.add(bug3location, bug3);
        //world.add(bug4location, bug4);
        //world.add(bug5location, bug5);
        //world.add(bug6location, bug6);
        //world.add(bug7location, bug7);
        //world.add(bug8location, bug8);
        //world.add(bug9location, bug9);
        world.show();
    }
}