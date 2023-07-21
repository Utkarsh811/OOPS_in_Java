package TcsDigital;

public class code12 {

  public static void main(String[] args) {
    int[] arr = { 3, 8, 14, 12, 10, 7, 4 };
    int sum = 0;
    int index = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i < arr.length - 1) {
        if (arr[i] < arr[i + 1]) {
          sum = sum + arr[i];
        } else {
          sum = sum + arr[i];
          index = i;
          break;
        }
      }
    }
    int mus = 0;
    for (int i = index; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        mus = mus + arr[i];
      }
    }
    mus = mus + arr[arr.length - 1];
    System.out.println(mus + "," + sum);

    System.out.println(mus * sum);
  }
}
