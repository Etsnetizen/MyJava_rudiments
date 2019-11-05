class Person
{
    private int age;//age被声明成private
    public void setAge(int num)
    {
        age=num;
    }
    public int getAge()
    {
        return age;
    }
 
}
 
 
class Practice3
{
    public static void main(String[] args)
    {
        Person p =new Person();
        p.setAge(10);
        //System.out.println(p.age);//age由于是priva,因此类外无法通过对象访问
        System.out.println(p.getAge());//只能通过get访问
    }
}