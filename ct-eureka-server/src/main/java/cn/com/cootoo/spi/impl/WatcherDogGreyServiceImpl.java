package cn.com.cootoo.spi.impl;

import cn.com.cootoo.spi.IWatchDogService;

/**
 * @author system
 * @create 2019/4/25
 **/
public class WatcherDogGreyServiceImpl implements IWatchDogService {
    @Override
    public void watcher() {
        System.out.println("grey watcher......");
    }
}
