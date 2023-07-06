package com.行为型模式.DEMO_迭代器模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 17:22
 * @description: 抽象迭代器 定义访问和遍历聚合元素的接口，通常包含 hasNext()、next() 等方法
 * @Version: 1.0
 **/
public interface StudentIterator {
    boolean hasNext();
    Student next();
}
