package study.lang.variable;

public class Test03 {
  public static void main(String[] args) {
    //    String[][] sub = new String[][] {
    //      new String[] {"등록", "목록"},
    //      new String[] {"등록", "목록"},
    //      new String[] {"등록", "목록"},
    //      new String[] {"등록", "목록"},
    //    };

    int[][] arr = new int[3][];
    arr[0] = new int[] {11, 12};
    arr[1] = new int[] {21, 22, 23};
    arr[2] = new int[] {31, 32, 33, 34};


    for (int i =0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        if((j+1) != arr[i].length) {
          System.out.print(arr[i][j] + ", ");
        }else {
          System.out.print(arr[i][j]);
        }
      }
      System.out.println();
    }



    int[][] arr2 = new int[3][4];
    arr2[0] = new int[] {11, 12};
    arr2[1] = new int[] {21, 22, 23};
    arr2[2] = new int[] {31, 32, 33, 34};


    for (int i =0; i < arr2.length; i++) {
      for(int j = 0; j < arr2[i].length; j++) {
        if((j+1) != arr2[i].length) {
          System.out.print(arr2[i][j] + ", ");
        }else {
          System.out.print(arr2[i][j]);
        }
      }
      System.out.println();
    }


  }

}


