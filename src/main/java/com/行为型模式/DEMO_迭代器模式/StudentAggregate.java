package com.行为型模式.DEMO_迭代器模式;

/**
 * @Author tanyu
 * @Date 2023/7/6 21:51
 * @PackageName: com.行为型模式.DEMO_迭代器模式
 * @ClassName: Aggregate
 * @Description: TODO
 * @Version 1.0
 */
public interface StudentAggregate {
    void add(Student student);

    void del(Student student);

    StudentIterator getStudentIterator();
}
