package ex03.Lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;
        /**
         *  1. 6바퀴 돌면서 로또 번호를 추첨할 예정
         *  2. 첫번 째 바퀴에서는 그대로 입력
         *  3. 두번째 바퀴부터는 이전에 추첨한 모든 번호와 비교 (isSame)
         *  4. isSame == true (3번부터 다시 시작)
         *  5. isSame == faluse (추첨 번호 집어넣기 - 3번부터 다시 시작)
         */
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                num = r.nextInt(45) + 1;
                arr[i] = num;
                continue;
            }

            while (true) {
                isSame = false;
                num = r.nextInt(45) + 1;
                /**
                 *  i == 1 (0과 비교)
                 *  i == 2 (0, 1 비교)
                 *  i == 3 (0, 1, 2 비교)
                 */
                for (int j = i; j >= 0; j--) {
                    if (arr[j] == num) {
                        isSame = true;
                        break;
                    }
                }
                //  중복된 번호가 없을 때 값 추가
                if (!isSame) {
                    arr[i] = num;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
