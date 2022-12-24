package homework.lesson03;

import java.util.Random;

//Context
class StudentClient {
    public static final int TYPE_SUPER = 198;

    StudentsTypes studentsTypes;


    public void setStudentTypes(StudentsTypes studentTypes) {
        this.studentsTypes = studentTypes;
    }

    public void executeStudentTypes() {
        studentsTypes.learningType((new Random().nextInt(10) + 1) / 10.0);
    }


}