package mediatheque;

public class printOnlyBook implements MediathequeVisitor {
    public void visit(Book book){

    } ; 
    public void visit(CD cd){
        
    } ; 
    public void printOnlyBooks() {
		throw new UnsupportedOperationException("Not supported yet."); 
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
	}
    
}
