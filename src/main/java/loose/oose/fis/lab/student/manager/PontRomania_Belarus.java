package loose.oose.fis.lab.student.manager;

import java.util.Random;
class PontRomania_Belarus {
    public static void main(String[] args) {
        Random rand=new Random();

        if(rand.nextInt(10)<6)
        {
            System.out.println("3 puncte pt tricolori");
        }
        else
        {
            System.out.println("ne vedem in 2026");
        }
    }
}
