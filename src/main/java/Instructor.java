public class Instructor extends Person implements ITeacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(ILearner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for (ILearner learner : learners) {
            learner.learn(numberOfHoursPerLearner);

        }

    }
}
