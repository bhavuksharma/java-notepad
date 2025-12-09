package com.pattern;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> menuList;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuList){
        this.menuList = menuList;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuList.size() || menuList.get(position) == null)
            return false;
        else
            return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuList.get(position);
        position++;
        return menuItem;
    }
}
