import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadList {

	public static void main(String[] args) {
		try {
			String str = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\nayifile.ser";
			List<Boolean> l = new ArrayList<>();
			FileInputStream fis = new FileInputStream(str);
			ObjectInputStream ois = new ObjectInputStream(fis);
			l = (List<Boolean>) ois.readObject();
			
			Iterator li = l.iterator();
			
			while (li.hasNext()) {
				System.out.println(li.next());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
