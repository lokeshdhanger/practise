import java.util.ArrayList;
import java.util.List;

abstract class Observer {
	protected Subject subject;
	public abstract void update();
}

class Subject {
	
	private List<Observer> observers= new ArrayList<>();
	private int state;
	
	public void add(Observer o) {
		observers.add(o);
	}
	
	public void execute() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		execute();
	}
	
}


class HexObserver extends Observer {
	
	public HexObserver(Subject subject) {
		this.subject=subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.println("hex: "+Integer.toHexString(subject.getState()));
	}
	
}

class OctObserver extends Observer {
	
	public OctObserver(Subject subject) {
		this.subject=subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.println("oct: "+Integer.toOctalString(subject.getState()));
	}
	
	
	
}

class BinObserver extends Observer {
	
	public BinObserver(Subject subject) {
		this.subject=subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.println("binary: "+Integer.toBinaryString(subject.getState()));		
	}
	
}


public class ObserverPatternDemo {
	
	public static void main(String[] args) {
		
		Subject subject = new Subject();
		new HexObserver(subject);
		new OctObserver(subject);
		new BinObserver(subject);
		
		int num = 10;
		subject.setState(num);
		
	}

}
