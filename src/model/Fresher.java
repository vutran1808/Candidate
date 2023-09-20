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
public class Fresher extends Candidate {
    private Candidate candidate;
    private Date graduation;
    private String rank;
    private String education;

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Fresher(Candidate candidate, Date graduation, String rank, String education) {
        this.candidate = candidate;
        this.graduation = graduation;
        this.rank = rank;
        this.education = education;
    }

    public Date getGraduation() {
        return graduation;
    }

    public void setGraduation(Date graduation) {
        this.graduation = graduation;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return candidate + ", graduation=" + vl.formatDate(graduation) + ", rank=" + rank + ", education=" + education;
    }
    
}
