package Testing;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print the text 5 times, This is Java
		
		/*int i;
		for (i=1; i<=5; i++) {
			System.out.println("This is Java");
		}*/
		
		//Display a number from 1 to 5
	/*int i;
	for (i=1; i<=5; i++) {
		
		System.out.println(i);
		
	}
		
		//Sum of first 10numbers
		
	int i;
	int sum=0 ;
	for (i=1;i<=10;i++) {
		sum = sum + i;
		
		
	}
		
	System.out.println(sum);
		
	}*/
		int i,j;
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for (i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			System.out.print(arr[i] + " ");
			System.out.print(arr[i] + " ");
		}
		
		for(j=arr.length-1;j>=0;j--) {
			
			System.out.println(arr[j] + " "+ "\n");
			System.out.println(arr[j] + " ");
			//gfgfhfghghghrintln(arr[j] + " ");
		}
			}
}
