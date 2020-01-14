public class GameNumber {
    public String of(int i){
        if(isDividedBy(i,3) &&isDividedBy(i,5)){
            return "FizzBuzz";
        }
        if (isDividedBy(i,3)){
            return "Fizz";
        }
        if(isDividedBy(i,5)){
            return "Buzz";
        }
        return String.valueOf(i);

    }

    private boolean isDividedBy(int i,int number) {
        return i%number==0;
    }
}
