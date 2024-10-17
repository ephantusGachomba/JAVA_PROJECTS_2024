import java.util.Scanner;

class TimeInWords{

    static String[] numWords = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
        "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", 
        "twenty seven", "twenty eight", "twenty nine"
    };
    public static String getTimeInWords(int hour, int min){
        if (min == 0){
            return numWords[hour] + " o' clock";
        }
        
        else if (min > 0 && min <= 30){
            if (min == 15){
                return "quarter past " + numWords[hour];
            }
            else if (min == 30){
                return "half past " + numWords[hour];
            }
            else{
                return numWords[min] + (min == 1 ? "minute" : "minutes") + " past " + numWords[hour];
            }
        }

        else{
            if (min == 45){
                return "quarter to " + numWords[hour + 1];
            }
            else{
                return numWords[60 - min] + (min == 1 ? "minute" : "minutes") +" to " + numWords[hour + 1];
            }
        }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour, min;

        //get input
        System.out.print("Enter Hour-->");
        hour = scanner.nextInt();
        System.out.print("Enter the Minutes-->");
        min = scanner.nextInt();

        if(hour < 1 || hour > 12){
            System.out.print("Invalid hour time.");
            return;
        }
        if(min < 0 || min > 60){
            System.out.print("Invalid minute time.");
            return;
        }

        
        String timeInWords = getTimeInWords(hour, min);
        System.out.println(timeInWords);
    }
}