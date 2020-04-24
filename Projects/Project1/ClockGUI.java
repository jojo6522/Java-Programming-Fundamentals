import java.awt.GridLayout;
import java.awt.List;
import javax.swing.*;

public class ClockGUI {

        /**
         * This is a method to show the sorted clock and unsorted clock
         * in a grid layout
         */
        public void showBothClocksInGridLayout(Clock[] clockNaturalOrder, Clock[] clockSortedOrder, int clockCounter) {

            //Creating frame
            JFrame FrameClock= new JFrame();

            //Store unsoredArray
            List unsortedList=new List(clockCounter);

            //Store sorted array
            List sortedList=new List(clockCounter);

            //Creating panel
            JPanel panel = new JPanel(new GridLayout(5, 4, 10, 15));

            //Add panel to frame
            panel.add(new JLabel("Left column:Unsorted "));
            panel.add(new JLabel("Right column:Sorted "));
            FrameClock.add(panel);

            /**
             * Adds each item in the unsorted and sorted list from
             * the arrays clockNaturalOrder and clockSortedOrder
             */        for(int i=0;i<clockCounter;i++) {

                unsortedList.add(clockNaturalOrder[i].toString());

                sortedList.add(clockSortedOrder[i].toString());
            }

            //Add unsorted list to frame
            FrameClock.add(unsortedList);

            //Add sorted list to frame
            FrameClock.add(sortedList);

            //Display frame size
            FrameClock.setSize(400,400);

            /**
             * Setting Frame to be 1x2 layout grid of
             * separate columns
             */
            FrameClock.setLayout(new GridLayout(1,2));

            //Makes frame Visible
            FrameClock.setVisible(true);

            //Exit JFrame
            FrameClock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

