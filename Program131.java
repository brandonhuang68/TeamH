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

class Lbug extends Bug
{

    int steps=0;
   
  /**
   * Constructor
   */
  public Lbug()
  {
      //face down
      setDirection(180);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
      //draw vertical line
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
  }
}

class Obug extends Bug
{

    int steps=0;
   
  /**
   * Constructor
   */
  public Obug()
  {
      //face down
      setDirection(180);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
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
      if( steps >= 12 && steps < 14)
      {
          move();
          steps++;
      }
  }
}
class Tbug extends Bug
{

    int steps=0;
   
  /**
   * Constructor
   */
  public Tbug()
  {
      //face down
      setDirection(90);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
      //draw top line of the T
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

      //move back to the intersection of the the cross of the t
      if( steps < 3 )
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 3 )
      {
          setDirection(180);
      }

      //draw middle line of the T
      if( steps >= 3 && steps < 8)
      {
          move();
          steps++;
      }
      
  }
}

class Sbug extends Bug
{

    int steps=0;
   
  /**
   * Constructor
   */
  public Sbug()
  {
      //face down
      setDirection(270);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
      //draw top line of the S
      if( steps >= 0 && steps < 2)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 2 )
      {
          setDirection(180);
      }

      //vertical line
      if( steps >= 2 && steps < 4)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 4 )
      {
          setDirection(90);
      }

      //draw middle horizontal line of the S
      if( steps >= 4 && steps < 6)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 6 )
      {
          setDirection(180);
      }
      //draw vertical line ( one longer than the other ones
      if( steps >= 6 && steps < 9)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 9 )
      {
          setDirection(270);
      }
      //draw horizontal bottom line
      if( steps >= 9 && steps < 11)
      {
          move();
          steps++;
      }
      
  }
}

class Fbug extends Bug
{

    int steps=0;
   
  /**
   * Constructor
   */
  public Fbug()
  {
      //face right
      setDirection(90);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
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
      if( steps >= 10 && steps < 13)
      {
          move();
          steps++;
      }
      
  }
}

class Ubug extends Bug
{

    int steps=0;
   
  /**
   * Constructor
   */
  public Ubug()
  {
      //face down
      setDirection(180);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
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

  }
}


class Nbug extends Bug
{

    int steps=0;
   
  /**
   * Constructor
   */
  public Nbug()
  {
      //face up
      setDirection(0);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {
      //draw left vertical line
      if( steps < 5 )
      {
          move();
          steps++;
      }
     
      //change direction
      if( steps == 5 )
      {
          setDirection(150);
      }
     
      //draw bottom line
      if( steps >= 5 && steps < 10)
      {
          move();
          steps++;
      }
      //change direction
      if( steps == 10 )
      {
          setDirection(0);
      }
      //draw right vertical line
      if( steps < 15 )
      {
          move();
          steps++;
      }
      
  }
}

public class Program131
{
    //spells lots with the letters l - o - t - s
    public static void main(String[] args)
    {
        //setup LBug
        Lbug bug1 = new Lbug();
        bug1.setColor(Color.GREEN);
        Location bug1location = new Location(1, 1);
        //setup OBug
        Obug bug2 = new Obug();
        bug2.setColor(Color.GREEN);
        Location bug2location = new Location(1, 5);
        //setup TBug
        Tbug bug3 = new Tbug();
        bug3.setColor(Color.GREEN);
        Location bug3location = new Location(1, 9);
        //setup SBug
        Sbug bug4 = new Sbug();
        bug4.setColor(Color.GREEN);
        Location bug4location = new Location(1, 15);
       
        //setup OBug
        Obug bug5 = new Obug();
        bug5.setColor(Color.GREEN);
        Location bug5location = new Location(9, 5);
        
        //setup Fbug
        Fbug bug6 = new Fbug();
        bug6.setColor(Color.GREEN);
        Location bug6location = new Location(9, 9);
       
        //setup Fbug
        Fbug bug7 = new Fbug();
        bug7.setColor(Color.GREEN);
        Location bug7location = new Location(17, 1);
       
        //setup Ubug
        Ubug bug8 = new Ubug();
        bug8.setColor(Color.GREEN);
        Location bug8location = new Location(17, 5);
               
        //setup Nbug
        Nbug bug9 = new Nbug();
        bug9.setColor(Color.GREEN);
        Location bug9location = new Location(22, 9); //starts lower
       
       
        //setup Grid
        BoundedGrid myGrid = new BoundedGrid(30, 25);
       
        //setup World
        ActorWorld world = new ActorWorld(myGrid);
        world.add(bug1location, bug1);
        world.add(bug2location, bug2);
        world.add(bug3location, bug3);
        world.add(bug4location, bug4);
        world.add(bug5location, bug5);
        world.add(bug6location, bug6);
        world.add(bug7location, bug7);
        world.add(bug8location, bug8);
        world.add(bug9location, bug9);
        world.show();
    }
}