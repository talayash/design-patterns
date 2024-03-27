package structural.composite;

import structural.composite.interfaces.User;
import structural.composite.leafs.Admin;
import structural.composite.leafs.Creator;
import structural.composite.leafs.Editor;

public class Main {

    public static void main(String[] args) {

        User admin = new Admin(159, "tal1994a");
        User editor1 = new Editor(55, "crazyJam12");
        User editor2 = new Editor(8945, "eddi67");
        User creator = new Creator(15, "jhonboy1987");

        HeadUser headUser = new HeadUser(1, "Head User Group");
        headUser.addDepartment(admin);
        headUser.addDepartment(editor1);
        headUser.addDepartment(editor2);
        headUser.addDepartment(creator);

        headUser.print();
    }
}
