import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria) {
        this.otherCriteria = otherCriteria;
        this.criteria = criteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteria);
    }
}
