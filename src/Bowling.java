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
            score += rollIndex(index++);
            if(isStrike(index - 1)) score += rollIndex(index, index + 1);
            else {
                score += rollIndex(index++);
                if(isSpare(index - 2)) score += rollIndex(index);
            }
        }
        return score;
    }

    private boolean isStrike(int index) {
       return rolls[index] == 10;
    }

    private boolean isSpare(int index){
        return rolls[index] + rolls[index + 1] == 10;
    }

    private int rollIndex(int... indexes) {
        int sum = 0;
        for (int i = 0; i < indexes.length; i++) sum += rolls[indexes[i]];
        return sum;
    }
}
