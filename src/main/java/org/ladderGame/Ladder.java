package org.ladderGame;

public class Ladder {
    private final int RANGE = 9;
    private final int TRHESHOLD = 4;
    private int count;
    private int height;
    private StringBuilder result;

    Ladder(InputDto inputDto){
        this.count = inputDto.getCount();
        this.height = inputDto.getHeight();
        this.result = new StringBuilder(repeat("| ", this.count * this.height));
    }

    public void makeLadders(){
        int maxIndex = this.count * this.height * 2;

        for(int index = 1; index < maxIndex; index += 2){
            insertLadder(index);
            insertNewLine(index);
        }
    }

    public StringBuilder getResult(){
        return result;
    }

    public void insertLadder(int index){
        if (this.TRHESHOLD <= (int)(Math.random() * this.RANGE)){
            this.result.setCharAt(index, '-');
        }
    }

    public void insertNewLine(int index){
        if ((index + 1) % (this.count * 2) == 0) {
            this.result.setCharAt(index, '\n');
        }
    }

    public String repeat(String str, int repeat){
        return new String(new char[repeat]).replace("\0", str);
    }
}

