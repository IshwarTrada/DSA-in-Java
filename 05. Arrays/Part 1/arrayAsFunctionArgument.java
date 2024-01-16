// Topic 2 : Arrays as Functions Arguments

// Array always pass as by reference
// due to that if we pass our array to other function 
// and if we do any operation on that then that changes 
// also reflect in our main function
// whereas our variable is pass as by value 
// so if we pass the variable as argument to another function 
// and if we change the value of the variable 
// then this changes will not reflect on main function.

public class arrayAsFunctionArgument {
    public static void update(int marks[],int nonChangeable) {
        nonChangeable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int nonChangeable = 5;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);
        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
