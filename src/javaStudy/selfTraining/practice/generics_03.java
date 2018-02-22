package javaStudy.selfTraining.practice;

import java.util.ArrayList;
import java.util.List;

public class generics_03 {
    boolean x = true;

    public static void main(String[] args) {

    }


    public <T> List<T> mtd_01(T obj) {
        List<T> mdList = new ArrayList();
        return null;
    }
}

class OkModel {
    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean suc) {
        this.success = suc;
    }

}
