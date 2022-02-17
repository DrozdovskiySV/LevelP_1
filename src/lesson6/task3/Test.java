package lesson6.task3;

public class Test {
    public static void main(String[] args) {
        Product[] arr = {
                new Product("Product1","Model1",50d),
                new Product("Product1","Model1",80d),
                new Product("Product1","Model1",100d),
                new Product("Product1","Model1",150d),
                new Product("Product1","Model1",250d),
                new Product("Product1","Model1",350d),
                new Product("Product1","Model1",450d)
        }; // массив продуктов, который мы будем фильтровать

        FilterService filterService = new FilterService(); // содержит метод фильтрации массива
        BaseFilter baseFilter = new ProductPriceFilter(); // кладем в baseFilter наследника
        Object[] filterArray = filterService.filterArray(arr, baseFilter);

        for (int i = 0; i < filterArray.length; i++) {
            if (filterArray[i] != null)
                System.out.println(filterArray[i].toString());
        }
    }
}
