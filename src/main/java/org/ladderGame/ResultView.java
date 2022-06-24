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

        playGame(ladder, position);
    }

    public void playGame(Ladder ladder, int position){
        ArrayList<Line> lines = ladder.getLines();
        int height = ladder.getHeight();
        String name = ladder.getNames().get(position);

        for (int row = 0; row < height; row++){
            position = move(position, lines.get(row).getPoints());
        }

        System.out.println(name + ":" + ladder.getOutputs().get(position));
    }

    public int move(int position, ArrayList<Boolean> points){
        // move left
        if (position > 0 && points.get(position-1)){
            return position - 1;
        }

        // move right
        if (points.size() > position && points.get(position)){
            return position + 1;
        }

        return position;
    }

    public void playAllGame(Ladder ladder){
        int countOfPerson = ladder.getNames().size();

        for (int position = 0; position < countOfPerson; position++){
            playGame(ladder, position);
        }
    }
}
