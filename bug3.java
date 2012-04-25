//draws "fun" with a single bug

//import the gridworld files
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

import java.awt.Color;



//class for bug3
//draws fun
class bug3 extends Bug
{

    private BoundedGrid myGrid = new BoundedGrid(30, 25);
     
    int steps=0;
   
  /**
   * Constructor
   */
  public bug3()
  {
      //face down
      int steps = 0;
      setDirection(90);
  }   

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
      //already initialized heading
      //draw top line of the f
      if( steps >= 0 && steps < 2)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 2 )
      {
          setDirection(270);
      }

      //backtrack top line
      if( steps >= 2 && steps < 4)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 4 )
      {
          setDirection(180);
      }

      //draw middle vertical line of the F
      if( steps >= 4 && steps < 6)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 6 )
      {
          setDirection(90);
      }
      //draw middle horizontal line 
      if( steps >= 6 && steps < 8)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 8 )
      {
          setDirection(270);
      }
      //backtrack middle line
      if( steps >= 8 && steps < 10)
      {
          move();
          steps++;
      }
      if( steps == 10 )
      {
          setDirection(180);
      }
      if( steps >= 10 && steps < 14)
      {
          move();
          steps++;
      }
      
      //the U
      
      if (steps == 14)
      {
          //new location and direction
          moveTo(new Location(17, 5));
          setDirection(180);
      }
      
      //draw left vertical line
      if( steps >= 14 && steps < 19 )
      {
          move();
          steps++;
      }
     
      //change direction
      if( steps == 19 )
      {
          setDirection(90);
      }
     
      //draw bottom line
      if( steps >= 19 && steps < 21)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 21 )
      {
          setDirection(0);
      }
      //draw right vertical line
      if( steps >= 21 && steps < 27 )
      {
          move();
          steps++;
      }
      
      //N
      
      if( steps == 27 )
      {   
          //new location and direction
          moveTo(new Location(22, 9));
          setDirection(0);
      }
      //draw left vertical line
      if( steps >=27 && steps <32 )
      {
          move();
          steps++;
      }
     
      //change direction
      if( steps == 32 )
      {
          setDirection(150);
      }
     
      //draw bottom line
      if( steps >= 32 && steps < 37)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 37 )
      {
          setDirection(0);
      }
      //draw right vertical line
      if(steps>=37 && steps < 42)
      {
          move();
          steps++;
      }
      
      

      
      
      
      
  }
  
 }
  