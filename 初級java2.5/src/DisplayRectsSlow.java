
public class DisplayRectsSlow extends MyFrame
{
	public void run() 
	{
		setColor(0,128,0);
		int x = 30;
		while (true) 
		{
			fillRect(x,80,10,100);
			x+=5;
			sleep(0.01);
		}
	}
}
