import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class disappearingNumers {
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] presentArr = new boolean[nums.length+1];
        for(int num: nums){
            presentArr[num] = true;
        }
        List<Integer> missingNumsCount = new ArrayList<Integer>();
        for(int index=1;index < presentArr.length;index++) {
            if(presentArr[index] == false) {
                missingNumsCount.add(index);
            }
        }

        return missingNumsCount;
    }
    

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Missing Number in Array : " + Arrays.toString(arr) + " is : " + findDisappearedNumbers(arr));
    }
}
