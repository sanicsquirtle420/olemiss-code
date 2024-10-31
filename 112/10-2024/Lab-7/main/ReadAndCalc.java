import java.io.IOException;
import java.io.File ;
import java.util.Scanner ;

public class ReadAndCalc implements ReadFile {
    private int count = 0 ;
    private int notCount = 0 ;
    private int data[] = new int[25] ;

    public void printData() {
        System.out.println("--- Count: " + count + " ---") ;
        for(int i = 0 ; i < count ; i++) {
            System.out.printf("%d\t" , data[i]) ;
        }
    }

    @Override
    public int[] populateArray(String fileName) throws IOException {
        File file = new File(fileName) ;
        Scanner fileData = new Scanner(file) ;

        while(fileData.hasNextLine()) {
            String token = fileData.nextLine() ;
            data[count] = Integer.parseInt(token);
            count++ ;
        }

        fileData.close() ;

        int notData[] = new int[count] ;
        Scanner scan = new Scanner(file) ;
        while(scan.hasNextLine()) {
            String aToken = scan.nextLine() ;
            notData[notCount] = Integer.parseInt(aToken) ;
            notCount++ ;
        }

        scan.close() ;

        return notData ;
    }

    @Override
    public void calcValues(int[] nums) {
        int index = 0 ;
        Scanner keyboard = new Scanner(System.in) ;
        System.out.print("How many numbers have to be calculated at a time? ") ;
        int response = keyboard.nextInt() ;
        int sum = 0 ;

        for (int i = index ; i < nums.length; i++) {
            // d.i
            if (index < response) {
                System.out.println(nums[i]);
            sum += nums[i];
            index++;
            }
                // d.ii
            else{
                if (sum == nums[i]) {
                    System.out.printf("The sum is %d and matches the expected value %d\n", sum, nums[i]);
                } else {
                    System.out.printf("The sum is %d and DOES NOT match the expected value %d\n", sum, nums[i]);
                }

                sum = 0 ;
                index = 0 ;
            }
        }
    }
}
