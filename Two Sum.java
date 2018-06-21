//https://www.codewars.com/kata/52c31f8e6605bcc646000082/solutions/java/me/best_practices

public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
    
    for(int i = 0; i < numbers.length; i++)
          for(int j = 0; j < numbers.length; j++)
              if(numbers[j] + numbers[i] == target)
                  return new int[] {j, i};
    return null;
    }
}
