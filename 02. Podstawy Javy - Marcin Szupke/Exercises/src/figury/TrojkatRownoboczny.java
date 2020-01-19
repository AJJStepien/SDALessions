package figury;

public class TrojkatRownoboczny extends Trojkat {

    private double dlugoscBoku;

    public TrojkatRownoboczny(double dlugoscBoku) {
        super(dlugoscBoku, ((dlugoscBoku*Math.sqrt(3)/2)), dlugoscBoku, dlugoscBoku);
        this.dlugoscBoku = dlugoscBoku;
    }

    public double obliczPolePowierzchni(){
        double polePowierzchni;
        polePowierzchni = (Math.pow(dlugoscBoku, 2) * Math.sqrt(3))/4;
        return polePowierzchni;
    }
}

