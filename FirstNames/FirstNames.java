import java.util.ArrayList;

public class FirstNames {
    // tester (main method)
    public static void main(String[] args) {
        // add some random names
        setName("Ava");
        setName("Liam");
        setName("Emma");
        setName("Noah");

        // display said random names
        getName();
        System.out.println();

        // show one name --> (overloaded method)
        System.out.println("Name at index 2: " + getName(2));
        System.out.println();

        // change a name
        System.out.println("Changing index 1 to 'Olivia'...");
        changeName(1, "Olivia");
        getName();
        System.out.println();

        // remove a name
        System.out.println("Removing index 0...");
        removeName(0);
        getName();
        System.out.println();

        // show size of ArrayList
        System.out.println("Current size of names list: " + getArraySize());
    }

    // global ArrayList variable
    static ArrayList<String> names = new ArrayList<String>();

    // add a name
    public static void setName(String name) {
        names.add(name);
    }

    // remove a name by index
    public static void removeName(int index) {
        if (index >= 0 && index < names.size()) {
            names.remove(index);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    // change a name at a given index
    public static void changeName(int index, String name) {
        if (index >= 0 && index < names.size()) {
            names.set(index, name);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    // display all names
    public static void getName() {
        System.out.println("All names:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ": " + names.get(i));
        }
    }

    // overloaded getName(int index)
    public static String getName(int index) {
        if (index >= 0 && index < names.size()) {
            return names.get(index);
        } else {
            return "Invalid index";
        }
    }

    // get array size
    public static int getArraySize() {
        return names.size();
    }
}
