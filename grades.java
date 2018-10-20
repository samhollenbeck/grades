public class Student
{
  private String name;
  private int[] grades;

  public Student()
  {
    name = "";
    grades = new int[3];
  }

  public Student(String name, int[] grades)
  {
    this.name = name;
    this.grades = grades;
  }


  public String getName()
  {
    return this.name;
  }

  public int[] getGrades()
  {
    return this.grades;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setGrades(int[] grades)
  {
    this.grades = grades;
  }

  public int getSpecificGrade(int place)
  {
    return this.grades[place];
  }

  public void setSpecificGrade(int grade, int place)
  {
    this.grades[place] = grade;
  }

  public Double getAverage()
  {
    int sum = 0;

    for(int x: this.grades)
      sum = sum + x;

    return (double)sum/this.grades.length;

  }

  public String outputGrades()
  {
    String output = "";

    for(int x: this.grades)
      output = output + x + "    ";

    return output;
  }

  public static void main (String[] args)
  {

    Student a = new Student("Alice",new int[]{97,94,89,92});
    Student b = new Student("Bob",new int[]{92,84,91,89});
    Student c = new Student("Charlie", new int[]{67,87,91,88});
    Student d = new Student("Daniel",new int[]{101,93,98,95});

    a.setSpecificGrade(90,2);
    d.setName("Dan");

    System.out.println(String.format("%-20s= %s" , "Name", a.getName()));
    System.out.println(String.format("%-20s= %s" , "Grades", a.outputGrades()));
    System.out.println(String.format("%-20s= %s" , "Average", a.getAverage()));

    System.out.println("");

    System.out.println(String.format("%-20s= %s" , "Name =", b.getName()));
    System.out.println(String.format("%-20s= %s" , "Grades =", b.outputGrades()));
    System.out.println(String.format("%-20s= %s" , "Average =", b.getAverage()));

    System.out.println("");

    System.out.println(String.format("%-20s= %s" , "Name =", c.getName()));
    System.out.println(String.format("%-20s= %s" , "Grades =", c.outputGrades()));
    System.out.println(String.format("%-20s= %s" , "Average =", c.getAverage()));

    System.out.println("");

    System.out.println(String.format("%-20s= %s" , "Name =", d.getName()));
    System.out.println(String.format("%-20s= %s" , "Grades =", d.outputGrades()));
    System.out.println(String.format("%-20s= %s" , "Average =", d.getAverage()));

  }
}
