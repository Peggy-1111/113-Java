public class Student {
    private String stundentID;
    private String name;

    public Student (){
        new Student("0000000000","未知");
    }
    public Student (String stundentID){
        new Student(stundentID,"未知");
    }
    public  Student(String studentID,String name){
        this.stundentID=studentID;
        this.name=name;
    }
    public String getStundentID(){
        return stundentID;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void printData(){
        System.out.printf("%s,%s",stundentID,name);
    }
}
