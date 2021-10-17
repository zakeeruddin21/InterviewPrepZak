import java.util.HashSet;
class Main {
  public static void main(String[] args) {
    int input[] = {4,8,2,6,7,5,9};
    int sum = 0;
    System.out.println(arrayContainsSum(input, sum));
  }

  private static boolean arrayContainsSum(int[] input, int sum) {
    if(input == null || input.length == 0) {
      return false;
    }
    HashSet<Integer> set = new HashSet<>();

    for(int i=0; i<input.length; i++) {
      if(set.contains(input[i])){
        return true;
      }
      set.add(sum - input[i]);
    }

    return false;
  }
}