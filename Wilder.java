public class Wilder {

    private String firstname = "";
    boolean aware = false;

    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public Boolean getAware(){
        return this.aware;
    }

    public String whoAmI(){
        if(this.getAware()){
            return "Je m'appelle "+this.getFirstname()+" et je suis aware";
        } else return "Je m'appelle "+this.getFirstname()+" et je ne suis pas aware";
    }


    public static void main(String[] args) {



    }


}