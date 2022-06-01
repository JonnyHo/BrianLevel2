package Level2.object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class ClosedPocket extends ParentObject
{
	public ClosedPocket()
	 	{
	 		name = "Pocket2";
	 		try {
	 			image = ImageIO.read(getClass().getResourceAsStream("/objectsImport/openPocket.png"));
	 		}catch(IOException e) {
	 			e.printStackTrace();
	 		}
	 	}
	 
}
