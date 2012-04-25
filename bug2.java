//draws "lots" with a single bug

//import the gridworld files
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

import java.awt.Color;



//class for bug2 
//draws OF
class bug2 extends Bug
{

    private BoundedGrid myGrid = new BoundedGrid(30, 25);
     
    int steps=0;
   
  /**
   * Constructor
   */
  public bug2()
  {
      //face down
      int steps = 0;
      setDirection(180);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
      //already initialized heading
      
      //draw left vertical line
      if( steps < 5 )
      {
          move();
          steps++;
      }
     
      //change direction
      if( steps == 5 )
      {
          setDirection(90);
      }
     
      //draw bottom line
      if( steps >= 5 && steps < 7)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 7 )
      {
          setDirection(0);
      }
      //draw right vertical line
      if( steps < 12 )
      {
          move();
          steps++;
      }
      if( steps == 12 )
      {
          setDirection(270);
      }
            //draw bottom line
      if( steps >= 12 && steps < 15)
      {
          move();
          steps++;
      }
      
      //F
      
      if( steps ==15)
      {
          //set for F
          setDirection(90);
          moveTo(new Location(9, 9));
      }
      
      //draw top line of the f
      if( steps >= 15 && steps < 17)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 17 )
      {
          setDirection(270);
      }

      //backtrack top line
      if( steps >= 17 && steps < 19)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 19 )
      {
          setDirection(180);
      }

      //draw middle vertical line of the F
      if( steps >= 19 && steps < 21)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 21 )
      {
          setDirection(90);
      }
      //draw middle horizontal line 
      if( steps >= 21 && steps < 23)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 23 )
      {
          setDirection(270);
      }
      //backtrack middle line
      if( steps >= 23 && steps < 25)
      {
          move();
          steps++;
      }
      //finish the F
      if( steps == 25 )
      {
          setDirection(180);
      }
      if( steps >= 25 && steps < 28)
      {
          move();
          steps++;
      }
      
      
  }
  
 }
  