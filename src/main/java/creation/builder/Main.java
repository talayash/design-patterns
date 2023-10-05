package creation.builder;

import creation.builder.pojo.Admin;

public class Main {

    public static void main(String[] args) {

        Admin admin1 = new Admin.Builder().userName("talayash").build();
        Admin admin2 = new Admin.Builder().userName("talayash").password("123456789").build();
        Admin admin3 = new Admin.Builder().access(true).userName("TOTAH").build();

        System.out.println(admin1.toString());
        System.out.println(admin2.toString());
        System.out.println(admin3.toString());
    }
}
