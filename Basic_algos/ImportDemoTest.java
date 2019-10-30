public class ImportDemoTest {
	public static void main(String [] args){
		ImportDemo id = new ImportDemo();
		String currentDate = id.getCurrentData();
		System.out.println(currentDate);

		Pythagorean py = new Pythagorean();
		
		System.out.println("Pythagorean "+py.calculateHypotenuse(3, 4));

		FizzBuzz fiz = new FizzBuzz();
		System.out.println(fiz.fizzBuzz(3));
		System.out.println(fiz.fizzBuzz(5));
		System.out.println(fiz.fizzBuzz(15));
		System.out.println(fiz.fizzBuzz(2));
	}
}
