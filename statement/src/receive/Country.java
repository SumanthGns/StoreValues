package receive;

public interface Country {
	
	int TOTAL_VALUE=5;
	public boolean name(String name);
	default boolean isExist(String name) {
		return false;
	}

}
