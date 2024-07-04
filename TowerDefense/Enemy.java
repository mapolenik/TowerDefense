import greenfoot.*;  // (World,ed Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The best game.
 * 
 * @author (Milan) 
 * @version (1.0 04.07.2024)
 */
public class Enemy extends Actor
{
    /**
     * This is enemy
     * of the state
     */
    public void act()
    {
        this.move(1);

        if (this.isAtEdge())
        {
            this.turn(180);
        }
        
        if (this.isTouching(Direction.class))
        Direction direction = (Direction)this.getOneIntersectingObject(Direction.class);
        
        if (direction != null)

        {
            this.turn(90);
            int rotation = direction.getRotation();
            this.setRotation(rotation);

        }
        
        if (this.isTouching(Orb.class))
        {
            this.turn(-90);
        }

    }
}
