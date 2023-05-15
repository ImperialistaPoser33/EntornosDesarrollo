public class Covid {
    public static String covid(float bodyTemperature, boolean difficultyBreathing, boolean diabetes, boolean cancer, boolean isPregnant, boolean isOver60yearsold, boolean hepatic, boolean kidnevDisease, boolean respiratoryDisease, String provincia){
        boolean sickness = diabetes || cancer || isPregnant || isOver60yearsold || hepatic || kidnevDisease || respiratoryDisease;
        if(bodyTemperature>=38 && difficultyBreathing){
            if(sickness) return "/diagnostico/"+provincia;
        }
        if(bodyTemperature>=38){
            if(sickness) return "/diagnostico/"+provincia;
            else return "/cuarentena/";
        }
        else return "/diagnostico_bueno/";
    }
}
