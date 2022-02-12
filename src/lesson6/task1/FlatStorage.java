package lesson6.task1;

public class FlatStorage {

    private Flat[] flats;

    public FlatStorage(Flat[] flats) {
        this.flats = flats;
    }

    public boolean exist(Flat flat) {
        for (Flat item: flats) {
            if (item != null) {
                if (item.hashCode() == flat.hashCode() && item.equals(flat)) {
                    return true;
                }
            }
        }
        return false;
    }



}
