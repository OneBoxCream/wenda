/**
 * Created by Administrator on 2016/7/13.
 */
public class Human extends Animal{
    private String country;

    public Human(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    @Override
    public void say() {
        System.out.println("This is a Human , comes from " + country );
    }
}
