package com.行为型模式.DEMO_迭代器模式;

import java.util.List;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 17:24
 * @description: todo
 * @Version: 1.0
 **/
public class StudentIteratorImpl implements StudentIterator {

    public List<Student> students;

    public int position = 0;

    @Override
    public boolean hasNext() {
        return position < students.size();
    }


    @Override
    public Student next() {

        return null;
    }
}
