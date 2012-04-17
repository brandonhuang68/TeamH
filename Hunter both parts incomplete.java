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
        /*
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
        */
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
        
        int bugChoice = (int)(Math.random() * 3); 
        //defines bugChoice as an int from 0-2
        
        System.out.println(bugChoice);
        int bugxcor = 9;
        int bugycor = 9;
        
        if (bugChoice==0)
        {
          System.out.println("wave");
          waveBug bug1 = new waveBug(60);
          bug1.setColor(Color.RED);
          Location bug1location = new Location(bugycor,bugxcor);
         //add new bug
          world.add(new Location(bugycor, bugxcor), bug1);
        }
        else if (bugChoice==1)
        {
          System.out.println("zigzag");
					zigzagBug bug1 = new zigzagBug(90);
					bug1.setColor(Color.RED);
					Location bug1location = new Location(bugycor,bugxcor);
          //add new bug
          world.add(new Location(bugycor, bugxcor), bug1);	
        }
        else if (bugChoice==2)
        {
          System.out.println("square");
          squareBug bug1 = new squareBug(1);
          bug1.setColor(Color.BLUE);
          Location bug1location = new Location(bugycor, bugxcor);
          //add new bug
          world.add(new Location(bugycor, bugxcor), bug1);
        }
        	
     

        
        
        //add new Chameleon
        world.add(new Location(0, 0), new ChameleonCritter());
        
        world.show();
    }
}

class waveBug extends Bug //draws the wave
{

  int degree = 90;
  int rightleft; //right = 1 left = 0
  int increment;
   
  /**
   * Constructor
   */
  public waveBug(int increment)
  {
    //set increment
    this.increment = increment;
   
    //set initial degree
    setDirection(degree);       
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
    if(!canMove()) 
    //while the bug can't move based on a rock or the edge of the screen
    {
      //turn here a random amount
      int bugRandomTurn = (int)(Math.random() * 360); 
      //turns from 0 to 359 degrees
      setDirection(bugRandomTurn);//sets the new random direction
      
    }
    else //the bug can move
    {
      //move bug forward
      move();
      
      //check the degree to determine the right left value
      if(degree >= 270)
        rightleft = 1;
      if(degree <= 90)
        rightleft = 0;
      //add or subtract the increment from the degree heading
      //based on original orientation
      //determined by the rightleft variable
      if(rightleft == 0)
        degree += increment;
      else
        degree -= increment;
      setDirection(degree);
    }
  }
}

class zigzagBug extends Bug //draws the zigzag
{
  //initialize the variables 
  int degree = 45;
  int updown; //up = 1 down = 0
  int increment;
  int delay = 0;
   
  /**
   * Constructor
   */
  public zigzagBug(int increment)
  {
    //set increment
    this.increment = increment;
   
    //set initial degree
    setDirection(degree);       
  }
  /**
   * Does something when step is pressed.
   */
  public void act()
  {
  
    if(!canMove()) 
    //while the bug can't move based on a rock or the edge of the screen
    {
      //turn here a random amount
      int bugRandomTurn = (int)(Math.random() * 360); 
      //turns from 0 to 359 degrees
      setDirection(bugRandomTurn);//sets the new random direction
      
      
    }
    else //the bug can move
    {
      //move bug forward
      move();
      //increment the delay
      delay++;
      
      if(delay>=4) //as long as the delay is greater than or equal to 4...
      {
        //if the degree value is greater than 90, pointing up
        if(degree >= 90)
          updown = 1;
        //if the degree value is less than 90, pointing down
        if(degree <= 90)
          updown = 0;
          
        //if down, add to increment
        if(updown == 0)
        {
          degree += increment;
          delay = 0;
        }
        else
        //if up, subtract from increment
        {
          degree -= increment;
          delay = 0;
        }
        //update the direction
        setDirection(degree);
      }
    }
  }
}


class squareBug extends Bug //draws the square spiral
{
    //initialize the degree
    int degree = 0;


    double spiralDist =0; //start at 1 and will increase
  /**
   * Constructor
   */
  public squareBug(int increment)
  {

     
      //set initial degree
      setDirection(degree);       
  }

  /**
   * Does something when step is pressed.
   * Algorthim: 
   *   constantly increase the heading of the bug
   *   Increase the length of each section of the spiral
   *   Effectively grows the further you go towards the outside of the spiral
   */
  public void act()
  {
    if(!canMove())
    {
      //turn here a random amount
      int bugRandomTurn = (int)(Math.random() * 360); 
      //turns from 0 to 359 degrees
      setDirection(bugRandomTurn);//sets the new random direction
      
    }
    else
    {
      spiralDist+=1;  //increases to the spiral distance (length of each section)  
      degree+=90; //increase the dgrees
      //set new degree for the new heading of the bug
      setDirection(degree);
      
      //for loop makes the bug move forward
      //the distance the bug goes increases the further to the outside you are
      for (int i = 0;i< spiralDist;i++)
      {
        //move bug forward
        move();
      }

      //set new degree for the new heading of the bug
      setDirection(degree);
      
      //repeat for the other dimension at the same length
      //for loop makes the bug move forward
      //the distance the bug goes increases the further to the outside you are
      for (int i = 0;i< spiralDist;i++)
      {
        //move bug forward
        move();
      }
    }
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

    
       
    //get current location
    Location currentLocation = this.getLocation();

		//get list of neighbors
		ArrayList<Actor> neighbors = grid.getNeighbors(this.getLocation());
		
		boolean areNeighbors = false; //start by assuming there are no neighbors
		
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
        
        areNeighbors = true; //tell that there is at least one flower
      
      }
    } 
    if ( areNeighbors ==false) //if no neighbors 
    {
     //get a list of available locations
     ArrayList<Location> validLocations =

     grid.getEmptyAdjacentLocations(currentLocation);
     //pick a random location
     int randLocation = (int) (Math.random() * validLocations.size());

     //move there
     moveTo(validLocations.get(randLocation));
    }
	}
	  
}
