package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OpenPocket extends ParentObject 
{
	public OpenPocket()
	{
		name = "Pocket1";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objectsImport/closedPocket.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
