Question: 14 **Problem: Time Converter**

You are developing a time tracking application for a company. The employees log their time in minutes. The management wants to see these durations in hours for better understanding. Your task is to write a function that can convert minutes into hours.

**Function:**

public static double convertToHours(int minutes);

**Inputs:**

The function convertToHours(int minutes) will receive one parameter:

- minutes (1 ≤ minutes ≤ 10^6): an integer which represents the number of minutes to be converted.

**Outputs:**

The function will return a double - the equivalent number of hours.

**Example:**

**Sample Input:**

convertToHours(90);

**Sample Output:**

1.5

**Note:**

In the sample input, the number of minutes given to the function is 90. The equivalent in hours is 90/60=1.5, so the function returns 1.5 as the output. Your function should work accurately to provide correct information to the management.