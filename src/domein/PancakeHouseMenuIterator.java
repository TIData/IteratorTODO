
package domein;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author sebastiaan
 */
public class PancakeHouseMenuIterator implements Iterator {
    
    private ArrayList<MenuItem> list;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Object next() {
        return list.get(position++);
    }

}
