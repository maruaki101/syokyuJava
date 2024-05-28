
public class Face extends MyFrame
{
	int x,y;
	public void drow(MyFrame frame) 
	{
		fillOval(x,y,50,100);
		fillOval(x+100,y,50,100);
		fillRect(x,y+160,150,10);
	}
}
