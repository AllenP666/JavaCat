public class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat("BaseName",1,1);
        cat.setAge(0);
        cat.setName("");
        cat.setWeight(11);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());
        cat.sayMeow();
        cat.lickMilk();
        cat.makeLeap();
    }
}