package simple_prj.ec_lv0.page;

import simple_prj.ec_lv0.dao.GoodsDAO;
import simple_prj.ec_lv0.entity.Goods;
import simple_prj.ec_lv0.tool.ScannerInput;

public class GoodsPage {


    /**
     * 1. Page for add goods
     */
    public static void addGoodsPage() {
        System.out.println("\tNow begins process of add goods.\n");
        System.out.println("\nInput goods name: ");
        String goodsName = ScannerInput.ScanerInfoString();

        // Enter goods price
        Double goodsPrice = ScannerInput.ScannerInfoPrice();

        // Enter goods number
        Integer goodsNum = ScannerInput.ScannerInfoNum();

        Goods goods = new Goods(goodsName, goodsPrice, goodsNum);
        boolean addGoods = new GoodsDAO().addGoods(goods); // call add function

        if (addGoods) {
            System.out.println("\n\t Goods addition succeed!");
        } else {
            System.out.println("\n Goods addition failed.");
        }
        //TODO: Change to the next step.
    }


    /**
     * 2. Page for update goods
     */
    public static void updateGoodsPage() {
        System.out.println("\tNow begins process of update goods info.\n");
        System.out.println("\nInput goods name: ");
        String gname = ScannerInput.ScanerInfoString();

        int git = new GoodsDAO().getGoodsId("gname");

        do {
            System.out.println("\n Input new price of the goods. ");
            Double gprice = ScannerInput.ScannerInfoPrice();

            System.out.println("\n Input new num of the goods. ");
            Integer gnum = ScannerInput.ScannerInfoNum();

            Goods goods = new Goods(gname, gprice, gnum);
            boolean updateGoods = new GoodsDAO().updateGoods(goods);

            if (updateGoods) {
                System.out.println("\n\t Goods update succeed!");
            } else {
                System.out.println("\n Goods update failed.");
            }
        } while (true);
    }


    /**
     * 3. Page for delete goods
     */
    public static void deleteGoodsPage() {

        System.out.println("\tNow begins process of delete goods.\n");
        System.out.println("\nInput goods name: ");
        String goodsName = ScannerInput.ScanerInfoString();

        int gid = new GoodsDAO().getGoodsId(goodsName); // Searching for the Gid(PK) of the goods you've chose.

        do {
            System.out.println("\nSure to delete this goods?: Y/N");

            String choice = ScannerInput.ScanerInfoString();
            if ("y".equals(choice) || "Y".equals(choice)) {
                boolean delGoods = new GoodsDAO().deleteGoods(gid); // call del function
                if (delGoods) {
                    System.out.println("\t Delete succeed!");
                } else {
                    System.out.println("\t Delete failed!");
                }
                // TODO : changedInfoNext(GoodsOperate.DEL);
                break;
            } else if ("n".equals(choice) || "N".equals(choice)) {
                MainPage.MaintenancePage();
            }
        } while (true);
    }


    public static void queryGoodsPage() {
        // TODO
    }

    public static void displayGoodsPage() {
        // TODO
    }
}
