
public class Practis5 extends MyFrame {
	public void run() 
	{
		int y =100,
				x = 30,count = 0,yp;
		yp=y;
		while(true) {
			while(y<=200)
			{
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=10;
				y+=10;
				sleep(0.1);
			}
			while(y>=100)
			{
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=10;
				y-=10;
				sleep(0.1);
			}
			
			while(y<=200)
			{
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=10;
				y+=10;
				sleep(0.1);
			}
			while(y>=100)
			{
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=10;
				y-=10;
				sleep(0.1);
			}
		}
		
	}

}

