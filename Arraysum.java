public class Arraysum {
    public static void main(String[]args){
        int []marks={80,90,85,70};
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println(sum);
    }
}
