public class Date {
int day, month;

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public Date(){
        this.day = (int)(Math.random()*31)+1;
        this.month = 5;
    }

    public double getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public static String getMonthName(int month) {
        String nameOfMonth = null;
        switch(month){
            case 1: nameOfMonth = "January";
                break;
            case 2: nameOfMonth = "Febuary";
                break;
            case 3: nameOfMonth = "March";
                break;
            case 4: nameOfMonth = "April";
                break;
            case 5: nameOfMonth = "May";
                break;
            case 6: nameOfMonth = "June";
                break;
            case 7: nameOfMonth = "July";
                break;
            case 8: nameOfMonth = "August";
                break;
            case 10: nameOfMonth = "September";
                break;
            case 11: nameOfMonth = "October";
                break;
            case 12: nameOfMonth = "November";
                break;
            case 13: nameOfMonth = "December";
        }
        return  nameOfMonth;
    }

    public boolean checkDate(Date[] dates, Object obj){
        if(obj instanceof Date) {
            Date d = (Date) obj;
            for(int i = 0; i < dates.length; i++){
                if(dates[i].equals(d)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj){
        if(obj instanceof Date) {
            Date d = (Date) obj;
            if (this.day == d.day && this.month == d.month){
                return true;
            }
        }
        return false;
    }

    public int compareTo(Object obj){
        if(obj instanceof Date){
            Date d = (Date) obj;
            Integer tDay = this.day;
            Integer oDay = d.day;
            return tDay.toString().compareTo(oDay.toString());
        }
        return -5;
    }

    public String toString(){
        String s = "Month: " + getMonthName(month);
        s += " Day: " + day;
        return s;
    }
}
