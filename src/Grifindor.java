public class Grifindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Grifindor(int transgrassionPower, int magicPower, int nobility, int honor, int bravery) {
        super(transgrassionPower, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void stats(Grifindor grifindor) {
        System.out.println("honor- " + getHonor()
                + "; nob - " + getNobility()
                + "; brave - " + getBravery()
                + "; transgraspow - " + getTransgrassionPower()
                + "; magicpower - " + getMagicPower());
    }

    public void comparison(Grifindor grifindor) {
        int sumStudentStats =  this.getBravery() + this.getNobility() + this.getHonor();
        int sumStudentStats1 =  grifindor.getBravery() + grifindor.getNobility() + grifindor.getHonor();
        if (sumStudentStats < sumStudentStats1) {
            System.out.println("pupit 1 > pupit 2");
        } else if (sumStudentStats > sumStudentStats1) {
            System.out.println("pupit 1 < pupit 2");
        } else {
            System.out.println("pupits same");
        }

    }
}
