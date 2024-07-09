package org.koreait;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.koreait.App.*;
public class MotivationController {



    static void showDetail(int id) {
        Motivation found = foundMotivationId(id);
        if (found == null) {
            System.out.printf("%d번 명언은 존재하지 않습니다.\n", id);
        } else {
            System.out.println("번호 : " + found.getId());
            System.out.println("날짜 : " + found.getRegDate());
            System.out.println("작가 : " + found.getWriter());
            System.out.println("내용 : " + found.getBody());
        }
    }

    static void doModify(int id) {
        Motivation found = foundMotivationId(id);
        if (found == null) {
            System.out.printf("%d번 명언은 존재하지 않습니다.\n", id);
        } else {
            System.out.println("명언(기존) : " + found.getBody());
            System.out.println("작가(기존) : " + found.getWriter());
            System.out.print("명언 : ");
            String newBody = sc.nextLine().trim();
            System.out.print("작가 : ");
            String newWriter = sc.nextLine().trim();

            found.setBody(newBody);
            found.setWriter(newWriter);
        }
    }

    static void doDelete(int id) {
        Motivation found = foundMotivationId(id);
        if (found == null) {
            System.out.printf("%d번 명언은 존재하지 않습니다.\n", id);
        } else {
            motivations.remove(found);
            System.out.printf("%d번 명언이 삭제되었습니다.\n", id);
        }
    }

    private static Motivation foundMotivationId(int id) {
        for (Motivation motivation : motivations) {
            if (motivation.getId() == id) {
                return motivation;
            }
        }
        return null;
    }

    static void showList() {
        if (motivations.isEmpty()) {
            System.out.println("명언 없음.");
        } else {
            System.out.println("번호      /       작가          /       명언");
            System.out.println("=".repeat(45));
            for (int i = motivations.size() - 1; i >= 0; i--) {
                Motivation motivation = motivations.get(i);
                System.out.printf("%d       /       %s        /       %s\n", motivation.getId(), motivation.getWriter(), motivation.getBody());
            }
        }
    }

    static void doWrite() {
        System.out.print("명언 ) ");
        String body = sc.nextLine().trim();
        System.out.print("작가 ) ");
        String writer = sc.nextLine().trim();

        int id = lastId++;

        String dateTime = DateTimeFormatter.ofPattern("yy-MM-dd hh:mm:ss")
                .format(LocalDateTime.now());




        motivations.add(new Motivation(id, body, writer, dateTime));
        System.out.printf("%d번 명언이 등록되었습니다.\n", id);
    }
}
