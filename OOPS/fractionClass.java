package OOPS;
public class fractionClass {
    static Fraction addition(Fraction f1, Fraction f2){
        int num= f1.num*f2.deno+f2.num*f1.deno;
        int deno=f1.deno*f2.deno;
        Fraction f3=new Fraction(num, deno);
        return f3;
    }
    static int HCF(int x, int y){
        if(y==0) return x;
        return HCF(y, x%y);
    }
    public static class Fraction{  // uder defined data type (class)
        int num;
        int deno;
        Fraction(int num, int deno){
            this.num=num;
            this.deno=deno;
            simplify();
        }
        public void simplify(){
            int hcf=HCF(num,deno);
            num/=hcf;
            deno/=hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(4, 12);
        Fraction f2=new Fraction(8, 24);
        Fraction f3=addition(f1, f2);
        System.out.println(f3.num+"/"+f3.deno);
        
    }
}
