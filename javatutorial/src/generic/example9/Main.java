package generic.example9;

public class Main<T>{

	T t;
	
	public Main(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public  <T extends InterA & InterB, Human, Animal> void  printType(){
		System.out.println(this.t.getClass());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main<Human> human= new Main<Human>(new Human());
		Main<Animal> employer= new Main<Animal>(new Animal());
		Main<ClassExtendA> subclass= new Main<ClassExtendA>(new ClassExtendA());
		Main<Woman> woman= new Main<Woman>(new Woman());
		human.printType();
		employer.printType();
		subclass.printType();
		woman.printType();
	}

}
