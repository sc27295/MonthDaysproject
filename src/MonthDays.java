/**
 * @author Siam-Al-mer Chowdhury
 * CSC 201-004N
 * Assignment 2
 * Problem 3.11
 * Write a program  that  prompts the user to enter the month and year and displays the number of days in the month

 ***** BEGIN LICENSE BLOCK *****
Version: MPL 1.1/GPL 2.0/LGPL 2.1
The contents of this file are subject to the Mozilla Public License Version
1.1 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at
http://www.mozilla.org/MPL/
Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the
License.
The Initial Developer of the Original Code is
Tushar Balarajan.
Portions created by the Initial Developer are Copyright (C) 2017
the Initial Developer. All Rights Reserved.
Contributor(s):
Alternatively, the contents of this file may be used under the terms of
either the GNU General Public License Version 2 or later (the "GPL"), or
the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
in which case the provisions of the GPL or the LGPL are applicable instead
of those above. If you wish to allow use of your version of this file only
under the terms of either the GPL or the LGPL, and not to allow others to
use your version of this file under the terms of the MPL, indicate your
decision by deleting the provisions above and replace them with the notice
and other provisions required by the GPL or the LGPL. If you do not delete
the provisions above, a recipient may use your version of this file under
the terms of any one of the MPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK ******/
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //getting month
        System.out.print("Hello, I'm going to tell the number of days in the month and year you selected.");

        System.out.println("Enter month?");
        int month = keyboard.nextInt();

        int days = 0;
        //getting year
        System.out.println("Enter a year?");
        int year = keyboard.nextInt();
        //finding leap year
        boolean Leapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //finding month days

        switch (month) {
            case 1: days=31;
            break;
            case 2: if (Leapyear) days=29;
            else days=28; break;
            case 3: days=31; break;
            case 4: days=30;break;
            case 5: days=31;break;
            case 6: days=30;break;
            case 7: days=31;break;
            case 8: days=31;break;
            case 9: days=30;break;
            case 10: days=31;break;
            case 11: days=30;break;
            case 12: days=31;break;
            default:
        }
        System.out.println(month+""+year+" had "+days+" days ");
    }
}