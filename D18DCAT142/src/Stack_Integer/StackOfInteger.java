package Stack_Integer;

public class StackOfInteger {
	private int[] elements;
	private int size;
	private int maxSize;
	private int top; 
	
	public StackOfInteger() {
		maxSize = 16;
		elements = new int[16];
		top = -1;
	}
	public StackOfInteger(int capacity) {
        this.maxSize = capacity;
        elements = new int[maxSize];
        top = -1;
    }
	public boolean isEmpty(){
        return (elements.length > 0)?false:true;
    } 
    public boolean isFull(){
        return (elements.length == maxSize-1)?true:false;
    }
    public void push(int j){
        elements[++top] = j;
    }
    public int pop(){
        return elements[top--];
    }
    
    public int peak(){
        return elements[top];
    }

    public int getSize() {
        return elements.length;
    }
    public int getMaxSize() {
        return maxSize;
    }
}
