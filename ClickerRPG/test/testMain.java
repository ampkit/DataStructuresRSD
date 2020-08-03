
import clickerrpg.SortedArrayList;
import clickerrpg.Helper;
import clickerrpg.ListInterface;

public class testMain {

    public static void main(String[] args) {
        
        Helper h1 = new Helper(1, "Ali", 2, 100, 1, 200);
        Helper h2 = new Helper(2, "Bob", 4, 200, 1, 400);
        Helper h3 = new Helper(3, "Candy", 6, 300, 1, 800);
        Helper h4 = new Helper(4, "Doggy", 8, 400, 1, 1600);
        Helper h5 = new Helper(5, "Erin", 10, 500, 1, 3200);
        

        ListInterface<Helper> hiredHelperList = new SortedArrayList<>();
         hiredHelperList.add(h3);
         hiredHelperList.add(h4);
        hiredHelperList.add(h1);
        hiredHelperList.add(h5);
        hiredHelperList.add(h2);
        
        for (int i = 0; i < hiredHelperList.getLength();i++){
            System.out.println(hiredHelperList.get(i));
        }
        System.out.println("---------------------------");
        
        hiredHelperList.remove(h4);
        for (int i = 0; i < hiredHelperList.getLength();i++){
            System.out.println(hiredHelperList.get(i));
        }
        System.out.println("---------------------------");
        hiredHelperList.clear();
        for (int i = 0; i < hiredHelperList.getLength();i++){
            System.out.println(hiredHelperList.get(i));
        }
    }

}
