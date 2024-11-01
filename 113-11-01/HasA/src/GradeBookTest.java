public class GradeBookTest {
    public static void main(String[] args){
        final  int NUMBER_OF_STUDENTS=3;
        Student[]students=new Student[3];
        students[0]=new Student("A1122221009","吳奇隆");
        students[1]=new Student("A1122221010","陳宏明");
        students[2]=new Student("A1122221011","林志玲");
        GradeBook gradeBook=new GradeBook("Java程式設計",students,NUMBER_OF_STUDENTS);
        gradeBook.processStundentsGrade();
        gradeBook.displayGradeReport();

    }
}
