package ex03.test;

public class BinaryTest01 {
    // 이진 검색 => 반드시 정렬이 돼 있어야 한다.
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    /**
     *  targer = t
     *
     *  [0] ~ [8]
     *  mid = arr.length/2 = 4 -> arr[4] -> 5
     *
     *  if (t == 5) -> mid 위치에 타깃이 있다
     *
     *  if (t > 5) 참
     *  [5] ~ [8]
     *  mid = 7 = arr[7] -> 8값
     *  if(t==8) -> mid 위치에 타겟이 있다.
     *
     *  if (t > 5) 거짓
     *  [1] ~ [4]
     *  mid = 2 = arr[2] -> 3값
     *  if(t < 3) 참 or 거짓 반복
     */

}
