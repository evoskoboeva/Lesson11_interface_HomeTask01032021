package Task3;

public enum SeasonsOfYear {

    AUTUMN("Autumn - rain, books, picnic", 17),
    SUMMER(" Summer - sea, sun, fruits", 26),
    WINTER(" Winter - cold, tea, summer is coming)) ", 4),
    SPRING(" Spring - everything blooms and comes to life, a surge of strength", 12);

    SeasonsOfYear(String aboutSeason, int averageTemp) {
        this.aboutSeason = aboutSeason;
        this.averageTemp = averageTemp;
    }

    private int averageTemp;
    private String aboutSeason;


    public String getAboutSeason() {
        return this.aboutSeason;
    }

    public int getAverageTemp() {
        return this.averageTemp;
    }


    @Override
    public String toString() {
        return this.aboutSeason + '\'' +
                ", averageTemp=" + this.getAverageTemp();
    }


    public String AboutLikeSeason(SeasonsOfYear like) {
        switch (like) {
            case SUMMER:
                return "i liked summer, becouse"+like;
            //break;
            case AUTUMN:
                return "i liked autumn, becouse"+like;
            //break;
            case WINTER:
                return "i liked winter, becouse"+like;
              //  break;
            case SPRING:
                return "i liked spring, becouse"+like;
            //break;

            default:
                throw new IllegalStateException("Unexpected value");
        }
        //return null;
    }
}

