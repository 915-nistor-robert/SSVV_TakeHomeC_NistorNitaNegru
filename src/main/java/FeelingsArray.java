public class FeelingsArray {
    private int[] feelings;

    public FeelingsArray(int[] feelings) {
        this.feelings = feelings;
    }

    public int findSadFeeling(int start) {
        for(int i=start; i<feelings.length; i++) {
            if(feelings[i] == -1)
                return i;
        }
        return -1;
    }

    public boolean checkNeighbours(int position) {
        return (feelings[position] == -1 && (position > 0 && feelings[position - 1] == 1) && (position >= feelings.length - 1 || feelings[position + 1] == 1));
    }

    public void insertHappyFeelings(int position) {
        if (feelings[position] != -1)
            return;

        int[] newFeelings = new int[feelings.length + 2];
        System.arraycopy(feelings, 0, newFeelings, 0, position);
        newFeelings[position] = 1;
        newFeelings[position + 1] = -1;
        newFeelings[position + 2] = 1;
        System.arraycopy(feelings, position + 1, newFeelings, position + 3, feelings.length - position - 1);
        feelings = newFeelings;
    }

    public void beHappy() {
        int i = 0;
        while(i < feelings.length) {
            i = findSadFeeling(i);
            if(i == -1)
                break;
            if(!checkNeighbours(i)) {
                insertHappyFeelings(i);
                i += 2;
            } else {
                i++;
            }
        }
    }
    public int[] getFeelings() {
        return feelings;
    }
}