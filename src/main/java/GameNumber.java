public class GameNumber {
    public String of(int i) {
        StringBuilder sb=new StringBuilder();
        if (isDividedBy(i, 3)) {
            sb.append("Fizz");
        }
        if (isDividedBy(i, 5)) {
            sb.append("Buzz");
        }
        if(sb.length()==0){
            return String.valueOf(i);
        }
        return sb.toString();

    }

    private boolean isDividedBy(int i, int number) {
        return i % number == 0;
    }
}
