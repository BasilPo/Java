package com.zodiacsigns;

class ZodiacSigns {
    private static String[] signs = {"Ram", "Bull", "Twins", "Crab", "Lion", "Maiden", "Scales", "Scorpion", "Archer",
            "Mountain Sea-goat", "Water Bearer", "Fish"};
    private static String[] chineseSigns = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
            "Horse", "Goat"};

    private String month;
    private String date;
    private String year;
    private String outSign;
    private String outYear;
    private boolean staffed = false;

    private void setDataFromIn(String in) {
        String[] tmp = in.split("[\\s,]");
        if (tmp.length == 3) {
            month = tmp[0];
            date = tmp[1];
            year = tmp[2];
            staffed = true;
        }
    }

    private boolean verifyData() {
        boolean flag = false;
        if (staffed) {
            boolean validMonth = month.matches("^[A-Za-z]{3,}$");
            boolean validDate = date.matches("^([1-9]|[12][0-9]|3[01])$");
            boolean validYear = year.matches("^(19[0-9][0-9]|20[01][0-9])$");
            flag = validMonth && validDate && validYear;
        }
        return flag;
    }

    private void generateOut() {
        int index;
        int digitDate = Integer.parseInt(date);
        switch (month.toLowerCase()) {
            case "april":
                index = (digitDate < 20) ? 0 : 1;
                break;
            case "may":
                index = (digitDate < 21) ? 1 : 2;
                break;
            case "june":
                index = (digitDate < 21) ? 2 : 3;
                break;
            case "july":
                index = (digitDate < 23) ? 3 : 4;
                break;
            case "august":
                index = (digitDate < 23) ? 4 : 5;
                break;
            case "september":
                index = (digitDate < 23) ? 5 : 6;
                break;
            case "october":
                index = (digitDate < 23) ? 6 : 7;
                break;
            case "november":
                index = (digitDate < 22) ? 7 : 8;
                break;
            case "december":
                index = (digitDate < 22) ? 8 : 9;
                break;
            case "january":
                index = (digitDate < 20) ? 9 : 10;
                break;
            case "february":
                index = (digitDate < 19) ? 10 : 11;
                break;
            case "march":
                index = (digitDate < 21) ? 11 : 0;
                break;
            default:
                index = -1;
        }
        if (index == -1)
            outSign = "Wrong Month";
        else
            outSign = signs[index];

        int index2 = Integer.parseInt(year) % 12;
        outYear = chineseSigns[index2];
    }

    private void printResult() {
        System.out.printf("Sign: %s Year: %s\n", outSign, outYear);
    }

    void solve(String in) {
        setDataFromIn(in);
        if (verifyData()) {
            generateOut();
            printResult();
        } else
            System.out.println("Invalid data entry");
    }
}