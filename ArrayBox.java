package single;

import java.util.ArrayList;

public class ArrayBox {
    // 描述事物
    // 属性
    private static final Integer DEFAULT_INIT_CONTAINER = 10;
    private int[] elementData = new int[DEFAULT_INIT_CONTAINER];
    //使用者 (用户)      我是ArrayBox类型的一个具体的对象
    //想要存储          你把椅子交给我 box
    //以前直接找到数组那个人   我可以帮你们存起来



    // 方法

    /**
     * specificCapacity:具体容量计算
     * @param minCapacity
     */
    public void specificCapacity(int minCapacity){
        //原始数组的容量
        int oldCapacity = elementData.length;
        //如果不够将以1.5倍的容量扩容;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        //扩容后的容量如果说没有还没有满足旧容量 就直接使用旧容量
        if(newCapacity - oldCapacity < 0) {
            newCapacity = minCapacity;
        }
        //获取到一个合适的长度 newCapacity
        //按照这个新的长度, 创建一个新的容器, 把旧的数组赋值过去

    }

    //设计一个方法 负责创建一个新的数组 把旧数组中的值,全部移入新数组中
    //  需要新数组的长度, 旧数组
    //  返回一个新的数组
    public int[] copyOf(int[] oldArray, int newCapacity) {
        //创建一个新的数组
        int[] newArray = new int[newCapacity];
        //将旧数组的元素移入新数组中
        for(int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }



    //设计一个方法, 帮助确保数组容量
    // 需要提供一个条件, 需要的最少容量

    /**
     * ensureCapacityInternal:确保内部容量
     * @param minCapacity: 最小容量
     *
     */
    public void ensureCapacityInternal(int minCapacity){
        //如果大, 需要的容量比之前容量还要大, 存不下了 , 需要扩容
        if(minCapacity - elementData.length > 0) {
            //扩容
            int element = elementData.length;

        }
    }

    // 需要设计一个 方法 用来添加元素
    //  需要提供什么条件(参数)    返回一个结果(返回值)
    //  需要提供一把椅子    告知用户一个结果 是否存储成功Boolean

    /**
     * add: 数组里面存一个数
     * @param element:需要添加的值
     * @return: 返回是否添加成功
     */
    public boolean add(int element) {

        return false;
    }
}
