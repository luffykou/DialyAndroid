package com.luffykou.androiddialy.designpattern;

/**
 * 静态内部类实现的单例类——懒加载且线程安全，不用加锁
 * Created by luffy on 19/1/8.
 */

public class UserSingleton {

    private UserSingleton() {

    }

    public static UserSingleton getInstance() {
        return UserSingletonHolder.INSTANCE;
    }

    private static class UserSingletonHolder {
        private static final UserSingleton INSTANCE = new UserSingleton();
    }
}
