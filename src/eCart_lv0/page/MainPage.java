package eCart_lv0.page;

import eCart_lv0.tool.ScannerInput;

public class MainPage {

    /**
     * Entry Method
     *
     * @param args
     */
    public static void main(String[] args) {
        MainPage.mainPage();
    }

    /**
     * The MainEntrance UI
     */
    public static void mainPage() {
        System.out.println("***************************\n");
        System.out.println("\t (1) Goods Maintenance\n");
        System.out.println("\t (2) Goto Cash Register\n");
        System.out.println("\t (3) Goods Management\n");
        System.out.println("***************************");

        System.out.println("\nPlease input you choice (1-3), or input 0 to exit.");
        do {
            String choice = ScannerInput.ScannerInfoChoice();
            String regex = "[0-3]";

            if (choice.matches(regex)) {
                int info = Integer.parseInt(choice);
                switch (info) {
                    case 0:
                        System.out.println("------------------");
                        System.out.println("Quit system.");
                        System.exit(0);//Quit system (Terminate the JVM.)
                        break;
                    case 1:
                        MaintenancePage();
                        break;
                    case 2:
                        // TODO: checkstandLogPage();
                        break;
                    case 3:
                        // TODO: commodityManagementPage();
                        break;
                    default:
                        break;
                }
            }
        } while (true);

    }

    public static void MaintenancePage() {
        System.out.println("***************************\n");
        System.out.println("\t 1.Goods add\n");
        System.out.println("\t 2.Goods info modify\n");
        System.out.println("\t 3.Goods delete\n");
        System.out.println("\t 4.Goods search\n");
        System.out.println("\t 5.Show all goods\n");
        System.out.println("***************************");

        System.out.println("\nInput your choice by [1-5], or push 0 return to the previous menu.");

        do {
            String choice = ScannerInput.ScannerInfoChoice();
            String regex = "[0-5]";

            if (choice.matches(regex)) {
                switch (Integer.parseInt(choice)) {
                    case 0:
                        mainPage();
                        break;
                    case 1:
                        GoodsPage.addGoodsPage();
                        break;
                    case 2:
                        GoodsPage.updateGoodsPage();
                        break;
                    case 3:
                        GoodsPage.deleteGoodsPage();
                        break;
                    case 4:
                        GoodsPage.queryGoodsPage();
                        break;
                    case 5:
                        GoodsPage.displayGoodsPage();
                        break;
                    default:
                        break;
                }
            }
        } while (true);
    }
}
