public class Coctevran extends Hogwarts {
    private int smart;
    private int wit;
    private int creation;

    public Coctevran(int transgrassionPower, int magicPower, int smart, int wit, int creation) {
        super(transgrassionPower, magicPower);
        this.smart = smart;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public void stats(Coctevran coctevran) {
        System.out.println("smart- " + getSmart()
                + "; wit - " + getWit()
                + "; creation - " + getCreation()
                + "; transgraspow - " + getTransgrassionPower()
                + "; magicpower - " + getMagicPower());
    }

    public void comparison(Coctevran coctevran) {
        int sumStudentStats = Coctevran.this.getMagicPower() + Coctevran.this.getTransgrassionPower() + Coctevran.this.getWit() + Coctevran.this.getSmart() + Coctevran.this.getCreation();
        int sumStudentStats1 = coctevran.getMagicPower() + coctevran.getTransgrassionPower() + coctevran.getWit() + coctevran.getSmart() + coctevran.getCreation();
        if (sumStudentStats < sumStudentStats1) {
            System.out.println("pupit 1 > pupit 2");
        } else if (sumStudentStats > sumStudentStats1) {
            System.out.println("pupit 1 < pupit 2");
        } else {
            System.out.println("pupits same");
        }

    }
}
