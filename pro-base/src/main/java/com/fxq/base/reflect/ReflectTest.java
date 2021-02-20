package com.fxq.base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class<Phone> phoneClass = Phone.class;
            Constructor<Phone> constructor = null;
            constructor = phoneClass.getDeclaredConstructor(String.class, Double.class, String.class, Date.class);
            Phone phone = constructor.newInstance("小米", 9999.0, "红色", new Date());
            System.out.println(phone);
            Field[] fields = phoneClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }
            Method[] declaredMethods = phoneClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                System.out.println(method.getName());
                if ("show".equals(method.getName())) {
                    method.invoke(phone);
                }else if("getPhoneInfo".equals(method.getName())){
                    method.setAccessible(true);
                    String res = (String) method.invoke(phone);
                    System.out.println(res);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
