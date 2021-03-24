import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int[] numbers = new int[5];
	    for(int i = 0; i<5;i++) {
	    	numbers[i] = in.nextInt();
	    }
	    int count_do = 0;
	    int count = 0;
	    int heart = numbers[1];
	    int check = 0;
	    if(numbers[4] == 0 && (numbers[2] - numbers[1]) / numbers[3] < numbers[0]) {
	    	System.out.println(-1);
	    }
	    
	    while(count_do < numbers[0]) {
	    	count++;
	    	if((heart + numbers[3]) <= numbers[2]) {
	    		count_do++;
	    		heart = heart + numbers[3];
	    	}
	    	else if(heart - numbers[4] < numbers[1]) {
	    		heart = numbers[1];
	    		if(heart + numbers[3] > numbers[2]) {
	    			System.out.println(-1);
	    			check = 1;
	    			break;
	    		}
	    	}
	    	else {
	    		heart = heart - numbers[4];
	    	}
	    }
	    if(check == 0) {
	    	System.out.println(count);
	    }

	}

}
