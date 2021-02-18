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