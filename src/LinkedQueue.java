 import java.util.ArrayList;
public class LinkedQueue implements Queue{
    
	private ArrayList list;
	
	public LinkedQueue(){
		list = new ArrayList();
	}
	
	public Object peekFront(){
		if (list.isEmpty())
			throw new IllegalStateException
				("Queue is empty");
		return list.get(0);
	}
	
	public Object dequeue(){
		if (list.isEmpty())
			throw new IllegalStateException
				("Queue is empty");
		return list.remove(0);
	}

    @Override
    public void enqueue(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
