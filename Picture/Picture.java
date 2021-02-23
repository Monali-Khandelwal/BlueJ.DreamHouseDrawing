
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square door;
    private Triangle roof;
    private Circle sun;
    private Square grass;
    private Circle window2;
    private Circle bush;
    private Triangle leaves;
    private Square pathway;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        //////House Outer Main Parts
        
        //Walls
        wall = new Square();
        wall.moveVertical(150);
        wall.moveHorizontal(100);
        wall.changeSize(200);
        wall.makeVisible();
        
        //door
        door = new Square();
        door.changeColor("white");
        door.changeSize (90);
        door.moveHorizontal(150);
        door.moveVertical(270);
        door.makeVisible();
        
        //Roof
        roof = new Triangle();
        roof.changeSize(90, 200);
        roof.moveHorizontal(200);
        roof.moveVertical(95);
        roof.makeVisible();
        
        
        //////Windows

        //Square Window 1
        window = new Square();
        window.changeColor("blue");
        window.changeSize(30);
        window.moveHorizontal(120);
        window.moveVertical(180);
        window.makeVisible();
        
        //Square Window 2
        
        window = new Square();
        window.changeColor("blue");
        window.changeSize(30);
        window.moveHorizontal(250);
        window.moveVertical(180);
        window.makeVisible();
        
        //Circle Window 1
        window2 = new Circle();
        window2.changeColor("blue");
        window2.changeSize(40);
        window2.moveHorizontal(140);
        window2.moveVertical(230);
        window2.makeVisible();
        
        //Circle Window 2
        window2 = new Circle();
        window2.changeColor("blue");
        window2.changeSize(40);
        window2.moveHorizontal(270);
        window2.moveVertical(230);
        window2.makeVisible();
        
        //////Greenery
        
        //Bush 1
        bush = new Circle();
        bush.changeColor("green");
        bush.changeSize(50);
        bush.moveHorizontal(380);
        bush.moveVertical (300);
        bush.makeVisible();
        
        bush = new Circle();
        bush.changeColor("green");
        bush.changeSize(50);
        bush.moveHorizontal(410);
        bush.moveVertical (300);
        bush.makeVisible();
        
        //Bush 2
        bush = new Circle();
        bush.changeColor("green");
        bush.changeSize(50);
        bush.moveHorizontal(280);
        bush.moveVertical (300);
        bush.makeVisible();
        
        bush = new Circle();
        bush.changeColor("green");
        bush.changeSize(50);
        bush.moveHorizontal(310);
        bush.moveVertical (300);
        bush.makeVisible();
        
        //Tree
        leaves = new Triangle();
        leaves.changeSize(90, 250);
        leaves.moveHorizontal(50);
        leaves.moveVertical(300);
        leaves.makeVisible();
        
        leaves = new Triangle();
        leaves.changeSize(90,230);
        leaves.moveHorizontal(50);
        leaves.moveVertical(270);
        leaves.makeVisible();
        
        leaves = new Triangle();
        leaves.changeSize(90,190);
        leaves.moveHorizontal(50);
        leaves.moveVertical(240);
        leaves.makeVisible();
        
        leaves = new Triangle();
        leaves.changeSize(90,160);
        leaves.moveHorizontal(50);
        leaves.moveVertical(210);
        leaves.makeVisible();
        
        leaves = new Triangle();
        leaves.changeSize(90,130);
        leaves.moveHorizontal(50);
        leaves.moveVertical(180);
        leaves.makeVisible();
        
        //Sun
        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(100);
        sun.moveVertical(-20);
        sun.changeSize(60);
        sun.makeVisible();
        
        //Grass
        grass = new Square();
        grass.changeColor("green");
        grass.moveVertical(350);
        grass.moveHorizontal(-100);
        grass.changeSize(800);
        grass.makeVisible();
        
        ///Pathway
        
        //Pathway Part 1
        pathway = new Square();
        pathway.changeColor("magenta");
        pathway.moveVertical(350);
        pathway.moveHorizontal(150);
        pathway.changeSize(90);
        pathway.makeVisible();
        
        //Pathway Part 2
        pathway = new Square();
        pathway.changeColor("magenta");
        pathway.moveVertical(380);
        pathway.moveHorizontal(150);
        pathway.changeSize(90);
        pathway.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
