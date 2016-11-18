package com.qy.just4u.utils.collectionutil;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序工具类
 * Created by abc on 2016/11/18.
 */

public class SortUtil {
    public static <T> void sortList(List<T> data, final String sortKey) {
        if (data == null || data.size() == 0 || data.size() == 1) {
            return;
        }

        Collections.sort(data, new Comparator<T>() {
            @Override
            public int compare(T lhs, T rhs) {
                Class<?> tClass = lhs.getClass();
                try {
                    Field field = tClass.getDeclaredField(sortKey);
                    field.setAccessible(true);
                    field.get(lhs);
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                return 0;
            }
        });
    }
}
