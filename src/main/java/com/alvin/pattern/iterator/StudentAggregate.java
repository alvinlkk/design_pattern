package com.alvin.pattern.iterator;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 7:23 PM
 */
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
