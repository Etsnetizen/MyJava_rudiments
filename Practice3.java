class Person
{
    private int age;//age��������private
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
        //System.out.println(p.age);//age������priva,��������޷�ͨ���������
        System.out.println(p.getAge());//ֻ��ͨ��get����
    }
}