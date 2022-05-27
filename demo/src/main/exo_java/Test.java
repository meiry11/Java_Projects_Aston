public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.SayHello());

        Student student = new Student();
        System.out.println(student.SayHello() );
        System.out.println("Mon age est: " +student.setAge(15) + " years old");

        Teacher teacher = new Teacher(40,);
        System.out.println(teacher.SayHello());
        System.out.println(teacher.Explain());
    }
}
