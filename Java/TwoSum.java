import java.util.Arrays;


public class TwoSum {
	public static void main ( String args[] ){
		int nums[] = {2,5,5,15};
		int target = 10;
		int[] out = new int[2];
        for ( int i =0 ; i< nums.length ; i++ ){
            for ( int j = i+1 ; j< nums.length ;j++){
                if ( (nums[i] + nums[j]) == target ){
                    out[0] = i;
                    out[1] = j;
                }
             }
        }
        System.out.println("Out : "+Arrays.toString(out));
	}
}
