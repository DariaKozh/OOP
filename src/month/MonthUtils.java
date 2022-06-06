package month;

public class MonthUtils {

    private static final Month[] MONTH_ARRAY = {
            new Month("Jan", 31, 21),
            new Month("Feb", 28, 20),
            new Month("Mar", 31, 23),
            new Month("Apr", 30, 22),
            new Month("May", 31, 21),
            new Month("Jun", 30, 22),
            new Month("Jul", 31, 22),
            new Month("Aug", 31, 22),
            new Month("Sep", 30, 22),
            new Month("Oct", 31, 21),
            new Month("Nov", 30, 22),
            new Month("Dec", 31, 23)
    };

    public static final Month getMonth(int index) {
        return MONTH_ARRAY[index];
    }

    public static final Month[] getQuarter1() {
        Month[] quarter1 = {getMonth(0), getMonth(1), getMonth(2)};
        return quarter1;
    }

    public static final Month[] getQuarter2() {
        Month[] quarter2 = {getMonth(3), getMonth(4), getMonth(5)};
        return quarter2;
    }

    public static final Month[] getQuarter3() {
        Month[] quarter3 = {getMonth(6), getMonth(7), getMonth(8)};
        return quarter3;
    }

    public static final Month[] getQuarter4() {
        Month[] quarter4 = {getMonth(9), getMonth(10), getMonth(11)};
        return quarter4;
    }

    public static final Month[] getHalfYear1() {
        Month[] halfYear = new Month[6];
        for (int i = 0; i < 6; i++) {
            halfYear[i] = getMonth(i);
        }
        return halfYear;
    }

    public static final Month[] getHalfYear2() {
        Month[] halfYear = new Month[6];
        for (int i = 0; i < 6; i++) {
            halfYear[i] = getMonth(i + 6);
        }
        return halfYear;
    }

    public static final Month[] getYear() {
        return MONTH_ARRAY;
    }


    public static final int getMonthSize() {
        return MONTH_ARRAY.length;
    }
}
