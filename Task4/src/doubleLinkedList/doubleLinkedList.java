package doubleLinkedList;

public class doubleLinkedList {

    private Link first;
    private Link last;

    public doubleLinkedList() {
        first = null;
        last = null;
    }

    /**
     * Вставка в начало списка
     *
     * @param name
     * @param age
     */
    public void insertFirst(String name, int age) {
        Link link = new Link(name, age);
        if (this.isEmpty()) {
            last = link;
        }
        link.next = first;
        first = link;

    }

    /**
     * Вставка в конец списка
     *
     * @param name
     * @param age
     */
    public void insertLast(String name, int age) {
        Link link = new Link(name, age);
        if (this.isEmpty()) {
            first = link;
        } else {
            last.next = link;
        }
        last = link;
    }

    /**
     * Удаление из начала списка
     *
     * @return Link
     */
    public Link deleteFirst() {
        Link temp = first;
        if (this.isEmpty()) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    /**
     * Поиск записи в листе
     *
     * @param name
     * @return Link
     */
    public Link find(String name) {
        Link current = first;
        while (current.name != name) {
            if (current.next == null) {
                return null;
            } else {
                current = current = current.next;
            }
        }
        return current;
    }

    /**
     * Удаление
     *
     * @param name
     * @return Link
     */
    public Link delete(String name) {
        Link cur = first;
        Link pre = first;

        while (cur.name != name) {
            if (cur.next == null) {
                return null;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (cur == first) {
            first = first.next;
        } else {
            pre.next = cur.next;
        }
        return cur;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void print() {
        Link current = first;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }
}
