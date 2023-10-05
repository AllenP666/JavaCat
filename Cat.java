public class Cat
{
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name)
    {
        if (name.isEmpty())
        {
            System.out.println("Name of cat is Empty!");
        }
        else
        {
            this.name = name;
        }
    }

    public void setAge(int age)
    {
        if (age > 0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Age must be greater than 0!");
        }
    }

    public void setWeight(int weight)
    {
        if (weight > 0)
        {
            this.weight = weight;
        }
        else
        {
            System.out.println("Weight must be greater than 0!");
        }
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void sayMeow()
    {
        System.out.println("Meow");
    }

    public void lickMilk()
    {
        System.out.println("Cat just licked milk");
    }

    public void makeLeap()
    {
        if (this.weight < 10)
        {
            System.out.println("Cat made a leap");
        }
        else
        {
            System.out.println("Cat is too heavy to make a leap!");
        }
    }
}
