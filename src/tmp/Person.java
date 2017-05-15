package tmp;

/**
 * Created by artemsolonin on 11.05.2017.
 */

// Объекты этого класса возвращает веб-сервис
    // Класс соответствует JavaBeans-стандарту
    /*
    Наличие конструктора без параметров,
    get-set методы для private-полей
     */
public class Person {
    private String name;
    private String surname;
    private int age;

    public Person() {}

    public Person(String aName, String aSurname, int aAge)
    {
        name=aName;
        surname=aSurname;
        age=aAge;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String aName)
    {
        name=aName;
    }

    public void setSurname(String aSurname){
        surname=aSurname;
    }

    public void setAge(int aAge){
        age=aAge;
    }

    @Override
    public String toString(){
        return "tmp.Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }

}
