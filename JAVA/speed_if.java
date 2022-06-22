public class speed_if{
    public static void main(String[] args){
        long startTime =  System.nanoTime();

        int score = 0;
        if (score > 0){
            score ++;
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}