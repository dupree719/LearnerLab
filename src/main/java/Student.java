public class Student extends Person implements ILearner{
    private Student student;
    private double totalStudyTime;

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {

        // concrete implementation of the learn method which increments the
        // totalStudyTime variable by the specified numberOfHours argument.
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
