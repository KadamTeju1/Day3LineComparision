package employeewage;

public class UC2
{
    public static void main(String[] args)
    {
        int empcheck=1;
        int empHr=20;
        int fulltime =8;
        double val=Math.floor(Math.random()*10%2);
        if (empcheck==val)
        {
            System.out.println("present");
            empcheck= fulltime * empHr;
            System.out.println("wage of emp is:"+empcheck);
        }else
        {
            System.out.println("absent");
        }
    }
}
