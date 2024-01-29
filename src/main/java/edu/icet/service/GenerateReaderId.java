package edu.icet.service;

public class GenerateReaderId {
    private int idNum;

    public GenerateReaderId(){
        this.idNum = 1;

    }
    public String getReaderId(){
        return "R"+String.format("%06d",idNum++);
    }
}
