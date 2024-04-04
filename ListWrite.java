import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ListWrite {

	public static void main(String[] args) {
		List<Boolean> mylist = new ArrayList<>();
		mylist.add(true);
		mylist.add(false);
		mylist.add(true);
		mylist.add(false);
		mylist.add(true);
		mylist.add(false);

		try {
			String  str ="C:\\Users\\Lenovo\\OneDrive\\Desktop\\nayifile.ser";
			
			FileOutputStream fos = new FileOutputStream(str);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(mylist);
			System.out.println("done writing");
		} 
		
		
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
