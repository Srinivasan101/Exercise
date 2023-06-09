package string.org;

public class Model_13 {

	public static void main(String[] args) {
		String html = "<p>This is a <strong>sample</strong> HTML string.</p>";
		String Text = html.replaceAll("\\<.*?\\>", "");
		System.out.println("HTML TEXT :"+ html);
		System.out.println("PURE TEXT :"+ Text);

	}

}
// important notes is  follow the html symbol and use the same form even in String