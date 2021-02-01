package com.alvin.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 7:24 PM
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<Student>();  // 学生列表

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
