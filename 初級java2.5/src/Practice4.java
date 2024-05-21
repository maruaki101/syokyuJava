
public class Practice4 extends MyFrame
{
	public void run() 
	{
		int x =30,count =0,y=0;
		while(true) 
		{
			fillRect(x,80,10,100-y);
			fillRect(x,200-y,10,100+y);
			x+=20;
			y+=10;
			count++;
			if(count == 10) 
			{
				break;
			}
		}
	}
}
