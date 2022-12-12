package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Batch batch0 = new Batch(new ArrayList<>(), 0, "CBFSD");
        Participant participant0 = new Participant(0,"Nike","nike@nike","","CBFSD");
        participant0.setBatch(batch0);
        System.out.println(batch0.getParticipantsList().toString());
    }
}