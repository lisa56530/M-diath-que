package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printOnlyBooks() {
		printOnlyBook printBookVisitor = new printOnlyBook();
        for (Item item : items) {
            item.accept(printBookVisitor);
        }
	}

	public void printOnlyCDs() {
		printOnlyCDs printOnlyCDs = new printOnlyCDs() ; 
        for (Item item : items) {
            item.accept(printOnlyCDs) ;
        }
	}

	public void printCatalog() {
        for (Item i : items)
            i.print();
    }

	


}