package mediatheque;

public class printOnlyCDs implements MediathequeVisitor{
	public void visit(Book book){

	} ; 
    public void visit(CD cd){
		
	} ; 
    public void printOnlyCDs() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}
}
