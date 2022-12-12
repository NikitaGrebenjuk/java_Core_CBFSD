package org.example;

import java.util.ArrayList;

public class Batch {
    private ArrayList<Participant> participantsList;
    private int bid;
    private String project;

    public Batch(ArrayList<Participant> participantsList, int bid, String project) {
        this.participantsList = participantsList;
        this.bid = bid;
        this.project = project;
    }

    public ArrayList<Participant> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(ArrayList<Participant> participantsList) {
        this.participantsList = participantsList;
    }

    public void addParticipant(Participant participant){
        this.participantsList.add(participant);
    }
    public void  removeParticipant(Participant participant){
        this.participantsList.remove(participant);
    }
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
