abstract class BoxList{//this is abstract because you don't ever instantiate in main
  BoxNode empty = new BoxNode();
  protected BoxNode first;
  protected BoxNode last;
  protected int length;
  BoxList(){
    first = empty;
    last = empty;
    length = 0;
  }
  public void append(Box obj){
    BoxNode p = new BoxNode(obj);
    last.next = p;
    last = p;
    length++;
  }
  public BoxNode getFirst() {
	  return first;
  }
  public BoxNode getLast() {
	  return last;
  }
}