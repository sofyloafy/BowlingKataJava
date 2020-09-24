public class Bowling {
    int[] rolls = new int[21];
    int currentRollIndex = 0;

    public void roll(int roll) {
        rolls[currentRollIndex++] = roll;
    }

    public int score() {
        int score = 0;
        int index = 0;
        for (int i = 0; i < 10; i++){
//            System.out.println(index);
            score += rollIndex(index++);
            score += rollIndex(index++);
//            System.out.println(score);
        }
        return score;
    }

    private int rollIndex(int... indexes) {
        int sum = 0;
        for (int i = 0; i < indexes.length; i++) sum += rolls[indexes[i]];
        return sum;
    }
}
