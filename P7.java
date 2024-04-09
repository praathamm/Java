package que_7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P7 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		//add 10 entries
		 Student s1 = new Student("123456", "Jayesh");
	        Student s2 = new Student("234567", "Khairnar");
	        Student s3 = new Student("345678", "student3");
	        Student s4 = new Student("456789", "jk");
	        Student s5 = new Student("567890", "David");
	        Student s6 = new Student("678901", "Lisa");
	        Student s7 = new Student("789012", "Michael");
	        Student s8 = new Student("890123", "Sophia");
	        Student s9 = new Student("901234", "Kevin");
	        Student s10 = new Student("112233", "Emma");

	        map.put(s1.getPrn(), s1.getName());
	        map.put(s2.getPrn(), s2.getName());
	        map.put(s3.getPrn(), s3.getName());
	        map.put(s4.getPrn(), s4.getName());
	        map.put(s5.getPrn(), s5.getName());
	        map.put(s6.getPrn(), s6.getName());
	        map.put(s7.getPrn(), s7.getName());
	        map.put(s8.getPrn(), s8.getName());
	        map.put(s9.getPrn(), s9.getName());
	        map.put(s10.getPrn(), s10.getName());
		
		Set<Entry<String, String>> set =map.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry<String, String> mapEntry = (Entry<String, String>) i.next();
			System.out.println("PRN: "+ mapEntry.getKey()+" Name: "+mapEntry.getValue());
		}
		
	}

}
