package io.github.brucezhang1993.lesson4;

public class Tetromino {
    protected int move(int x) {
        return 0;
    }
}

class T extends Tetromino {
    /*
    3 多选题 在<插入代码>处填入选项中的代码，使T类没有编译错误的是  (A C)
    1) 重写父类方法不能改变方法返回值，排除选项 D  2) 重写父类方法不能比父类方法访问权限更低，排除选项 B
    */

    private int move(long x) { return 0; }
    @Override
    public int move(int x) { return 0; }
}
