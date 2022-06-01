package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Clipboard extends ParentObject
{
	public Clipboard()
 	{
 		name = "Clipboard";
 		try {
 			image = ImageIO.read(getClass().getResourceAsStream("/objectsImport/clipboard.png"));
 		}catch(IOException e) {
 			e.printStackTrace();
 		}
 	}
}
