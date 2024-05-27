
public class Animation extends MyFrame
{
	public void run()
	{
		int x =30;
		while(true)
		{
			clear();
			setColor(0,128,0);
			fillRect(x,80,10,100);
			if(x>200) {
				break;
			}
			x+=20;
			sleep(0.1);
		}
	}
}
