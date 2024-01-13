package Uke2.Opg7;

import java.util.Objects;

public class Student implements Comparable<Student> {
    // a)
    private String studentnummer;
    private String fornavn;
    private String etternavn;
    private String studiested;

    public Student(String studentnummer, String fornavn, String etternavn, String studiested) {
        this.studentnummer = studentnummer;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.studiested = studiested;
    }

    public String getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getStudiested() {
        return studiested;
    }

    public void setStudiested(String studiested) {
        this.studiested = studiested;
    }

    // b)
    @Override
    public int compareTo(Student annen) {
        return studentnummer.compareTo(annen.studentnummer);
    }

    // c)
    @Override
    public String toString() {
        String tekst = "Studentnr.: " + studentnummer +
                " Fornavn : " + fornavn + " Etternavn " + etternavn +
                " Studiested: " + studiested;
        return tekst;
    }

    // d)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentnummer, student.studentnummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentnummer);
    }
}
