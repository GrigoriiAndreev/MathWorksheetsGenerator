package mathpackage.javastudy;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/*
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable{

    Entry<String> root;
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
//        return null;
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
//        return null;
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
//        return null;
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
//        return null;
    }
    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
//        return null;
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
//        return null;
    }
    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
//        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    static class Entry<T> implements Serializable{

        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        Entry (String string) {
            this.elementName = string;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }


    }
}
