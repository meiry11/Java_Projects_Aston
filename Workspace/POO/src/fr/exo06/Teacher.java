package fr.exo06;
public class Teacher extends Person {
    private String subject;



    public Teacher(int age, String subject) {
        super(age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String Explain() {
        String Exp = "Explaination begin";
        return Exp;
    }
}
