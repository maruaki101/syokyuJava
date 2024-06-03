
public class Practice7 extends MyFrame
{
	public void run() 
	{
		car [] cars = new car[5];
		
		cars[0]= new car(50,50,10);
		
		cars[1]= new car(50,160,10);
		
		cars[2]= new car(50,270,10);
		
		cars[3]= new car(50,380,10);
		
		cars[4]= new car(50,490,10);
		
		for(int i=1;i<30;i++) 
		{
			clear();
			for(int j=0;j<cars.length;j++) {
				cars[j].draw(this);
				cars[j].move(j);
			}
			
			sleep(0.1);

		}
	}
}
