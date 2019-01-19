package com.oleszeksylwester.DataManagementSystemSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String owner;
    private String assignedTo;
    private String documentBeingApprovedId;
    private String documentBeingApprovedName;
    private String state; //Active, Completed
    private LocalDate dueDate;
    private LocalDate completionDate;
    private String comments;
    private String parentId;

    public Task(){

    }

    public Task(String name, String owner, String assignedTo, String documentBeingApprovedId, String documentBeingApprovedName, String state, LocalDate dueDate, LocalDate completionDate, String comments, String parentId) {
        this.name = name;
        this.owner = owner;
        this.assignedTo = assignedTo;
        this.documentBeingApprovedId = documentBeingApprovedId;
        this.documentBeingApprovedName = documentBeingApprovedName;
        this.state = state;
        this.dueDate = dueDate;
        this.completionDate = completionDate;
        this.comments = comments;
        this.parentId = parentId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getDocumentBeingApprovedId() {
        return documentBeingApprovedId;
    }

    public String getDocumentBeingApprovedName() {
        return documentBeingApprovedName;
    }

    public String getState() {
        return state;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public String getComments() {
        return comments;
    }

    public String getParentId() {
        return parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setDocumentBeingApprovedId(String documentBeingApprovedId) {
        this.documentBeingApprovedId = documentBeingApprovedId;
    }

    public void setDocumentBeingApprovedName(String documentBeingApprovedName) {
        this.documentBeingApprovedName = documentBeingApprovedName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
