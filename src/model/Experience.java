/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Experience extends Candidate {

    private Candidate candidate;
    private int YofExperience;
    private String proSkill;

    public Experience(Candidate candidate, int YofExperience, String proSkill) {
        this.candidate = candidate;
        this.YofExperience = YofExperience;
        this.proSkill = proSkill;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public int getYofExperience() {
        return YofExperience;
    }

    public void setYofExperience(int YofExperience) {
        this.YofExperience = YofExperience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return candidate + ", YofExperience=" + YofExperience + ", proSkill=" + proSkill;
    }

}
