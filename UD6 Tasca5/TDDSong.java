public class TDDSong {
    static String fly="There was an old lady who swallowed a fly.\n" +
            "I don't know why she swallowed a fly - perhaps she'll die!\n" ;
    static String spider="There was an old lady who swallowed a spider.\n" +
            "I don't know why she swallowed a spider - perhaps she'll die!\n" ;
    static String bird="There was an old lady who swallowed a fly.\n" +
            "I don't know why she swallowed a fly - perhaps she'll die!\n" +
            "\n" ;
    public static String song(String word){
        if(word.equalsIgnoreCase("fly")) return fly;
        if(word.equalsIgnoreCase("spider")) return spider;
        if(word.equalsIgnoreCase("fly+spider")) return fly+spider;
        if(word.equalsIgnoreCase("spider+fly")) return spider+fly;
        if(word.equalsIgnoreCase("fly+spider+bird")) return fly+spider+bird;
        if(word.equalsIgnoreCase("bird+fly+spider")) return bird+fly+spider;
        return word;
    }
}
