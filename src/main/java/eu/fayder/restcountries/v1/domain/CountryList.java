package eu.fayder.restcountries.v1.domain;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CountryList implements List<Country> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Country> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Country country) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Country> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Country> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Country get(int index) {
        return null;
    }

    @Override
    public Country set(int index, Country element) {
        return null;
    }

    @Override
    public void add(int index, Country element) {

    }

    @Override
    public Country remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Country> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Country> listIterator(int index) {
        return null;
    }

    @Override
    public List<Country> subList(int fromIndex, int toIndex) {
        return null;
    }
}
