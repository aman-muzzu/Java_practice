package example;

		abstract class parts{   // abstract is mandatory
			String n;
			parts(String n){
				this.n=n;
			}
			
		abstract void function();    // creating function
			
			void f() {
			System.out.println(n);
			}
		}
		class breaks extends parts{
			breaks(String n){
				super (n);
			}
			void function() {
				System.out.println("car should halt");
			}
		}
		class accelarator extends parts{
			
			accelarator(String n){
				super (n);
			}
			void function() {
				System.out.println("car should accelerate");
			}
		}
		class gear extends parts{
			
			int ge;
			gear(String n, int ge){
				super (n);
				this.ge =ge;
			}
			void function() {
				System.out.println("car gear should should change "+ ge);
			}
		}
		


		
public class AbstractCar {

	public static void main(String[] args) {
		breaks b =new breaks("breaks");
		b.function();
		b.f();
		accelarator a = new accelarator( "accelerator");
		a.function();
		a.f();
		gear g= new gear("gear",5);
		g.function();
		g.f();
		
	}

}
