package org.koreait;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.koreait.MotivationController.*;

public class App {
    static Scanner sc;
    static int lastId;
    static List<Motivation> motivations;

    public App() {
        sc = new Scanner(System.in);
        lastId = 1;
        motivations = new ArrayList<>();
    }

    public static void run() {
        System.out.println("== 명언 앱 실행 ==");

        while (true) {
            System.out.print("명령어 ) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                System.out.println("== 명언 앱 종료 ==");
                return;
            } else if (cmd.isEmpty()) System.out.println("명령어 똑바로 입력해.");


            String[] split = cmd.split("=");
            String id = split.length > 1 ? split[1] : "";

            switch (cmd) {
                case "등록":
                    doWrite();
                    break;
                case "목록":
                    showList();
                    break;

                default:
                    if (cmd.startsWith("삭제")) {
                        try {
                            doDelete(Integer.parseInt(id));
                        } catch (NumberFormatException e) {
                            System.out.println("번호 입력 요망.");
                        }
                    } else if (cmd.startsWith("수정")) {
                        try {
                            doModify(Integer.parseInt(id));
                        } catch (NumberFormatException e) {
                            System.out.println("번호 입력 요망.");
                        }
                    } else if (cmd.startsWith("상세보기")) {
                        try {
                            showDetail(Integer.parseInt(id));
                        } catch (NumberFormatException e) {
                            System.out.println("번호 입력 요망.");
                        }
                    } else System.out.println("명령어 오류");
                    break;
            }
        }
    }
}
