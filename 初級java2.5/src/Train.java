
public class Train extends Vehicle
{
	public Train(int x,int y,int vx,int vy) 
	{
		super(x,y,vx,vy);
	}
	public void draw(MyFrame farame) 
	{
		farame.fillRect(x,y,100,30);
		farame.fillOval(x+5,y+30,10,10);
		farame.fillOval(x+15,y+30,10,10);
		farame.fillOval(x+75,y+30,10,10);
		farame.fillOval(x+85,y+30,10,10);
	}
	
}

