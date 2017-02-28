package domein;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] list;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        }
        return true;
    }
}
