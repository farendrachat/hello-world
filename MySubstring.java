package StringImpl;

public class MySubstring {

	public static void main(String[] args) {
		String sample = "This is test <END>";
		String sub = sample.substring(0, sample.indexOf("<END>"));
		System.out.println(sub);
		
	}

}
