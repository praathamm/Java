import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class WriteMap {

	public static void main(String[] args) {
		Map<Float, String> mp = new HashMap<>();
		mp.put(12.24f, "first");
		mp.put(88.24f, "second");
		mp.put(55.24f, "third");
		String str = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\mapwalifile.ser";
		try {
			FileOutputStream fos = new FileOutputStream(str);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(str);
			System.out.println("done writing");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
