
public class Truck extends Vehicle
{
	public Truck(int x,int y,int vx,int vy) 
	{
		super(x,y,vx,vy);
	}
	public void draw(MyFrame farame) 
	{
		farame.fillRect(x+60,y,20,20);
		farame.fillRect(x,y+20,80,20);
		farame.fillOval(x,y+40,10,10);
		farame.fillOval(x+10,y+40,10,10);
		farame.fillOval(x+70,y+40,10,10);
	}
}
