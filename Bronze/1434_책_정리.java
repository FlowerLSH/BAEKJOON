import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
	    int[] numbers = new int[2];
	    
	    for(int i = 0; i<2;i++) {
	    	numbers[i] = in.nextInt();
	    }
	    
	    int[] boxes = new int[numbers[0]];
	    int[] books = new int[numbers[1]];
	    
	    for(int i = 0;i<numbers[0];i++) {
	    	boxes[i] = in.nextInt();
	    }
	    for(int i = 0;i<numbers[1];i++) {
	    	books[i] = in.nextInt();
	    }
	    
	    int result = 0;
	    int box_number = 0;
	    for(int i = 0;i<numbers[1];i++) {
	    	if(boxes[box_number] >= books[i]) {
	    		boxes[box_number] -= books[i];
	    	}
	    	else {
	    		result += boxes[box_number];
	    		box_number++;
	    		i--;
	    	}
	    }
	    result += boxes[box_number];
	    if(box_number != numbers[0] - 1) {
	    	for(int i = box_number;i<numbers[0];i++) {
	    		result += boxes[i];
	    	}
	    }
	    System.out.println(result);*/
		
		Scanner in = new Scanner(System.in);
	    int[] numbers = new int[2];
	    
	    for(int i = 0; i<2;i++) {
	    	numbers[i] = in.nextInt();
	    }
	    
	    int box = 0;
	    int book = 0;
	    
	    for(int i = 0;i<numbers[0];i++) {
	    	box += in.nextInt();
	    }
	    for(int i = 0;i<numbers[1];i++) {
	    	book += in.nextInt();
	    }
	    
	    System.out.println(box - book);
	}

}
