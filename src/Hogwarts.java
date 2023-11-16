public class Hogwarts {
    private int transgrassionPower;
    private int magicPower;

    public Hogwarts(int transgrassionPower, int magicPower) {
        this.transgrassionPower = transgrassionPower;
        this.magicPower = magicPower;
    }

    public int getTransgrassionPower() {
        return transgrassionPower;
    }

    public void setTransgrassionPower(int transgrassionPower) {
        this.transgrassionPower = transgrassionPower;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public void comparison (Hogwarts hogwarts, Hogwarts hogwarts1){
        int sumStudentStats = hogwarts.getMagicPower() + hogwarts.getTransgrassionPower();
        int sumStudentStats1 = hogwarts1.getMagicPower() + hogwarts1.getTransgrassionPower();

        if (sumStudentStats > sumStudentStats1) {
            System.out.println("pupit 1 > pupit 2");
        } else if (sumStudentStats<sumStudentStats1) {
            System.out.println("pupit 1 < pupit 2");
        }else {
            System.out.println("pupits same");
        }

    }

}
