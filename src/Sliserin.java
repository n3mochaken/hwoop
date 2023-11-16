public class Sliserin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Sliserin(int transgrassionPower, int magicPower, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(transgrassionPower, magicPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void stats(Sliserin sliserin) {
        System.out.println("cun- " + getCunning()
                + "; nob - " + getDetermination()
                + "; brave - " + getAmbition()
                + "; nob - " + getResourcefulness()
                + "; brave - " + getLustForPower()
                + "; transgraspow - " + getTransgrassionPower()
                + "; magicpower - " + getMagicPower());
    }

    public void comparison(Sliserin sliserin) {
        int sumStudentStats = Sliserin.this.getMagicPower() + Sliserin.this.getTransgrassionPower() + Sliserin.this.getLustForPower() + Sliserin.this.getCunning() + Sliserin.this.getAmbition() + Sliserin.this.getResourcefulness() + Sliserin.this.getDetermination();
        int sumStudentStats1 = sliserin.getMagicPower() + sliserin.getTransgrassionPower() + sliserin.getLustForPower() + sliserin.getCunning() + sliserin.getAmbition() + sliserin.getResourcefulness() + sliserin.getDetermination();
        if (sumStudentStats < sumStudentStats1) {
            System.out.println("pupit 1 > pupit 2");
        } else if (sumStudentStats > sumStudentStats1) {
            System.out.println("pupit 1 < pupit 2");
        } else {
            System.out.println("pupits same");
        }

    }

}