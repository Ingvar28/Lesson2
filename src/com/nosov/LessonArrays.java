package com.nosov;

import java.util.Arrays;

public class LessonArrays {
    public void LessonArrays() {

        //index   0 1 2 3 4
        //element 2 3 4 5 6

        int[] array = {1, 2, 3, 4, 5,6};
        System.out.println(Arrays.toString(array));

        int lenght = array.length;
        System.out.println(lenght);

        int[] empty = new int[3];
        empty[0] = 3;
        empty[1] = 4;
//        empty[3] = 5; Exeption array index out of bounds
        empty[2] = empty[0] + empty[1];
        System.out.println(Arrays.toString(empty));
    }
}
