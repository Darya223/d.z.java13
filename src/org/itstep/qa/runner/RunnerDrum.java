package org.itstep.qa.runner;

import org.itstep.qa.zadachi.Drum;
public class RunnerDrum {
    public static void main(String[] args) {
        Drum drum = new Drum(new int [10]);
        drum.getDrumValues(new int[]{100, 500, 750, 900, 1000, 1100, 1200, 1300, 1500, 1700});

    }
}
