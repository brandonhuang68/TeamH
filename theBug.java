import info.gridworld.actor.Bug;

public class theBug extends Bug
{
    private int steps;
    private int rests;
    /**
     * Constructs a bug that goes around the screen
     */
    public theBug()
    {
        steps=0;
        rests=0;
    }
    /**
     * Moves to the next location
     */
    public void act()
    {
      if(steps<20&&canMove())//hasn't gone 20 steps&&can go straight forward
      {
        move();//move forward
        steps++;//increment steps
      }
      else if(steps>=20&&rests<1)//has gone too far&&hasn't waited
      {
        rests++;//don't move, but increment rests
      }
      else if(rests>=1)//has waited once--waits second time, moves next time
      {
        rests=0;//reset rests
        steps=0;//reset steps--will move next time
      }
      else//hasn't gone too far, but can't move forward
      {
        turn();//next three turn the bug 135 degrees total
        turn();
        turn();
        steps++;//increment steps
      }
    }
}
