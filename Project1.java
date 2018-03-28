import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Project1 {
	public static void main(String[] args) {
		TextFileInput file = new TextFileInput("BoxInfo.txt");
	    BoxNode j = new BoxNode();
	    UnSortedBoxList unsorted = new UnSortedBoxList();
	    SortedBoxList sorted = new SortedBoxList();
	    String line = file.readLine();
	    while(line!= null){
	    	StringTokenizer copyLine = new StringTokenizer(line, ",");//Separates each line whenever it sees a cama which is its delimiter,and that becomes the first token, there would be three tokens.
	      
	      int length = 0, width = 0, height = 0;

	          length = Integer.parseInt(copyLine.nextToken());//length is the first token
	          width = Integer.parseInt(copyLine.nextToken());//width is the second token
	          height = Integer.parseInt(copyLine.nextToken());//height is the third token
	      
	      Box obj = new Box(length,width,height);//Create an object of the Box class calling the Box constructor sending in parameters of the length, width, and height from the file.
	      //j.next = new BoxNode(obj);
	      unsorted.add(obj);
	      sorted.add(obj);
	      //j = j.next;//move on to the nextnode
	      
	      line = file.readLine();//Makes sure that the file keeps reading to the nextline, without this, there would be an arrayindexoutofbounds exception and this would be an infinite loop because it would keep rereading the first line.
	    }
	    BoxGUI gui = new BoxGUI("Boxes", 600,600,unsorted, sorted);
	  }
}
