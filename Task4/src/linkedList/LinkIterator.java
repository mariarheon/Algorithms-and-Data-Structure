package linkedList;

public class LinkIterator {

    public LinkedList list;
    public Link current;
    public Link previous;

    public LinkIterator(LinkedList list) {
        this.list = list;
        this.reset();
    }

    private void reset() {
        current = list.first;
        previous = null;
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Link getCurrent() {
        return current;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public void insertBefore(String name, int age) {
        Link link = new Link(name, age);
        if (previous == null) {
            link.next = list.first;
            list.first = link;
            reset();
        } else {
            link.next = previous.next;
            previous.next = link;
            current = link;
        }
    }

    public void insertAfter(String name, int age) {
        Link newlink = new Link(name, age);
        if (list.isEmpty()) {
            list.first = newlink;
            current = newlink;
        } else {
            newlink.next = current.next;
            current.next = newlink;
            nextLink();
        }
    }

    public String deleteCurrent() {
        String name = current.name;
        if (previous == null) {
            list.first = current.next;
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }

        }
        return name;
    }
}
