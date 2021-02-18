# Практична робота "Створення і використання статичних методів"
## Знайти всі дільники заданого шестизначного числа (метод Calculate має повернути рядок - список таких чисел через кому)

### Код Calculate.java
```java
package domain;

/**
 * Клас який представляє завдання
 * @author Kostya0777
 */
public class Exercise {
    
    /**
     * Повертає всі дільники числа
     * @param number число
     * @return рядок дільників через кому
     */
    public static String Calculate(int number) {
        String res = "";
        
        if ((String.valueOf(Math.abs(number)).length() != 6) || number < 0) {
            return "number incorrect";
            }
        
        
        for (int i = 1; i <= number; i++) {
        if(0 == (number % i))
            res += i + ",";
        }
        return res;
}
    
}

```
### Код TestResult.java
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int i = 111111;
        System.out.printf("All divisors of number %d: %s", i, Exercise.Calculate(i));
        
    }
}


```


[![netbeans64-TAFtp-NRn-No.png](https://i.postimg.cc/1zzV06WH/netbeans64-TAFtp-NRn-No.png)](https://postimg.cc/qN974tHh)
[![netbeans64-Xkmmvh76-Ia.png](https://i.postimg.cc/G2wr3nsy/netbeans64-Xkmmvh76-Ia.png)](https://postimg.cc/d7BgnX6s)