public class Triangolo extends Rettangolo{
    public Triangolo(double altezza,double base){
        super(altezza,base);
    }
    @Override
    public double calcolaArea(){
        return base * altezza / 2 ;
    }
}
