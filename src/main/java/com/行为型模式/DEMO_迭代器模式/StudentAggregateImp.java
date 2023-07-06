package com.行为型模式.DEMO_迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tanyu
 * @Date 2023/7/6 21:53
 * @PackageName: com.行为型模式.DEMO_迭代器模式
 * @ClassName: StudentIteratorImp
 * @Description: TODO
 * @Version 1.0
 */
public class StudentAggregateImp implements StudentAggregate {

    public List<Student> students = new ArrayList<>();
    @Override
    public void add(Student student) {
        this.students.add(student);
    }

    @Override
    public void del(Student student) {
        this.students.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(students);
    }
}
