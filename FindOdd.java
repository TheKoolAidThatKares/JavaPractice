//https://www.codewars.com/kata/54da5a58ea159efa38000836/solutions/java/me/best_practice

public class FindOdd 
{
  public static int findIt(int[] a) 
  {
  int counter = 0;
  for(int i = 0; i < a.length; i++)
  {
    for(int j = 0; j < a.length; j++)
      if(a[i]==a[j])
        counter++;
    if(counter % 2 == 1)
    return a[i];
  }
    return 0;
  }
}
