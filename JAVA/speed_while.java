public class speed_while{
    public static void main(String[] args){
        long startTime =  System.nanoTime();

        int score = 0;
        while (score > 0){
            score ++;
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}