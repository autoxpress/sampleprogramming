package linkingobject;

public class LinkNode {
    int value;
    LinkNode next;


    public LinkNode(int value) {
        this.value = value;
    }

    public static void main(String[] args) {

        // Create three different objects
        LinkNode linkNode1_1 = new LinkNode(10);
        LinkNode linkNode1_2 = new LinkNode(20);
        LinkNode linkNode1_3 = new LinkNode(30);

        // Link these three objects one by one
        linkNode1_1.next = linkNode1_2;
        linkNode1_2.next = linkNode1_3;

        // Define the head element
        LinkNode head = linkNode1_1;

        // Using the head element, iterate the linked objects
        while (head != null) {
            System.out.println("The value of linking object " + head.value);
            head = head.next;
        }
    }
}
