
public class pal {
	public static void main(String[] args) {
int arr[] = {23,22,54,45,34,32,34,33,22};
for(int i=0;i<=arr.length;i++) {
	for(int j= i+1;j<=arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println("the duplicate element is"+arr[i]);
		}
	}
}
}
}