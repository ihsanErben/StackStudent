
public class Class {

    Student top;
    int count = 0;

    public void push(int id, String name) {
        Student ogrenci = new Student(id, name);
        if (top == null) {
            top = ogrenci;
            count++;
            return;
        } else {
            ogrenci.next = top;
            top = ogrenci;
            count += 1;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("--- empty ---");
            return;
        } else {
            System.out.println(top.name + " >>>>>>>>>");
            top = top.next;
            count -= 1;
        }
    }

    public void top() {
        if (top == null) {
            System.out.println("--- empty ---");
            return;
        } else {
            System.out.println("top id: " + top.id);
            System.out.println("top name: " + top.name);
        }
    }

    public void print() {
        if (top == null) {
            System.out.println("--- empty ---");
            return;
        } else {
            System.out.println("-----------------");
            Student tmp = top;
            while (tmp != null) {
                System.out.println("id: " + tmp.id);
                System.out.println("name: " + tmp.name);
                System.out.println("|");
                tmp = tmp.next;
                System.out.println("-----------------");
            }
        }
    }
}
