Write a shell script to generate marksheet of a student. Take 3 subjects, calculate and display total marks, percentage and Class obtained by the student.

echo "Enter marks(out of 30) of "
read -p "Subject 1: " s1
read -p "Subject 2: " s2
read -p "Subject 3: " s3
sum=`expr $s1 + $s2 + $s3`
echo "Sum of marks of 3 subjects is : "$sum
per=`expr $sum \* 10 / 9`
echo "Percentage: "$per
if [ $per -ge 60 ]
then
        echo "you got Distinction"
elif [ $per -ge 50 ]
then
        echo "you got First class"
elif [ $per -ge 40 ]
then
        echo "You got second class"
else
        echo "sorry you failed! better luck next time"
fi


Write a shell script to find factorial of given number n.
fact=1
read -p "Enter a number to find its factorial : " n
 
#if entered value is less than 0
if [ $n -le 0 ]
then
        echo "invalid number"
        exit
fi
#logic for finding factorial
a=$n
while [ $a -ge 1 ]
do
        fact=`expr $fact \* $a`
        a=`expr $a - 1`
done
echo "Factorial of $n is $fact"


Write a shell script which will accept a number and display first n prime numbers as output.
read -p "Enter the value of n (or range) " n
echo "The prime numbers are: "
m=2
while [ $m -le $n ]
do
        i=2
        flag=0
        while [ $i -le `expr $m / 2` ]
        do
                if [ `expr $m % $i` -eq 0 ]
                then
                        flag=1
                        break
                fi
                i=`expr $i + 1`
        done
        if [ $flag -eq 0 ]
        then
                echo $m
        fi
        m=`expr $m + 1`
done


Write a shell script which will generates first n fibonacci numbers like: 1, 1, 2, 3, 5, 13,…
read -p "Enter the value of n (number): " n
x=0
y=1
i=2
echo "Fibonacci Series up to $n terms is : "
echo "$x"
echo "$y"
while [ $i -lt $n ]
do
        i=`expr $i + 1`
        z=`expr $x + $y`
        echo "$z"
        x=$y
        y=$z
done



Write a menu driven shell script which will print the following menu and execute the given task. MENU
1) Display calendar of current month
2) Display today’s date and time
3) Display usernames those are currently logged in the system
4) Display your name at given x, y position
5) Display your terminal number
6) Exit

i=0
while [ $i != 6 ]
do
echo "Menu
1. Display calender of current Month
2. Display today's date and time
3. Display usernames of those who are currently logged in the ststem
4. Display your name at given x, y position
5. Display Terminal Number
6. Exit
Choose your option and enter corresponding value"
 
        read i
        case "$i" in
                1) calender="$(cal)"
                        echo "Here is your Calender "
                        echo "$calender"
                        ;;
                2) current="$(date)"
                        echo "Current Date and Time is " "$current"
                        ;;
                3) username="$(whoami)"
                        echo "Currently logged in users : "
                        echo $username
                        ;;
                4)                         
                        ;;
                5) 
                        ;;
esac
done  




Write a shell script to read n numbers as command arguments and sort them in descending order.

read -p "Enter the number of values you want to sort "  n
for((i=0; i<$n; i++))
do
        read -p "Enter value of arr[$i]: " arr[$i]
done
#sorting code
for((i=0; i<$n; i++))
do
        for((j=0; j<n-i-1; j++))
        do
                if [ ${arr[j]} -lt ${arr[$((j+1))]} ]
                then
                        #swapping
                        temp=${arr[j]}
                        arr[$j]=${arr[$((j+1))]}
                        arr[$((j+1))]=$temp
                fi
        done
done
 
echo "Numbers sorted in descending order as"
echo ${arr[*]}


Write a shell script to display all executable files, directories and zero sized files from current directory.

echo "Executable files"
files="$(find lab_solutions -executable -type f)"
echo "$files"
echo
echo "List of Directories"
dir="$(ls -d */)"
echo "$dir"
echo
echo "List of zero sized files"
zero="$(find -size 0)"
echo "$zero"


Write a shell script to check entered string is palindrome or not.

echo "Enter the string to check: "
read str
len=`echo $str | wc -c`
len=`expr $len - 1`
i=1
j=`expr $len / 2`
while test $i -le $j
do
        k=`echo $str | cut -c $i`
        l=`echo $str | cut -c $len`
        if test $k != $l
        then
                echo "String is not Palindrome"
                exit
        fi
        i=`expr $i + 1`
        len=`expr $len - 1`
done
echo "String is Palindrome" 



Write a shell script to validate the entered date. (eg. Date format is : dd-mm-yyyy).

echo "Date validator"
#Initializing values of date, month and year
dd=0
mm=0
yy=0
 
#initializing no of days in a month
days=0
 
read -p "Enter day (dd) : " dd
read -p "Enter Month (mm) : " mm
read -p "Enter Year (yyyy) : " yy
 
#checking for invalid month
if [ $mm -le 0 -o $mm -gt 12 ]
then
        echo "$mm is invalid month. "
        exit 1
fi
 
#finding out no. of days in a month
case $mm in
        1 | 3 | 5 | 7 | 8 | 10 | 12)
                days=31
                ;;
        2)
                days=28
                ;;
        4 | 6 | 9 | 11)
                days=30
                ;;
        *)
                days=-1
                ;;
esac
 
#checking for leap year
if [ $mm -eq 2 ]
then
        a=`expr $yy % 4`
        b=`expr $yy % 100`
        c=`expr $yy % 400`
 
        if [ $a -eq 0 -a $b -ne 0 -o $c -eq 0 ]
        then
                days=29
        else
                break
        fi
fi
 
if [ $dd -le 0 -o $dd -gt $days ]
then
        echo "$dd day is invalid "
        exit 3
fi
 
#No error means date is valid
echo "$dd/$mm/$yy is a Valid Date"


Write an awk program using function, which convert each word in a given text into capital.

read -p "Enter a lowercase String : " string
echo "Resultant Upercase string is : "
echo "$string" | awk '{print toupper($0)}'


Write a program for process creation using C. (Use of gcc compiler)
#include <stddef.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
 
/* Execute the command using this shell program.  */
#define SHELL "/bin/sh"
 
int
my_system (const char *command)
{
        int status;
        pid_t pid;
 
        pid = fork ();
        if (pid == 0)
        {
                /* This is the child process.  Execute the shell command. */
                execl (SHELL, SHELL, "-c", command, NULL);
                _exit (EXIT_FAILURE):
        }
        else if (pid < 0 )
                //the fork failed. Report failure
                status = -1;
        else
                // this is the parent process. It waits for the child process to complete
                if (waitpid (pid, &status, 0) != pid)
                        status = -1;
        return status;
}


Write a shell script to display multiplication table of given a number.

echo "Multiplication Table "
read -p "Enter the number : " n
i=0
for((i=1;i<11;i++))
do
        echo "$n X $i = " "`expr $n \* $i`"
done
 
