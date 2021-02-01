package com.alvin.pattern.iterator;

import java.util.List;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 7:25 PM
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}