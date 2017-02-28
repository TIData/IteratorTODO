package domein;

public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    
//ZONDER ITERATOR-PATTERN (OOK NIET JAVA INGEBOUWDE ITERATOR)
//    public void printMenu() {
//        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
//        for (int index =0; index<breakfastItems.size(); index++) {
//            MenuItem menuItem = breakfastItems.get(index);
//            System.out.print(menuItem.getName() + ", ");
//            System.out.print(menuItem.getPrice() + " -- ");
//            System.out.println(menuItem.getDescription());
//        }
//        MenuItem[] lunchItems = dinerMenu.getMenuItems();
//        for (int index = 0; index<lunchItems.length; index++) {
//            MenuItem menuItem = lunchItems[index];
//            System.out.print(menuItem.getName() + ", ");
//            System.out.print(menuItem.getPrice() + " -- ");
//            System.out.println(menuItem.getDescription());
//        }

    
//MET ITERATOR-PATTERN
    public void printMenu() {
        //TODO creëer iterators voor PancakeHouse ne Objectville Dinner
        Iterator dinerMenuIt = dinerMenu.createIterator();
        Iterator pancakeHouseMenuIt = pancakeHouseMenu.createIterator();
        
        System.out.println("MENU\n----\nBREAKFAST");
        //TODO print menu voor PancakeHouse (gebruik methode printmenu)
        printMenu(pancakeHouseMenuIt);
        System.out.println("\nLUNCH");
        //TODO print menu for Objectville Diner
        printMenu(dinerMenuIt);
    }
    
    private void printMenu(Iterator iterator) {
        //TODO gebruik iterator om de items te doorlopen
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(
                    menuItem.getDescription());
        }
    }

}
