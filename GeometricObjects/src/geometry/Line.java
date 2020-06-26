package geometry;

public class Line {
	// properties
	  public int startX;
	  public int endX;
	  public int startY;
	  public int endY;
    // constructor
 public Line(int startX,int startY,int endX,int endY) {
	 if(startX != endX) {
	  this.startX = startX;
	  this.endX   = endX;
	 } else {
		 System.err.println("Worning, The coordonate are at the same dote!!\n");
	 }
	 if(startY != endY) {
	  this.startY = startY;
	  this.endY   = endY;
	 } else {
		 System.err.println("Worning, The coordonate are at the same dote!!\n");
	 }
	  }      
 public void printCoords() {
	
	 System.out.println( 
			 "[" + startX + ":" + startY + "]" +
	         "----->"                          + 
	         "[" + endX + ":" + endY + "]"
			 );
}
 public int length() {
	 return (int) Math.sqrt((endY - startY) * (endY - startY) + (endX - startX) * (endX - startX));
 }
}
