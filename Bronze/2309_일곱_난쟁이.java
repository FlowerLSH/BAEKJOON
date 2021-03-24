import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int[] numbers = new int[9];
	    int[] result = new int[9];
	    int sum = 0;
	    int check = 0;
	    for(int i = 0; i<9;i++) {
	    	numbers[i] = in.nextInt();
	    	sum += numbers[i];
	    }
	    sum -= 100;
	    
	    for(int i = 0; i<8;i++) {
	    	for(int j = i+1; j < 9; j++) {
	    		if(numbers[i] + numbers[j] == sum) {
	    			for(int k = 0; k < 9; k++) {
	    				if(k != i && k != j) {
	    					result[k] = numbers[k];
	    				}
	    			}
	    			check = 1;
	    			break;
	    		}
	    	}
	    	if(check == 1) {
	    		break;
	    	}
	    }
	    
	    Arrays.sort(result);
	    for(int i = 2; i < result.length;i++) {
	    	System.out.println(result[i]);
	    }
	    
	}

}
