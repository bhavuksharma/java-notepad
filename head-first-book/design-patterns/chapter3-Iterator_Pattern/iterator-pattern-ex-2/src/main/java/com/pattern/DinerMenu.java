package com.pattern;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(fAKIN') Bacon with Lettuce & tomato on whole wheat",true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false,2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems < MAX_ITEMS){
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }else{
            System.err.println("Sorry, menu is full! Can't add item to menu");;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
}
