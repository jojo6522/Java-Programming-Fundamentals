import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project2 {
    //main method
    public static void main(String[] args) {


        SortedClockList sortedClockListObject = new SortedClockList();
        UnsortedClockList unsortedClockList = new UnsortedClockList();


        File file = new File("/Users/jordonjohnson/Clock/src/input.txt");


        try {

            Scanner scanner = new Scanner(file);


            while (scanner.hasNext()) {

                String line = scanner.nextLine();
                System.out.println(line);


                String clocks[] = line.split(":");

                if (clocks.length == 3) {

                    int hour = Integer.parseInt(clocks[0].trim());
                    int minute = Integer.parseInt(clocks[1].trim());
                    int second = Integer.parseInt(clocks[2].trim());
                    System.out.println(hour + " \t " + minute + "\t" + second);


                    Clock clockObject = new Clock(hour, minute, second);


                    sortedClockListObject.add(clockObject);
                    unsortedClockList.add(clockObject);
                }

                if (clocks.length == 2) {

                    int hour = Integer.parseInt(clocks[0].trim());
                    int minute = Integer.parseInt(clocks[1].trim());
                    int second = 0;
                    System.out.println(hour + " \t " + minute + "\t" + second);


                    Clock clockObject = new Clock(hour, minute, 0);


                    sortedClockListObject.add(clockObject);
                    unsortedClockList.add(clockObject);
                }

                if (clocks.length == 1) {

                    int hour = Integer.parseInt(clocks[0].trim());
                    int minute = 0;
                    int second = 0;

                    System.out.println(hour + " \t " + minute + "\t" + second);
                    ;


                    Clock clockObject = new Clock(hour, 0, 0);


                    sortedClockListObject.add(clockObject);
                    unsortedClockList.add(clockObject);
                }


            }


            new ClockGUI(sortedClockListObject, unsortedClockList);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch(Exception e)
            {

                System.out.println("Invalid file format!");
            }
        }
    }






public class Clock {

    private int hours, minutes, seconds;

    public Clock(int h, int min, int sec)
    {
        hours = h;
        minutes = min;
        seconds = sec;

    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String toString()
    {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
    
    public class ClockNode {

    // local variables

    protected Clock data;
    protected ClockNode next;

    // a one argument constructor

    public ClockNode( Clock c)
    {
        data = c;
        next = null;
    }


public abstract class ClockList {
    // declare local variables

    protected ClockNode head, last;
    protected int size_of_list;

    public ClockList() {
        head = last = new ClockNode(null);
        size_of_list = 0;
    }

    // implement method to test if the linked list is empty
    public boolean isEmpty() {
        if (size_of_list == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void append(Clock d) {
        last.next = new ClockNode(d);
        last = last.next;
        size_of_list++;
    }


}


public class UnsortedClockList extends ClockList
{

        public UnsortedClockList(){
            super();
        }

        public void add(Clock unsortedClock)
        {
            append(unsortedClock);
        }
}


public class SortedClockList extends ClockList {
    //Constructor
    public SortedClockList()
    {
        //call variables though super keyWord
        super();
    }
    //implement the method add()
    public void add(Clock clock)
    {
        //define the head for the previous and current nodes in the liked list
        ClockNode prev = head,
                curr = head.next;

        //define the nodes
        ClockNode node = new ClockNode(clock);

        //Using while loop
        while(curr != null )
        {
            //set previous node as current node
            prev = curr;
            //set current node as next node
            curr = curr.next;
        }
        //set node to next is current node
        node.next = curr;
        //previous to next is node
        prev.next = node;
        //If node to next value is null
        if(node.next == null)
        {
            //set that is as last node
            last = node;
            //increment the node
            size_of_list++;
        }
    }
}


import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class ClockGUI extends JFrame
{


    public ClockGUI(SortedClockList sortedClockList,
                     UnsortedClockList unsortedClockList)
    {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(1, 2, 10, 10));


        JTextArea left = new JTextArea();

        left.setEditable(false);
        String clock = "UNSORTED LIST OF CLOCKS\n\n";
        clock+=unsortedClockList.toString();


        left.setText(clock);


        add(left);


        JTextArea right = new JTextArea();
        right.setEditable(false);
        clock = "SORTED LIST OF Clocks\n\n";
        clock+=sortedClockList.toString();
        right.setText(clock);
        add(right);
        setVisible(true);

        pack();
    }
}
