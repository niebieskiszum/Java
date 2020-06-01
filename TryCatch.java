public class TryCatch {
    public static int podzielic(Integer a, Integer b) throws NieMoznaPodzielicWyjatek {
        if(a % b == 0)
            return a / b;
        else
            throw new NieMoznaPodzielicWyjatek("Nie można podzielić a przez b!");
    }
}
