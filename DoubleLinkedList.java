package eg.edu.alexu.csd.datastructure.linkedList;

public class DoubleLinkedList implements ILinkedList {

    class DNode {
        Object element;
        DNode Next;
        DNode Prev;

        DNode(Object Value, DNode next, DNode prev) {
            element = Value;
            Next = next;
            Prev = prev;
        }
    }

    DNode head;
    DNode tail;
    int size;

    DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public void addFirst(DNode node){
        head.Prev=node;
        node.Next=head;
        head=node;
        size++;
        if(tail==null)tail=node;
    }


    @Override
    public void add(Object element) {
        DNode tmp = new DNode(element, null, null);
        if(tail==null){
            tail=tmp;
            head=tmp;
        }
        else{
        tail.Next = tmp;
        tmp.Prev = tail;
        tail = tmp;
        if (head == null) head = tmp;}
            size++;
    }

    @Override
    public void add(int index, Object element) {
        if (index > size) {
            System.out.println("OUT of index");
            return;
        }
        DNode node = new DNode(element, head, null);

        if (index == 0) {
            head.Prev = node;
            head = node;
        } else {
            DNode tmp = head;
            int c = 1;
            while (tmp.Next != null && c < index) {
                tmp = tmp.Next;
                c++;
            }
            tmp.Next.Next.Prev=node;
            node.Next = tmp.Next.Next;
            node.Prev = tmp;
            tmp.Next=node;

            if (node.Next == null) tail = node;
            if (node.Prev == null) head = node;
        }
        size++;
    }

    public Object get(int index) {
        if(index>size-1){
            System.out.println("INdex out of size");
            return null;
        }
        DNode tmp=head;
        int c=0;
        while(c<index){
            tmp=tmp.Next;
            c++;
        }
        return tmp.element;
    }

    public void set(int index, Object element) {
        DNode tmp=head;
        if(index>size-1 || index<0){
            System.out.println("Index out of size");
            return;
        }
        int c=0;
        while (c<index){
            tmp=tmp.Next;
            c++;
        }
        tmp.element=element;
        return;
    }

    public void clear() {
        head.Next=null;
        tail.Prev=null;
        head.element=null;
        size=0;
    }

    public boolean isEmpty() {
        return (size==0);
    }
    public int size(){
        return size;
    }

    public ILinkedList sublist(int fromIndex, int toIndex) {
        if (toIndex > size - 1) System.out.println("toIndex out of valid indexes");
        else if (fromIndex < 0) System.out.println("fromIndexes out of valid indexes");
        else if (fromIndex > toIndex) System.out.println("From index is greater than to index (Oo)?");
        else{
                DoubleLinkedList tmplist = new DoubleLinkedList();
                DNode tmp = new DNode(head.element, head, null);
                for (int i = 0; i < fromIndex; i++) {
                    tmp = tmp.Next;
                }
                tmplist.head = tmp;

                for (int i = fromIndex - 1; i < toIndex; i++) {
                    tmp = tmp.Next;
                    tmplist.add(tmp.element);
                }
                return tmplist;
            }
        return sublist(0,size-1);

    }
    @Override
    public void remove(int index) {
        if(index>size-1){System.out.println("Index out of context");return;}
        DNode tmp=head;
        if(index==0){
            tmp=tmp.Next;
            head.Next=null;
            head=tmp;
            tmp.Prev=null;

        }
        else if(index==size-1){
            tmp=tail.Prev;
            tail.Prev=null;
            tail=tmp;
            tmp.Next=null;

        }else{
        for(int i=0;i<index;i++)
            tmp=tmp.Next;
        DNode prev=tmp.Prev;
        DNode next=tmp.Next;
        prev.Next=next;
        next.Prev=prev;
        tmp.Next=null;
        tmp.Prev=null;
        }
        size--;

    }

    @Override
    public boolean contains(Object o) {
        DNode tmp=head;
        if(tmp.element==o)return true;
        else {
            while (tmp.Next!=null){
                tmp=tmp.Next;
                if (tmp.element==o)return true;
            }
            return false;
        }
    }
    public void printList(){
        DNode tmp=head;
        while (tmp!=null){
            System.out.print(tmp.element+" ");
            tmp=tmp.Next;
        }
        System.out.println();
    }

}
