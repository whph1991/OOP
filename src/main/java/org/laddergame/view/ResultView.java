package org.laddergame.view;

import org.laddergame.utils.Ladder;
import org.laddergame.utils.Line;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    private static final int MAX_STRING_LENGTH = 5;
    private static final String LINE_VERTICAL = "|";
    private static final String LINE_HORIZON = "-----";
    private static final String LINE_SPACE = "     ";
    public ResultView(){
    }

    public static void printLadder(Ladder ladder){
        printNames(ladder.getNames());
        printLines(ladder.getLines(), ladder.getHeight());
        printOutputs(ladder.getOutputs());
    }

    public static void printNames(List<String> names){
        for(String name: names){
            System.out.print(getStringSpace(name) + name + " ");
        }

        System.out.println();
    }

    public static String getStringSpace(String str){
        return repeat(" ", MAX_STRING_LENGTH - str.length());
    }

    public static String repeat(String str, int repeat){
        return new String(new char[repeat]).replace("\0", str);
    }

    public static void printLines(ArrayList<Line> lines, int height){
        for (int row = 0; row < height; row++){
            printLine(lines.get(row).getPoints());
        }
    }

    public static void printLine(ArrayList<Boolean> points){
        System.out.print(LINE_SPACE + LINE_VERTICAL);

        for (Boolean point: points){
            System.out.print(pointToLine(point) + LINE_VERTICAL);
        }

        System.out.println();
    }

    public static String pointToLine(Boolean point){
        return point ? LINE_HORIZON : LINE_SPACE;
    }

    public static void printOutputs(List<String> outputs){
        for(String output: outputs){
            System.out.print(getStringSpace(output) + output + " ");
        }

        System.out.println();
    }

    public static void printRequest(String requestName, Ladder ladder, ArrayList<Integer> positions){
        if (requestName.equals("all")){
            printRequestAllOutput(ladder, positions);
            return;
        }

        int nameIndex = ladder.getNames().indexOf(requestName);
        printRequestOutput(requestName, ladder.getOutputs(), positions.indexOf(nameIndex));
    }

    public static void printRequestOutput(String requestName, List<String> outputs, int outputIndex){
        System.out.println(requestName + ":" + outputs.get(outputIndex));
    }

    public static void printRequestAllOutput(Ladder ladder, ArrayList<Integer> positions){
        int countOfPerson = ladder.getNames().size();

        for (int nameIndex = 0; nameIndex < countOfPerson; nameIndex++) {
            printRequestOutput(ladder.getNames().get(nameIndex), ladder.getOutputs(), positions.indexOf(nameIndex));
        }
    }
}
