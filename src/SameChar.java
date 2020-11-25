public class SameChar {
/* given two arrays create a method that let a user know whether these arrays contain any comment
   items.
 */



  // should return false.
  // char[] array3 = {'a', 'b', 'c', 'x'};
  // char[] array4 = {'z', 'y', 'x'};
  //  should return true.
  public static void main(String[] args) {
    char[] array1 = {'a', 'b', 'c', 'x'};
    char[] array2 = {'z', 'y', 'i'};
    System.out.println("The case for array1 is: " + findSameChar(array1, array2));
  }






  public static boolean findSameChar(char[] array1, char[] array2) {
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i] == array2[j]) {
            return true;
        }

      }
    }
    return false;
  }


}
