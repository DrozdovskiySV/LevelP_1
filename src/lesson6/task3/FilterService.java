package lesson6.task3;

public class FilterService {
    public Object[] filterArray(Object[] oldArr, BaseFilter baseFilter) {
        Object[] newArr = new Object[oldArr.length];
        int ind = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (baseFilter.filter(oldArr[i])) {
                newArr[ind++] = oldArr [i];
            }
        }
        return newArr;
    }
}
