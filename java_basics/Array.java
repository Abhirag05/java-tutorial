public class Array {
    public static void main(String[] args) {
        //array of elements
        int num[]={1,2,3,4};//array with not defined number of elements 
        int num1[]=new int[4];//fixed number of elements
        //multi dimensional array
        int nums[][]=new int[2][2];
        nums[0][0]=1;
        nums[0][1]=2;
        nums[1][0]=3;
        nums[1][1]=4;

        for (int i=0;i<2;i++){
            System.out.println("first array:"+num[i]);
            num1[i]=num[i];
            System.out.println("2nd array:"+num1[i]);
            for(int j =0;j<2;j++){
                 System.out.println("mulit dimensional array:"+nums[i][j]);
            }
           
       }

    }
}
