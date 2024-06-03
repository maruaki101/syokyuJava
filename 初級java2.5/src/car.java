
public class car {
	int x,y,vx,vy;
	public car(int x, int y,int vx) 
	{
		this.x = x;
		this.y = y;
		this.vx=vx;
	}
	public void draw(MyFrame frame) 
	{
		frame.fillRect(x+50,y,50,30);
		frame.fillRect(x,y+20,150,50);
		frame.fillOval(x+5,y+65,50,50);
		frame.fillOval(x+95,y+65,50,50);
		
	}
	
	public void move(int j) 
	{
		x+=j;
	}

}
