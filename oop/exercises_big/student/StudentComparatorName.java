import java.util.Comparator;

// Bộ so sánh này thi hành interface Comparator<Person>
// Chuyên so sánh các đối tượng Student.
public class StudentComparatorName implements Comparator<Student> {

  public int compare(Student o1, Student o2) {
    // Hai đối tượng null coi như bằng nhau.
    if (o1 == null && o2 == null) {
      return 0;
    }

    // Nếu o1 null, coi như o2 lớn hơn
    if (o1 == null) {
      return -1;
    }

    // Nếu o2 null, coi như o1 lớn hơn.
    if (o2 == null) {
      return 1;
    }

    int value = o1.getName().compareTo(o2.getName());
    return value;

  }
}
