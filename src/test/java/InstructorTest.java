import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    private Instructor instructor;

    @BeforeEach
    public void setUp() {
        instructor = new Instructor(213, "Mikaila");
    }
    @Test
    public void testImplementation(){
        assertTrue(instructor instanceof ITeacher);
    }
    @Test
    public void testInheritance(){
        assertTrue(instructor instanceof Person);
    }
    @Test
    public void teachTest(){
        Student student1 = new Student(01, "Michael", 4.0);
        Student student2 = new Student(02, "Tammy", 3.0);
        instructor.teach(student1, 1.0);
        assertEquals(5, student1.getTotalStudyTime());
    }
    @Test
    public void lectureTest(){
        Student student1 = new Student(01, "Michael", 4.0);
        Student student2 = new Student(02, "Tammy", 3.0);
        Student[] students = {student1, student2};
        instructor.lecture(students, 2.0);
        assertEquals(4, student2.getTotalStudyTime());
    }


}