
public class SortedBoxList extends BoxList{//this doesnt have to be abstract because u instantiate
  SortedBoxList(){
    super();
  }
  public void add(Box obj){//overrides boxlist's append method
      
      if(first.next == null){
        super.append(obj);
        return;//we dont want to continue on with function after appending 
      }
      BoxNode p = first.next;
      if(obj.volume() < p.data.volume()){//if the object is less then the first node, we have to stick it in front, lets say theres 720 in the first node, and u want to insert 400
    	  	BoxNode z = new BoxNode(obj);
    	  	z.next = p;//this rewrites p which is why we cant use p after
    	  	first.next = z;
    	  	length++;//wherever you dont use append u need to do length++
    	  	return;
      }
      while(p.next!=null){
    	  		
    	  		if(obj.volume() >= p.data.volume() && obj.volume() <= p.next.data.volume()){//will never hit null pointer error because of p.next.data.volume
    	  			BoxNode z = new BoxNode(obj);
    	  			z.next = p.next;
    	  			p.next = z;//if ur at 13,15 and u wanna insert a 14, your p is 13 p.next is 15 p.next.next should become 15 and then p.next just becomes 14 so ur inserting it in the middle
    	  			length++;
    	  			return;//if you put in the element you dont need to loop anymore
    	  		}//too add it in the middle
        
       p = p.next;//we only keep going to the next if the if statement hasn't been true which is why we need a break inside of it
  	}
     super.append(obj);//it never found any spot where the volume was in between two values, this only sticks things to the end
  }
}
