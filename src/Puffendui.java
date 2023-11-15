public class Puffendui extends Hogwarts{
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffendui(int transgrassionPower, int magicPower, int hardWork, int loyalty, int honesty) {
        super(transgrassionPower, magicPower);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void stats(Puffendui puffendui) {
        System.out.println("hones- " + getHonesty()
                + "; loyal - " + getLoyalty()
                + "; hardw - " + getHardWork()
                + "; transgraspow - " + getTransgrassionPower()
                + "; magicpower - " + getMagicPower());
    }

    public void comparison (Puffendui puffendui,Puffendui puffendui1){
        int sumStudentStats = puffendui.getMagicPower() + puffendui.getTransgrassionPower() + puffendui.getHardWork() + puffendui.getLoyalty() + puffendui.getHonesty();
        int sumStudentStats1 = puffendui1.getMagicPower() + puffendui1.getTransgrassionPower() + puffendui1.getHardWork() + puffendui1.getLoyalty() + puffendui1.getHonesty();
        if (sumStudentStats < sumStudentStats1) {
            System.out.println("pupit 1 > pupit 2");
        } else if (sumStudentStats>sumStudentStats1) {
            System.out.println("pupit 1 < pupit 2");
        }else {
            System.out.println("pupits same");
        }

    }
}
