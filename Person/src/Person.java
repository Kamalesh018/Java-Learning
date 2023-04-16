public class Person {
    private String firstName;
    public String lastName;
    public int age;

// constructors are used. static ellama use pannurathu main method la easy ya use pannalam
    public Person(){
        this("default firstName", "default lastName",7837387);
        System.out.println("em[ty constroutors are allowed");
    }
    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
        System.out.println("constructors are allowed");

    }

    public String getFirstName() {
        return firstName;
    }
    public String getSecondName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public void setAge(int age){
        if(age <= 0 || age >= 100){
            this.age = age;
        }else {
            this.age = 0;
        }
    }
    public boolean isTeen(){
        if(age >= 12 && age <= 20){
        return true;
        }
        else return false;
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + lastName;
        }
    }



}
