package mediatheque;

public class CDPrinter extends  ItemPrinter{

    @Override
    public void visite(Book book) { }

    @Override
    public void visite(CD cd) { cd.print(); }

}