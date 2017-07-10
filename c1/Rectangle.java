public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
	int width;
	int height;
	public Rectangle(int w, int h){
		width = w;

		height = h;
	}
	
	public int getArea(){
		int area = width*height;
		return area;
	}

}