package com.行为型模式.DEMO_迭代器模式;

/**
 * @Author tanyu
 * @Date 2023/7/6 22:01
 * @PackageName: com.行为型模式.DEMO_迭代器模式
 * @ClassName: test
 * @Description: TODO
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        StudentAggregate studentAggregateImp = new StudentAggregateImp();
        studentAggregateImp.add(new Student("张三",101));
        studentAggregateImp.add(new Student("李四",102));
        studentAggregateImp.add(new Student("王五",103));
        studentAggregateImp.add(new Student("赵六",104));
        StudentIterator studentIterator = studentAggregateImp.getStudentIterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
