# Tasks:

#### 1. Basic switch.

Update the program so that it prints "default", using switch statement:

     public class BasicSwitch {
        public static void main(String[] args) {
            int a = 20;
            switch (a) {
                default:
                    System.out.println("default");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
            }
        }
    }

#### 2. Basic switch breaks.

Update the program so that it prints "twenty", using switch statement:

     public class BasicSwitch {
        public static void main(String[] args) {
            int a = 20;
            switch (a) {
                default:
                    System.out.println("default");
                case 7:
                    System.out.println("seven");
                case 10:
                    System.out.println("ten");
                case 20:
                    System.out.println("twenty");
            }
        }
    }

#### 3. Switch days in month printer.

Rewrite [7. Days in month printer.](https://autocode-next.lab.epam.com/courses/189/structure/tasks/3503)  from task 3
with
switch :

     public class SwitchDaysInMonthPrinter {
        public void amountOfDays(int month) {
        }
     }

#### 4. Range numbers printer.

Create that will be printing if number is between 1 and 5("number is between 1 and 5"), 6 and
10("number is between 6 and 10") or "out of range" using switch statement. Number to be defined will be passed to method
arguments:

        public class RangeNumbersPrinter {
             public void printRange(int number) {
             }
        }

#### 5. Leap year printer.

Create a program to check whether a year is a leap year or not("leap" if true otherwise "not leap").
Year will be passed as argument in method parameter:

        public class LeapYearPrinter {
             public void isLeapYear(int year) {
             }
        }

So what should happen if we do not set break to any of the statements? (self exploring section).
