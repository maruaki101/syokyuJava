
public class DisplayFaceObject extends MyFrame
{
	public void run() 
	{
		Face face1 = new Face();;
		face1.x = 100;
		face1.y = 50;
		face1.drow(this);
		
		Face face2 = new Face();;
		face1.x = 150;
		face1.y = 100;
		face1.drow(this);
	}
}
