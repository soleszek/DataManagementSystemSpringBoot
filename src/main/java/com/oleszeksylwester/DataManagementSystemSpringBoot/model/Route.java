package com.oleszeksylwester.DataManagementSystemSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String owner;
    private String state;
    private LocalDate creationDate;
    private LocalDate finishDate;
    private LocalDate deadline;
    private String documentBeingApprovedId;
    private String documentBeingApprovedName;
    private LocalDate checkingDueDate;
    private String responsibleForChecking;
    private String responsibleForApproving;
    private String comments;

    public Route() {
    }

    public Route(String name, String owner, String state, LocalDate creationDate, LocalDate finishDate, LocalDate deadline, String documentBeingApprovedId, String documentBeingApprovedName, LocalDate checkingDueDate, String responsibleForChecking, String responsibleForApproving, String comments) {
        this.name = name;
        this.owner = owner;
        this.state = state;
        this.creationDate = creationDate;
        this.finishDate = finishDate;
        this.deadline = deadline;
        this.documentBeingApprovedId = documentBeingApprovedId;
        this.documentBeingApprovedName = documentBeingApprovedName;
        this.checkingDueDate = checkingDueDate;
        this.responsibleForChecking = responsibleForChecking;
        this.responsibleForApproving = responsibleForApproving;
        this.comments = comments;
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

    public String getState() {
        return state;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getDocumentBeingApprovedId() {
        return documentBeingApprovedId;
    }

    public String getDocumentBeingApprovedName() {
        return documentBeingApprovedName;
    }

    public LocalDate getCheckingDueDate() {
        return checkingDueDate;
    }

    public String getResponsibleForChecking() {
        return responsibleForChecking;
    }

    public String getResponsibleForApproving() {
        return responsibleForApproving;
    }

    public String getComments() {
        return comments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setDocumentBeingApprovedId(String documentBeingApprovedId) {
        this.documentBeingApprovedId = documentBeingApprovedId;
    }

    public void setDocumentBeingApprovedName(String documentBeingApprovedName) {
        this.documentBeingApprovedName = documentBeingApprovedName;
    }

    public void setCheckingDueDate(LocalDate checkingDueDate) {
        this.checkingDueDate = checkingDueDate;
    }

    public void setResponsibleForChecking(String responsibleForChecking) {
        this.responsibleForChecking = responsibleForChecking;
    }

    public void setResponsibleForApproving(String responsibleForApproving) {
        this.responsibleForApproving = responsibleForApproving;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
