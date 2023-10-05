package creation.objectPool.example1.interfaces;

import creation.objectPool.example1.pojo.Setting;

public interface User extends PoolAble{

    void print();
    void setSetting(Setting setting);
    Setting getSetting();

}
