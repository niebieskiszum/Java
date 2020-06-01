public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(TryCatch.podzielic(11, 6));
        } catch(NullPointerException e) {
            System.out.println(e);
            e.fillInStackTrace();
        } catch (NieMoznaPodzielicWyjatek e) {
            System.out.println(e);
            e.fillInStackTrace();
        }
    }
}
