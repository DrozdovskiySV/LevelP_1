package lesson6.task3;

public class ProductPriceFilter extends BaseFilter {
    @Override
    public boolean filter(Object object) {
        if (!(object instanceof Product))  return false;
        Product product = (Product) object;

        return product.getPrice() > 100 ;
    }
}
