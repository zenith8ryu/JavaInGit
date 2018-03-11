package simple_prj.ec_lv0.entity;


/**
 * The "goods" entity class
 *
 * @author zenith8ryu
 */
public class Goods {
    //PK of the table "Goods"
    private int gid;
    private String gname;
    private double gprice;
    private int gnum;

    /**
     * add info of a good
     *
     * @param gname,gprice,gum
     */
    public Goods(String gname, double gprice, int gnum) {
        this.gname = gname;
        this.gprice = gprice;
        this.gnum = gnum;
    }

    /**
     * Show all goods
     *
     * @param gid,gname,gprice,gum
     */
    public Goods(int gid, String gname, double gprice, int gum) {
        this.gid = gid;
        this.gname = gname;
        this.gprice = gprice;
        this.gnum = gum;
    }

    /**
     * mod good info by id
     *
     * @param gid,gum
     */
    public Goods(int gid, int gnum) {
        this.gid = gid;
    this.gnum = gnum;
    }

    /**
     * mod good info by id
     *
     * @param gid,gprice
     */
    public Goods(int gid, double gprice) {
        this.gid = gid;
        this.gprice = gprice;
    }

    /**
     * mod good info by id
     *
     * @param gid,gname
     */
    public Goods(int gid, String gname) {
        this.gid = gid;
        this.gname = gname;
    }


    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getGprice() {
        return gprice;
    }

    public void setGprice(double gprice) {
        this.gprice = gprice;
    }

    public int getGnum() {
        return gnum;
    }

    public void setGnum(int gnum) {
        this.gnum = gnum;
    }
}
