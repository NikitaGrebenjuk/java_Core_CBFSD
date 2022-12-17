package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Batch batch0 = new Batch(new ArrayList<>(), "CBFSD");
        Participant participant0 = new Participant("Nike","nike@nike","","CBFSD");
        participant0.setBatch(batch0);
        batch0.greetAllParticipants();
        Input input1 = new Input();
        Batch batch1 = new Batch();
        input1.startDialog(batch1);
        input1.getScanner().close();
        batch1.greetAllParticipants();
        System.out.println(batch1.getBatchName());
    }
}