public class Cat {
    String name;
    String color;
    int age;

    public Cat(String name,String color,int age){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public Cat(){

    }
    public String geInfo(){
       return String.format("""
                Cat ::: info
                name  : %s
                color : %s
                age   : %d
                """,name,color,age);
    }
}
