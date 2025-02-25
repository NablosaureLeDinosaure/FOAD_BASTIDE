package mediatheque;

public interface ItemVisitor {
    public void visite (CD cd) ;
    public void visite (Book book) ;
}