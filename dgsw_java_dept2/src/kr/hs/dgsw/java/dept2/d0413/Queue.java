package kr.hs.dgsw.java.dept2.d0413;

public class Queue {
	public static final int SIZE = 10;
	
	private final String[] buffer;
	
	private int head;
	private int tail;
	private boolean full;
	
	public Queue() {
		this.buffer = new String[SIZE];
		this.head = 0;
		this.tail = 0;
		this.full = false;
	}
	
	public void add(String value) {
		if (isFull()) {
			throw new RuntimeException("Full");
		}
		
		this.buffer[this.head] = value;
		this.head = (this.head + 1) % SIZE;
		
		this.full = (this.head == this.tail);
	}
	
	public String poll() {
		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}
		
		String value = this.buffer[this.tail];
		this.tail = (this.tail + 1) % SIZE;
		
		this.full = false;
		
		return value;
	}
	
	public int getSize() {
		if (this.head == this.tail) {
			if (this.full) {
				return SIZE;
			} else {
				return 0;
			}
		} else if (this.head > this.tail) {
			return this.head - this.tail;
		} else {
			return SIZE - (this.tail - this.head);
		}
	}
	
	public boolean isFull() {
		return this.full;
	}
	
	public boolean isEmpty() {
		return ((!this.full) && (this.head == this.tail));
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

	}
}
