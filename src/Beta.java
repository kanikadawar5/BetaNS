import java.util.Arrays;

public class Beta {
    // compiler language -> code is compiled line by line -> 1. java class - > (compilation) - > binary code
    // 2. run code
    // 3. main function
    // JRE ->   & JVM ->
    public static void main(String[] args) {

        //Array? -> group of similar types of entities //list of cricket match scores, eg. match_one_score =98,match_two_score=107,
        // match_scores = [98, 107], match_scores = [109, "ninety eighth"] X
        String arr[] = new String[5];  //size = 5 -> indexes - > positions - > start from 0 //new int[5];->initialisation//int arr[] = new int[5];->declaration
        int arr2[] = {21,3,45,5};

        // 2000[4 bytes], 2004[4 bytes] //2 buildings -> Block B-234, 235
//        System.out.println(arr);    //only prints array
//
//        for (int i =0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }

//        for (int i =0;i < arr2.length;i++) {
//            System.out.print(arr2[i]+ " ");
//        }
//        System.out.println("\n");

        Arrays.sort(arr2);
//        for (int i = 0;i < arr2.length;i++) {
//            System.out.print(arr2[i]+ " ");
//        }

        // StudentId, Scores
        // S1, 23
        // S2, 34
        // S3, 65

        // [1,2] i=0  A[0]
        // [3,4] i=1
        // [4,5] i=2


        int A[][] = {{1,2}, {2,3}, {3,4}};  //A[0][1]
        int B[][] = {{2,3}, {3,4}, {5,6}};


        if (A.length == B.length && A[0].length == B[0].length) {   //match no. of rows and cols

            int sum[][] = new int[A.length][A[0].length];

            for (int i = 0; i < A.length; i++) {   //rows  0, 1
                for (int j = 0; j < A[i].length; j++) {  //columns   0, 1<2, 0
                    sum[i][j] = A[i][j] + B[i][j];      //{{3,5} {5,7}, {8,10}}
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println("");
            }

        }


    }
}
