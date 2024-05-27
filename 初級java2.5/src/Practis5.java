
public class Practis5 extends MyFrame {
	public void run() 
	{
		int y =100,
				x = 30,count = 0,yp;
		yp=y;
		while(true) {
			while(x<=170)
			{
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=10;
				sleep(0.1);
			}
			while(y<=yp+100)
			{
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y+=10;
				sleep(0.1);
			}
			yp=y;
			while(x>=30)
			{
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=10;
				sleep(0.1);
			}
			while(y<=yp+100)
			{
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y+=10;
				sleep(0.1);
			}
			yp =y;
			count +=1;
			if(count == 3) 
			{
				break;
			
			}
		}
		
	}

}

