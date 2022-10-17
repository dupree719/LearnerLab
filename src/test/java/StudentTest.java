import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;
    @BeforeEach
    public void setUp() {
        student = new Student(719, "Bobby", 8);
    }
    @Test
    public void testImplementation(){
        assertTrue(student instanceof ILearner);
    }
    @Test
    public void testInheritance(){
        assertTrue(student instanceof Student);
    }
    @Test
    public void testLearn(){
        student.learn(10);
        assertEquals(18, student.getTotalStudyTime());
    }

}