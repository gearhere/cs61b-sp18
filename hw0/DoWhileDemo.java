public class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            if (count == 3){
                count++;
                continue;
            }
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}