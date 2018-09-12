package cn.nancode.design.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(123, "数据开发", 233.00);
        System.out.println(" 折扣价格：" + javaCourse.getPrice() +
                " 原价格：" + ((JavaDiscountCourse) javaCourse).getOriginPrice());
    }
}
