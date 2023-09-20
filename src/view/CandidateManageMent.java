/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Management;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;
import validate.validate;

/**
 *
 * @author ASUS
 */
public class CandidateManageMent extends Menu {

    Management mn = new Management();
    validate valid = new validate();

    public CandidateManageMent() throws ParseException {
        super("Candidate Management", new String[]{"Intern", "Fresher", "Experience", "Searching", "Exit"});
        Candidate base = new Candidate("1", "Tran", "Vu", valid.parseDate("18/08/2003"), "Hoi An", "0909090", "abc");
        Candidate it1 = new Intern(base, "SW", 3, "FPT");
        Candidate it2 = new Intern(base, "IT", 1, "FPT");
        Candidate it3 = new Intern(base, "AI", 4, "FPT");
        Candidate fr1 = new Fresher(base, valid.parseDate("18/08/2003"), "1", "FPT");
        Candidate fr2 = new Fresher(base, valid.parseDate("18/08/2003"), "4", "FPT");
        Candidate ex1 = new Experience(base, 3, "Java");
        Candidate ex2 = new Experience(base, 4, "HTML");
        mn.addCandidate(it1);
        mn.addCandidate(it2);
        mn.addCandidate(it3);
        mn.addCandidate(fr1);
        mn.addCandidate(fr2);
        mn.addCandidate(ex1);
        mn.addCandidate(ex2);

    }

    public void SearchCandidate() {
        mn.showAll().forEach(candidate -> {
            System.out.println(candidate.toString());
        });
    }

    public Candidate insertCandidate() throws ParseException {
        String id = getInput("ID");
        String firstName = getInput("First name:");
        String lastName = getInput("Last name:");
        Date birthday = valid.parseDate(getInput("Enter birthday"));
        String address = getInput("Address");
        String phone = getInput("phone");
        String email = getInput("Email");
        return new Candidate(id, firstName, lastName, birthday, address, phone, email);
    }

    @Override
    public void execute(int n) {

        try {

            switch (n) {
                case 1:
                    Candidate cd1 = insertCandidate();
                    String major = getInput("Major");
                    int semester = Integer.parseInt(getInput("Semester"));
                    String university = getInput("University name");
                    mn.addCandidate(new Intern(cd1, major, semester, university));
                    break;
                case 2:
                    Candidate cd2 = insertCandidate();
                    Date graduation = valid.parseDate(getInput("Graduated date"));
                    String rank = getInput("Rank");
                    String education = getInput("Education");
                    mn.addCandidate(new Fresher(cd2, graduation, rank, education));
                    break;
                case 3:
                    Candidate cd3 = insertCandidate();
                    int YofEx = Integer.parseInt(getInput("Year of experience"));
                    String proSkill = getInput("Professional Skill");
                    mn.addCandidate(new Experience(cd3, YofEx, proSkill));
                    break;
                case 4:
                    System.out.println("=============Intern===============");
                    mn.sameType(0).forEach(intern -> {
                        System.out.println(intern.toString());
                    });
                    System.out.println("============Fresher===============");
                    mn.sameType(1).forEach(fresher -> {
                        System.out.println(fresher.toString());
                    });
                    System.out.println("==========Experience=============");
                    mn.sameType(2).forEach(experience -> {
                        System.out.println(experience.toString());
                    });
                    String name = getInput("Enter first or last name");
                    int type = Integer.parseInt(getInput("Type of candidate(0 - 1 - 2)"));
                    mn.filterStudent(mn.sameName(name)).forEach(ctm -> {System.out.println(ctm.toString());});
                    break;
            }
        } catch (ParseException ex) {
        }
    }

    public static void main(String[] args) throws ParseException {
        CandidateManageMent cd = new CandidateManageMent();

        cd.run();

    }
}
