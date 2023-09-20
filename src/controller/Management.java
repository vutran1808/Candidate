/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;

/**
 *
 * @author ASUS
 */
public class Management {

    private List<Candidate> candidates;

    public Management() {
        this.candidates = new ArrayList<>();
    }

    public List<Candidate> showAll() {
        return this.candidates;
                     
    }

    public void addCandidate(Candidate candidate) {
        this.candidates.add(candidate);
    }

    public Predicate<Candidate> sameName(String name) {
        return candidate -> candidate.getLastname().equals(name);
    }

    public List<Candidate> sameType(int type) {
        return this.candidates.stream()
                .filter(candidate -> {
                    if (type == 0) {
                        return candidate instanceof Intern;
                    }
                    if (type == 1) {
                        return candidate instanceof Fresher;
                    }
                    if (type == 2) {
                        return candidate instanceof Experience;
                    }

                    return false;

                }).collect(Collectors.toList());
    }

    public List<Candidate> filterStudent(Predicate<Candidate> predicate) {
        return candidates.stream().filter(predicate).collect(Collectors.<Candidate>toList());
    }

}
