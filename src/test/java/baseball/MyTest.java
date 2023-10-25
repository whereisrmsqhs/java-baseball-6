package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import camp.nextstep.edu.missionutils.Console;
import static baseball.Application.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyTest{

    @Test
    void random(){
        List<Integer> answers = generateRandomAnswer();
        System.out.print("생성된 3자릿수: ");
        for (Integer answer : answers) {
            System.out.print(answer);
        }
        System.out.println();
        Assertions.assertThat(answers.size()).isEqualTo(3);
    }

    @Test
    void formatTest(){
        Set<Integer> success = new LinkedHashSet<>();
        success.add(1);
        success.add(2);
        success.add(3);

        Set<Integer> fail1 = new LinkedHashSet<>();
        fail1.add(3);
        fail1.add(3);
        fail1.add(2);

        Set<Integer> fail2 = new LinkedHashSet<>();
        fail2.add(1);
        fail2.add(3);
        fail2.add(2);
        fail2.add(4);
        boolean result1 = formatCheck(success);
        boolean result2 = formatCheck(fail1);
        boolean result3 = formatCheck(fail2);

        Assertions.assertThat(result1).isEqualTo(true);
        Assertions.assertThat(result2).isEqualTo(false);
        Assertions.assertThat(result3).isEqualTo(false);
    }

//    @Test
//    void answerCompare(){
//        List<Integer> answer = new ArrayList<>(Arrays.asList(3, 6, 9));
//        Set<Integer> user = new LinkedHashSet<>();
//        user.add(9);
//        user.add(6);
//        user.add(3);
//
//        Assertions.assertThat(compareAnswer(answer, user)).isEqualTo(2);
//    }

    @Test
    void resultPrint(){
        List<Integer> answer = new ArrayList<>(Arrays.asList(3, 6, 9));
        Set<Integer> user = new LinkedHashSet<>();
        user.add(3);
        user.add(9);
        user.add(6);

        compareAnswer(answer, user);
        printResult();
    }
}
