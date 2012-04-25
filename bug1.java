//draws "lots" with a single bug

//import the gridworld files
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

import java.awt.Color;




class bug1 extends Bug
{

    private BoundedGrid myGrid = new BoundedGrid(30, 25);
     
    int steps=0;
   
  /**
   * Constructor
   */
  public bug1()
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
      
      //THE L
      
    
      //draw vertical line
      if( steps < 5 )
      {
          move();
          steps++;
      }
     
      //change direction
      if( steps == 4)
      {
          setDirection(90);
          System.out.println("TEST");
      }
     
      //draw bottom line
      if( steps >= 5 && steps < 7)
      {
          move();
          steps++;
      }
      if( steps ==7)
      {
          //set for O
          setDirection(180);
          moveTo(new Location(1, 5));
      }
    
      //O here
      if( steps >= 7 && steps < 12 )
      {
          move();
          steps++;
      }
     
      //change direction
      if( steps == 12 )
      {
          setDirection(90);
      }
     
      //draw bottom line
      if( steps >= 12 && steps < 14)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 14 )
      {
          setDirection(0);
      }
      //draw right vertical line
      if( steps >= 14 &&  steps < 19 )
      {
          move();
          steps++;
      }
      if( steps == 19 )
      {
          setDirection(270);
      }
            //draw bottom line
      if( steps >= 19 && steps < 22)
      {
          move();
          steps++;
      }
      if( steps == 22 )
      {
        //set for T
        setDirection(90);
        moveTo(new Location(1, 9));
      }
      
      if( steps >= 22 && steps < 24)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 24 )
      {
          setDirection(270);
      }

      //move back to the intersection of the the cross of the t
      if(  steps >= 24 && steps < 25 )
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 25 )
      {
          setDirection(180);
      }

      //draw middle line of the T
      if( steps >= 25 && steps < 31)
      {
          move();
          steps++;
      }
      //set for S
      //change direction
      if( steps == 31 )
      {
          setDirection(270);
          moveTo(new Location(1, 15));
          
      }
      //draw top line of the S
      if( steps >= 31 && steps < 33)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 33 )
      {
          setDirection(180);
      }

      //vertical line
      if( steps >= 33 && steps < 35)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 35 )
      {
          setDirection(90);
      }

      //draw middle horizontal line of the S
      if( steps >= 35 && steps < 37)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 37 )
      {
          setDirection(180);
      }
      //draw vertical line ( one longer than the other ones
      if( steps >= 37 && steps < 40)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 40 )
      {
          setDirection(270);
      }
      //draw horizontal bottom line
      if( steps >= 40 && steps < 42)
      {
          move();
          steps++;
      }
      
  }
  
 }
  