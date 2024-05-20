
public class Practice4 extends MyFrame
{
	public void run() 
	{
		int x =30,count =0;
		while(true) 
		{
			fillRect(x,30,10,100);
			x+=20;
			setColor(x,x,x);
			count++;
			if(count == 10) 
			{
				break;
			}
		}
	}
}
