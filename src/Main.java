public class Main{
    public static void main(String[]args){
        Rettangolo rettangolo = new Rettangolo(7,9);
        Triangolo triangolo = new Triangolo(9,8);
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());
    }
}
