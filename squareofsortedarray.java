//leetcode977
import java.util.Arrays;
class squareofsortedarray{
  public static void main(String[] args){
int[] nums={-4,-5,-2,-1,0,8,5,3};
int n=nums.length;
int [] result=new int[n];
int left=0;
int right=n-1;
int pos=n-1;
while(left<=right){
int leftSquare=nums[left] *  nums[left];
int rightSquare=nums[right] *nums[right];

if (leftSquare>rightSquare)
{
  result[pos]=leftSquare;
  left++;

}
else{
  result[pos]=rightSquare;
  right--;
}

pos--;
}
Arrays.sort(result);

System.out.println(Arrays.toString(result));
  }

}