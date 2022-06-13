package org.ladderGame;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    private final int maxNameLength = 5;
    ResultView(){
    }

    public void printResult(Ladder ladder){
        printNames(ladder.getNames());
        printLadder(ladder.getLines(), ladder.getHeight());
    }

    public void printNames(List<String> names){
        for(String name: names){
            System.out.print(getNameSpace(name) + name + " ");
        }

        System.out.println();
    }

    public String getNameSpace(String name){
        return repeat(" ", this.maxNameLength - name.length());
    }

    public String repeat(String str, int repeat){
        return new String(new char[repeat]).replace("\0", str);
    }

    public void printLadder(ArrayList<Line> lines, int height){
        for (int row = 0; row < height; row++){
            lines.get(row).printLine();
        }
    }
}
