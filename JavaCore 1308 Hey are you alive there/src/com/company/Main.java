package com.company;

/*

1308 Эй, ты там живой?
1. Создай интерфейс Person.
2. Добавь в него метод isAlive(), который проверяет, жив человек или нет.
3. Подумай, какой тип должен возвращать этот метод.
4. Создай интерфейс Presentable.
5. Унаследуй интерфейс Presentable от интерфейса Person.

Требования:
1. В классе Solution должен быть объявлен интерфейс Person.
2. В классе Solution должен быть объявлен интерфейс Presentable.
3. Интерфейс Presentable должен наследоваться от интерфейса Person.
4. В интерфейсе Person должен быть объявлен метод isAlive.
5. Тип возвращаемого значения метода isAlive может иметь только два значения.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    }
    interface Person {
        Boolean isAlive();
    }
    interface Presentable extends Person {

    }
}


