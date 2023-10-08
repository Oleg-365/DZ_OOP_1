package HW4;

import java.time.LocalDate;

public class Teacher {

    protected String firstName;
    protected String secondName;
    protected String patronymic;
    protected LocalDate dateOfBirth;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "\nPerson " +
                "firstName: " + firstName + '\'' +
                " secondName: " + secondName + '\'' +
                " patronymic: " + patronymic + '\'' +
                " dateOfBirth: " + dateOfBirth +
                ' ';
    }
}
