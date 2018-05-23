//package javaStudy.selfTraining.basic.polymorPrct01;
//
//public class MainPrg {
//    public static void main(String[] args) {
//        // 定义父类数组
//        Wine[] wines = new Wine[2];
//        // 定义两个子类
//        Wine jnc = new JNC();
//        Wine jgj = new JGJ();
//
//        // 父类引用子类对象
//        wines[0] = jnc;
//        wines[1] = jgj;
//
//        for (int i = 0; i < 2; i++) {
//            System.out.println(wines[i].toString() + "--" + wines[i].drink());
//        }
//
//        System.out.println("-------------------------------");println
//
//        // 继承链测试
//        Object o1 = new JNC();
//        System.out.println(o1.toString());
//
//        Object o2 = new JGJ();
//        System.out.println(o2.toString());
//
//        Object o3 = new polymorPrct01.Wine();
//        System.out.println(o3.toString());
//    }
//}
