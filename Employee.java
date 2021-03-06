class Employee{
  private String name, address;
  private int year;
  public Employee(String name, int year, String address){
    this.name =name;
    this.year = year;
    this.address =address;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public String getAddress(){
    return address;
  }
  public static void main(String[] args){
    Employee e1 = new Employee("Robert", 1994, "64C- WallsStreet");
    Employee e2 = new Employee("Sam", 2000, "68d- WallsStreet");
    Employee e3 = new Employee("John", 1999, "26B- WallsStreet");
    System.out.println("Name\tYear of joining\t\tAddress");
    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getAddress());  // details of employee 1
    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getAddress());  // details of employee 2
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getAddress());  // details of employee 3
}
}
 