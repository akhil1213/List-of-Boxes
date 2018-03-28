public class Box{
  int length;
  int width;
  int height;
  public Box(){
    length = 1; 
    width = 1;
    height = 1;
  }
  public Box(int length, int width, int height){
    if(length < 1 || width < 1 || height < 1) throw new IllegalArgumentException("Length, width, and height must all be above 1");
    this.length = length;
    this.width = width;
    this.height = height;
  }

public void setLength(int length){
	if(length < 1) throw new IllegalArgumentException("length must be greater then one");
    this.length = length;
  }
  public void setWidth(int width){
	  if(width < 1) throw new IllegalArgumentException("Width must be greater then one");
    this.width = width;
  }
  public void setHeight(int height){
	  if(height < 1) throw new IllegalArgumentException("Height must be greater then one");
    this.height = height;
  }
  public int getLength(int length){
    return length;
  }
  public int getWidth(int width){
    return width;
  }
  public int getHeight(int height){
    return height;
  }
  public double volume(){
    return length*width*height;
  }
  public String toString(){
    double x = volume();
    return "L:" + length + " W:" + width + " H:" + height + " (V: " + x;
  }
  public boolean equals(Box obj){ 
      if(obj.length == length && obj.width == width && obj.height == height){
        return true;
      }
      return false;
  }
}