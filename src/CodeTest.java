import java.util.Arrays;
import java.util.HashSet;

public class CodeTest {

    //Question 1

    static void arraySort(int[] i) {
        int a, b, temp;

        for (a = 0; a < i.length - 1; a++) {
            for (b = a + 1; b < i.length; b++) {
                if (i[b] <= i[a]) {
                    temp = i[b];
                    i[b] = i[a];
                    i[a] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(i));


    }

    //Question 2
    static void strings(String stg) {

        for (int i = 0; i < stg.length() - 1; i++) {
            for (int j = i + 1; j < stg.length(); j++) {
                System.out.println(stg.charAt(i) + "" + stg.substring(j));
            }

        }


    }

    //Question3
    static void findDups(String[][] dupArray) {
        HashSet<String> notDup = new HashSet<>();
        HashSet<String> isDup = new HashSet<>();
        System.out.print("Duplicates: ");

        for(int i=0;i<dupArray.length;i++)
        {
            for(int j=0;j<dupArray[0].length;j++)
            {
                if(notDup.add(dupArray[i][j]))
                    continue;
                else {
                    if(isDup.add(dupArray[i][j]))
                        System.out.print(dupArray[i][j]+" ");
                }
            }
        }
    }


    public static void main(String args[]) {

        //prob 1
        int[] arr = {2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};
        arraySort(arr);

        //prob 2
        strings("frog");

        String [][] stgArr = {{"a","b","c"},{"d","e","f"},{"g","a","b"}};

        findDups(stgArr);






    }


}




