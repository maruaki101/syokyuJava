
public class RectIf extends MyFrame 
{
	public void run() 
	{
		int x = 30;
		int i;
		setColor(0,128,0);
		
		for(i=0;i<9;i++) 
		{
			
			if(i==0) 
			{
				fillRect(x,60,10,100);
			}
			/*if(i==4 || i==7) 
			{
				fillRect(x,100,10,100);
			}*/
			/*if(i>=4 && i<=7) 
			{
				fillRect(x,100,10,100);
			}*/
			else if(i == 8)
			{
				fillRect(x,100,10,100);
			}
			else
			{
				fillRect(x,80,10,100);
			}
					
			x+=20;
		}
	}
}
