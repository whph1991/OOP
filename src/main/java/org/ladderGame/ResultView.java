package org.ladderGame;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    private final int maxStringLength = 5;
    ResultView(){
    }

    public void printResult(Ladder ladder){
        printNames(ladder.getNames());
        printLadder(ladder.getLines(), ladder.getHeight());
        printOutputs(ladder.getOutputs());
    }

    public void printNames(List<String> names){
        for(String name: names){
            System.out.print(getStringSpace(name) + name + " ");
        }

        System.out.println();
    }

    public String getStringSpace(String str){
        return repeat(" ", this.maxStringLength - str.length());
    }

    public String repeat(String str, int repeat){
        return new String(new char[repeat]).replace("\0", str);
    }

    public void printLadder(ArrayList<Line> lines, int height){
        for (int row = 0; row < height; row++){
            printLine(lines.get(row).getPoints());
        }
    }

    public void printLine(ArrayList<Boolean> points){
        System.out.print("     |");

        for (Boolean point: points){
            System.out.print(checkPoint(point) + "|");
        }

        System.out.println();
    }

    public String checkPoint(Boolean point){
        return point ? "-----" : "     ";
    }

    public void printOutputs(List<String> outputs){
        for(String output: outputs){
            System.out.print(getStringSpace(output) + output + " ");
        }

        System.out.println();
    }

    public void printRequest(Ladder ladder, InputDto requestDto){
        int position = ladder.getNames().indexOf(requestDto.getNames());

        // all 인 경우
        if (position == -1){
            playAllGame(ladder);
            return;
        }

        System.out.println(ladder.playGame(position));
    }

    public void playAllGame(Ladder ladder){
        int countOfPerson = ladder.getNames().size();

        for (int position = 0; position < countOfPerson; position++){
            System.out.println(ladder.playGame(position));
        }
    }
}
