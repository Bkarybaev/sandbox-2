public class Dog {
    String name;
    String color;
    byte age;

    public Dog(){

    }
    public Dog(String name,String color,byte age){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public String geInfo(){
        return String.format("""
                Dog ::: info
                name  : %s
                color : %s
                age   : %d
                """,name,color,age);
    }


}
