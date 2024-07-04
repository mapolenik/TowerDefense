import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(24, 12, 50);
        
        Enemy enemy = new Enemy();
        addObject(enemy, 12, 5);
        
        Direction direction = new Direction();
        addObject(direction, 14, 5);
        
        Orb orb = new Orb();
        addObject(orb, 14, 7);
        
        /*
        for (int i = 0; i < 2; i++) {
            Direction direction = new Direction();
            addObject(direction, Greenfoot.getRandomNumber(24), Greenfoot.getRandomNumber(12));
        }
        */
        
        /*Direction direction = new Direction();
        addObject(direction, 8, 2);
        addObject(direction, 12, 10);*/
        
        
        
    }
}
