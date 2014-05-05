package java.awt;


public class Color {

	public static Color black = new Color(android.graphics.Color.BLACK);
	
	public static Color BLACK = new Color(android.graphics.Color.BLACK);
	
	public static Color blue = new Color(android.graphics.Color.BLUE);
	
	public static Color BLUE = new Color(android.graphics.Color.BLUE);
	
	public static Color cyan = new Color(android.graphics.Color.CYAN);
	
	public static Color CYAN = new Color(android.graphics.Color.CYAN);
	
	public static Color green = new Color(android.graphics.Color.GREEN);
	
	public static Color GREEN = new Color(android.graphics.Color.GREEN);
	
	public static Color red = new Color(android.graphics.Color.RED);
	
	public static Color RED = new Color(android.graphics.Color.RED);
	
	public static Color white = new Color(android.graphics.Color.WHITE);
	
	public static Color WHITE = new Color(android.graphics.Color.WHITE);
	
	public static Color yellow = new Color(android.graphics.Color.YELLOW);
	
	public static Color YELLOW = new Color(android.graphics.Color.YELLOW);
	
	private int colorNum;
	
	public Color(int colorNum) {
		this.colorNum = colorNum;
	}
	
	public Color(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public Color(float red2, float green2, float blue2, float alpha) {
		// TODO Auto-generated constructor stub
	}

	public Color(int strokeColor, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public static Color getColor() {
		android.graphics.Color.rgb(100, 100, 100);
		return null;
	}

}
