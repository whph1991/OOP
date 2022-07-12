package org.laddergame.view;

import org.laddergame.utils.UserVO;

import java.util.Scanner;

public class InputView {

    public InputView(){

    }
    public static UserVO show(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("참여할 사람 이름을 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        String names = scanner.next();

        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        String returns = scanner.next();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int height = scanner.nextInt();

        return new UserVO(names, returns, height);
    }

    public static String request(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("참여할 사람 이름을 입력하세요.");
        String names = scanner.next();

        return names;
    }
}