import javax.swing.*;
import java.awt.*;

public class BoxGUI extends JFrame{  
	private UnSortedBoxList unsorted1;
	private SortedBoxList sorted1;
	private JTextArea unsorted, sorted;//JTextArea class is in javax.swing
	public BoxGUI(String title, int height, int width, UnSortedBoxList unsorted1, SortedBoxList sorted1) {
		setTitle(title);
		setSize(height,width);
		this.sorted1 = sorted1;
		this.unsorted1 = unsorted1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when you press the x on the gui it automatically terminates the program, without this the program will keep running
		setLocationRelativeTo(null);//this jframe doesnt have a parent, this is setting its location to the whole window
		components();
		setVisible(true);
	}
	private void components() {
		setLayout(new GridLayout(1,2));//makes one row two columns 
		
		unsorted = new JTextArea();// creates a new jtextarea which is an object and extends from javax.swing
		unsorted.setBackground(Color.yellow);
		unsorted.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
		unsorted.setBorder(BorderFactory.createLineBorder(Color.black));
		BoxNode obj = unsorted1.getFirst();
		obj = obj.next;
		while(obj != unsorted1.getLast()) {
			unsorted.append(obj.data.toString() + "\n");
			obj = obj.next;
		}
		

		add(unsorted);//adds the text areas to the grid layout, add comes with the extension of JFrame
		sorted = new JTextArea();
		sorted.setBackground(Color.green);
		sorted.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
		sorted.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		obj = sorted1.getFirst();//don't need to redeclare it, this is the same obj as above but this time its referring to the other list
		obj = obj.next;
		while(obj != sorted1.getLast()) {
			sorted.append(obj.data.toString() + "\n");
			obj = obj.next;
		}
		add(sorted);
	}
	 
}

