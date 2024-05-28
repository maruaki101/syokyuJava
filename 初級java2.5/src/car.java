
public class car 
{
	int x,y,vx,vy;
	public car(int x, int y,int vx, int vy) 
	{
		this.x = x;
		this.y = y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) 
	{
		frame.fillRect(x+50,y,50,50);
		frame.fillRect(x,y+50,150,50);
		frame.fillOval(x+5,y+90,50,50);
		frame.fillOval(x+95,y+90,50,50);
		
	}
	
	public void move() 
	{
		x+=vx;
		y+=vy;
	}
}
