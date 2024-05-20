
public class Practice4 extends MyFrame
{
	public void run() 
	{
		int x =30,y=30,count =0;
		while(true) 
		{
			fillRect(x,y,10,100);
			x+=20;
			y+=20;
			count++;
			if(count == 10) 
			{
				break;
			}
		}
	}
}
