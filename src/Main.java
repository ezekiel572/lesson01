import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    for (int i = 1; i <= Integer.MAX_VALUE; i++) {

      String[] arr = Integer.toBinaryString(i).split("");
      System.out.print("new array " + Arrays.toString(arr));
      System.out.println("     current number: " + i + " : solution is : " + solution(i));
    }
  }


  public static int solution(int N) {
    List<Integer> gapsList = new ArrayList();
    int temp_sum = 0;
    String[] arrBinary = Integer.toBinaryString(N).split("");

    // System.out.println("arrayLength: " + arrBinary.length);

    for (int i = 0; i < arrBinary.length; i++) {
      // System.out.println("array position value: " + arrBinary[i]);
      //temp_sum += Integer.parseInt(arrBinary[i]);

      if (Integer.parseInt(arrBinary[i]) == 0) {
        temp_sum++;
        // System.out.println("temp_sum: " + temp_sum);
      } else {
        gapsList.add(temp_sum);
        // System.out.println("gapsList " + gapsList.toString());
        temp_sum = 0;
      }
      Collections.sort(gapsList);
      //System.out.println("sorted list: " + gapsList.toString());

    }
    if (gapsList.get(gapsList.size() - 1) > 0) {
      return gapsList.get(gapsList.size() - 1);
    } else {
      return 0;
    }

  }

}
