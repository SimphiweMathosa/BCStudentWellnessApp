/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Simphiwe Mathosa
 */
public class Appointment {
     private int id;
    private String student;
    private String counselor;
    private LocalDate date;
    private LocalTime time;
    private String status;

    public Appointment(String student, String counselor, LocalDate date, LocalTime time, String status) {
        this.student = student;
        this.counselor = counselor;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public Appointment(int id, String student, String counselor, LocalDate date, LocalTime time, String status) {
        this.id = id;
        this.student = student;
        this.counselor = counselor;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getStudent() { return student; }
    public void setStudent(String student) { this.student = student; }

    public String getCounselor() { return counselor; }
    public void setCounselor(String counselor) { this.counselor = counselor; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public LocalTime getTime() { return time; }
    public void setTime(LocalTime time) { this.time = time; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
