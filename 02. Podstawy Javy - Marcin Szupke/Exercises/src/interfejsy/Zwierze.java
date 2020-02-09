package interfejsy;

public class Zwierze implements Halasowanie, Jedzenie, Spanie, Wedrowanie {

//   private Halasowanie halasowanie;
   private Jedzenie jedzenie;
//   private Spanie spanie;
//   private Wedrowanie wedrowanie;

    public Zwierze(Halasowanie halasowanie, Jedzenie jedzenie, Spanie spanie, Wedrowanie wedrowanie) {
//        this.halasowanie = halasowanie;
        this.jedzenie = jedzenie;
//        this.spanie = spanie;
//        this.wedrowanie = wedrowanie;
    }

    @Override
    public void halasuj() {
        halasowanie.halasuj();
    }

    @Override
    public void jedz() {
        jedzenie.jedz();
    }

    @Override
    public void spij() {
        spanie.spij();
    }

    @Override
    public void wedruj() {
        wedrowanie.wedruj();

    }
}
