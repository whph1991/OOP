package org.ladderGame;

import java.util.Scanner;

public class InputView {

    InputView(){

    }
    public InputDto show(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("참여할 사람 이름을 입력하세요");
        String names = scanner.next();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int height = scanner.nextInt();

        return new InputDto(names, height);
    }
}
