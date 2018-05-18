public class Movement {

    char left = 'L';
    char right = 'R';
    char move = 'M';

    char north = 'N';
    char south = 'S';
    char east = 'E';
    char west = 'W';

    String commands;
    Plateau initialise;
    Movement(Plateau initialise, String commands ) {
        this.commands =commands;
        this.commands = commands;
    }

    public int moveRover() {

        char[] command = commands.toCharArray();
        int i=0;

        while(commands.length()!=0) {

            if(initialise.checkPlateauLimit()) {
                if(initialise.direction == 'N') {
                    if(command[i++] == 'L')
                        initialise.direction = 'W';
                    else if(command[i++] == 'R')
                        initialise.direction = 'E';
                    else {

                    }

                }
            }
        }

    }

}
