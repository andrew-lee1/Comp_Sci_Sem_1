import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public int getMode(){
		int c = 1;
		while(c<array.length){
			if(array[c] == array[c+1]){
			System.out.println(array[c]);
			}
			c++;
		}
		return;
	}
	public int getMedian(){
		int count = 1;
		while(true){
			if(array[count]==array.length/2){
				System.out.println(array[count]);
			}
			c++;
			array.length--;
		}
	return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
		int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		int mode1 = getMode(arr1);		//The value of mode1 is 5.
		int mode2 = getMode(arr2);		//The value of mode2 is 7
		int mode3 = getMode(arr3);		// The value of mode3 is -1.
	
		int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int [ ] arr5 = {1, 2, 3, 4, 5, 6};
		int median1 = getMedian(arr4);  	//The value of median1 is 4.
		int median2 = getMedian(arr5);	//The value of median2 is 3.
	}



		
	}
}
