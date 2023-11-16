public class Main {
    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts(1, 1);

        Grifindor HarryPotter = new Grifindor(100, 24, 24, 24, 24);
        Grifindor HernionaGraiger = new Grifindor(24, 24, 24, 24, 24);
        Grifindor RonalzWizzly = new Grifindor(24, 24, 24, 24, 24);
        Sliserin DracoMalfoy = new Sliserin(10, 10, 10, 10, 10, 10, 10);
        Sliserin GrahamMontegu = new Sliserin(10, 10, 10, 10, 10, 10, 10);
        Sliserin GragoryGoil = new Sliserin(10, 10, 10, 10, 10, 10, 10);
        Puffendui ZahariaSmith = new Puffendui(12, 12, 12, 12, 12);
        Puffendui SedricDigory = new Puffendui(12, 12, 12, 12, 12);
        Puffendui JustinFinchFletchli = new Puffendui(12, 12, 12, 12, 12);
        Coctevran ChzhouChang = new Coctevran(1, 1, 1, 15, 15);
        Coctevran PadmaPatil = new Coctevran(11, 15, 15, 15, 15);
        Coctevran MarcusBelby = new Coctevran(15, 15, 15, 15, 15);

        ChzhouChang.stats(ChzhouChang);
        ZahariaSmith.stats(ZahariaSmith);
        HarryPotter.stats(HarryPotter);
        DracoMalfoy.stats(DracoMalfoy);

        HarryPotter.setBravery(10);
        HarryPotter.stats(HarryPotter);

        ChzhouChang.comparison(PadmaPatil);
        DracoMalfoy.comparison(GrahamMontegu);
        HarryPotter.comparison(HernionaGraiger);
        ZahariaSmith.comparison(SedricDigory);

        hogwarts.comparison(GragoryGoil);


    }
}