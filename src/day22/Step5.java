package day22;

public class Step5 {
    public static void main(String[] args) {
        // 1. 모든 사람이 신청 가능
            // 1. 사람 객체 생성
        Person person = new Person();
            // 2. 사람 객체를 등록자1에 대입
        Applicant<Person> applicant1 = new Applicant<>(person);
            // 3.
        Course.registerCourse1(applicant1);
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

        // 2. 학생만 등록 가능
        //Course.registerCourse2(new Applicant<Person>(new Person()));
        //Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        // 3. 직장인 및 일반인 등록 가능
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        //Course.registerCourse3(new Applicant<Student>(new Student()));
        //Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
        //Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
    }
}
