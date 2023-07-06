package com.行为型模式.DEMO_迭代器模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 17:24
 * @description: 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentIteratorImpl implements StudentIterator {

    public List<Student> students;

    public int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.students = list;
    }
    @Override
    public boolean hasNext() {
        return position < students.size();
    }


    @Override
    public Student next() {
        Student student = students.get(position);
        position++;
        return student;
    }
}
