package phone;
import java.util.*;
/*
 * MinQueue:
     enqueue
     dequeue
     findMin <-
   Example:
     q = MinQueue()
     q.enqueue(2)      
     q.enqueue(5)
     q.findMin() // should equal 2
     q.dequeue() // should return 2
     q.findMin() // should equal 5
 */
public class MinQueue {
	Queue<Integer> qu;
	Deque<Integer> min;
	public MinQueue(){
		this.qu=new LinkedList<Integer>();
		this.min=new LinkedList<Integer>();
	}
	public void offer(Integer num){
		this.qu.offer(num);
		while(!min.isEmpty()&&min.peekLast()>num){
			min.pollLast();
		}
		min.offerLast(num);
	}
	public Integer poll(){
		if(this.qu.isEmpty()){
			return null;
		}
		Integer res=qu.poll();
		if(min.peekFirst()==res){
			min.pollFirst();
		}
		return res;
	}
	public Integer findMin(){
		return this.min.peekFirst();
	}
}
