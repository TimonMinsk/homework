package homework.lesson03;

public class StudentApp {
    public static void main(String[] args) {

        StudentClient studentClient = new StudentClient();

        for (int i = 0; i < 9; i++) {
            /*switch (i) {
                case 0, 1, 2 -> studentClient.setStudentTypes(new StudentsType01());
                case 3, 4, 5 -> studentClient.setStudentTypes(new StudentsType02());
                case 6, 7, 8 -> studentClient.setStudentTypes(new StudentsType03());
            }*/
            switch (i) {
                case 0:
                    studentClient.setStudentTypes(new StudentsType01());
                    break;
                case 1:
                    studentClient.setStudentTypes(new StudentsType01());
                    break;
                case 2:
                    studentClient.setStudentTypes(new StudentsType01());
                    break;
                case 3:
                    studentClient.setStudentTypes(new StudentsType02());
                    break;
                case 4:
                    studentClient.setStudentTypes(new StudentsType02());
                    break;
                case 5:
                    studentClient.setStudentTypes(new StudentsType02());
                    break;
                case 6:
                    studentClient.setStudentTypes(new StudentsType03());
                    break;
                case 7:
                    studentClient.setStudentTypes(new StudentsType03());
                    break;
                case 8:
                    studentClient.setStudentTypes(new StudentsType03());
                    break;
            }
            studentClient.executeStudentTypes();
        }
    }
}
