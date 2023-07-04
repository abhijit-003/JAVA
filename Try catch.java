//try and catch block
//all exceptions must be in order
//first arithmetic, last Exception
public class main {
	public static void main(String args[]) {
		/*
		try{

			//#1
			//int data=50/0;

			//#2
			int a[]=new int[2];
			a[19]=23;
			a[119]=23;
			a[1]=23;


		//#multi try block
		}catch(ArithmeticException e)
		{
		System.out.print(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.print("\nArray Exception is occured..");
		}
		catch(NumberFormatException e){
		System.out.print("\n numberformat exception is occured...");
		}
		catch(NullPointerException e){
		System.out.print("\n null pointer exception is occired....");
		}
		catch(Exception e){
		System.out.print("Exception...");
		}
		System.out.print("\n running...");
		}
		*/

		//nested try block

		try {
			try {
				int data = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.print(e);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.print(e);
			}
		} catch (Exception e) {
			System.out.print("\n other exception...");
		} finally {
			System.out.print("\n final block is always executed...");  //exception handaled,exception not handled in any case final block is executed....
		}
	}
}
