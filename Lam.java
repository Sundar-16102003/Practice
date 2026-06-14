@FunctionalInterface
interface A{
int displaySalary(int a,int b);
}
public class Lam {
    public static void main(String[] args) {
        A a1 = (b,c)-> b+c;

        int res=a1.displaySalary(56778,7899);
        System.out.println(res);
    }
    
}
