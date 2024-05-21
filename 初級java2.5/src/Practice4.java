
public class Practice4 extends MyFrame
{
	public void run() 
	{
		int x =30,count =0,y=30, g = 30;
		while(true) 
		{
			fillRect(y,y,x,x);
			x+=20;
			y += g;
			g +=20;
			count++;
			if(count == 5) 
			{
				break;
			}
		}
	}
}
