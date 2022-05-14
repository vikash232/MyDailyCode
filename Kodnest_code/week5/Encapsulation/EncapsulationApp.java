class TextBook {
    int pageno ;
}
class EncapsulationApp{
    public static void main(String[] args){
        TextBook tb = new TextBook();
        tb.pageno = 100;
        System.out.println(tb.pageno);
    }
}