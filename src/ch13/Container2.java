package ch13;

public class Container2<A, X> {

	private A a;
	private X x;
	
	public A getKey() {
		 return a;
		}
	
	public X getValue() {
		 return this.x;
		}
	
		public void set(A a, X x) {
		 this.a = a;
		 this.x = x;
		}
		
}
