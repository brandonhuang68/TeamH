/* Hunter part of Project 13

 * creates a critter
 * critter hunts the bug by following the flower trail 
 * also avoids rocks by looking at color
 *   avoids neighbors that have the code for black (rocks)
 */



//import files
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class theCritter
{
    public static void main(String[] args)
    {
        //create world
        ActorWorld world = new ActorWorld();

        //add flowers        
        world.add(new Location(1, 1), new Flower());
        world.add(new Location(1, 2), new Flower());
        world.add(new Location(1, 3), new Flower());
        world.add(new Location(1, 4), new Flower());
        world.add(new Location(1, 5), new Flower());
        world.add(new Location(1, 6), new Flower());
        world.add(new Location(2, 6), new Flower());
        world.add(new Location(3, 6), new Flower());
        world.add(new Location(4, 6), new Flower());
        world.add(new Location(5, 6), new Flower());
        world.add(new Location(6, 6), new Flower());
        
        //setup all 20 rocks with an array
        Rock rocks[]=new Rock[20];
        for(int i=0;i<20;i++)
        {
          rocks[i]=new Rock();
        }
       
        //add rocks
        
        for(int i=0;i<20;i++)
        {
          world.add(rocks[i]);
        }

        //add new Chameleon
        world.add(new Location(0, 0), new ChameleonCritter());

        world.show();
    }
}


class ChameleonCritter extends Critter
{
  public ChameleonCritter()
  {
  
  }
	
	public void act()
	{
		Grid<Actor> grid = this.getGrid();

		//get list of neighbors
		ArrayList<Actor> neighbors = grid.getNeighbors(this.getLocation());
		
		//move to location of neighbors in list
		for(Actor x: neighbors)
    {
      //get object description
      String objectDescription = x.toString();
      //only will move if the neighbor is red - the color of the bug
      
      //thus, check to see if the object is black - or is a rock
      
      //procede by not doing anything if it is a rock
      
      //if the neighbor is not a rock, go ahead and move
      if( objectDescription.contains("r=0,g=0,b=0") ) //code for black
      {
        //rock - do not do anything
      }
      else //not a rock ( a bugs trail of flowers)
      {
        //move to the location of the flower
        moveTo(x.getLocation());
      }
    } 
	}
	  
}
