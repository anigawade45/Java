
public class Aecending{
    public static void main(String[] args) {
        int numbers[] = {10,23,67,89,90,4,6,6,45,88,100};

        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }

        System.out.print("Ascending order: ");

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
}