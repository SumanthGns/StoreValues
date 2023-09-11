package INterface.String;

public class StringBufferRunner {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer(23);
		StringBuffer s = buffer.append(43.22);
		System.out.println(s);
		StringBuffer hi = s.append('S');
		System.out.println(hi);
		int rr = s.hashCode();
		System.out.println(rr);
	}
	
}
