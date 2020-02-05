
import java.util.Vector;

public interface iStack<T> 
{
/**
 * 
 * @param item
 */
   public void push(T item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   /**
    * 
    * @return
    */
   public T pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   /**
    * 
    * @return
    */
   public T peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   /**
    * 
    * @return
    */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   /**
    * 
    * @return
    */
   public int size();
   // post: returns the number of elements in the stack
/**
 * 
 * @param i
 */
    public void pop(int i);
/**
 * 
 * @param a
 */
    public void push(int a);
/**
 * 
 * @param a
 */
    public void pop(String a);
/**
 * 
 * @param remove
 */
    public void pop(boolean remove);
/**
 * 
 * @param Vector1
 * @return
 */
    public boolean empty(Vector Vector1);
 /**
  * 
  * @param index
  * @return
  */
	public T get(int index);
	/**
	 * 
	 * @param object
	 * @return
	 */
	public int getIndex(T object);
	/**
	 * 
	 * @param Vector1
	 * @return
	 */

    public int size(Vector Vector1);

}