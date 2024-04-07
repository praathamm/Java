import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ReadMap {

	public static void main(String[] args) {
		try {
			String str = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\mapwalifile.ser";
			
			FileInputStream fis = new FileInputStream(str);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Map<Float,String > rmap = new HashMap<>();
			
			rmap =(Map<Float, String>) ois.readObject();
			
			Set<Entry<Float,String>> myset=rmap.entrySet();
			Iterator<Entry<Float,String>> i =myset.iterator();
			while(i.hasNext()) {
			Map.Entry<Float,String>	e=(Entry<Float, String>) i.next();
			System.out.println(e.getKey()+"==="+e.getValue());
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
