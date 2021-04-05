package JavaCollectionsFramework.lesson4;

public class Lesson4 { //LinkedList ч.2 Устройство
    public void runL4() {
        MyLinkdList myLinkdList = new MyLinkdList();
        myLinkdList.add(1);
        myLinkdList.add(2);
        myLinkdList.add(10);

        System.out.println(myLinkdList);
        System.out.println(myLinkdList.get(0));
        System.out.println(myLinkdList.get(1));
        System.out.println(myLinkdList.get(2));

        myLinkdList.remove(1);
        System.out.println(myLinkdList);
        myLinkdList.remove(1);
        System.out.println(myLinkdList);

    }
}
