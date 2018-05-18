public class Plateau {
    private int x_upper_right_coordinate, y_upper_right_coordinate;
    private int x_bottom_left_coordinate, y_bottom_left_coordinate;
    private int current_x_coordinate, current_y_coordinate;
    char direction;

    public Plateau(int x_upper_right_coordinate, int y_upper_right_coordinate, int x_bottom_left_coordinate, int y_bottom_left_coordinate, int current_x_coordinate, int current_y_coordinate, char direction) {
        this.x_upper_right_coordinate = x_upper_right_coordinate;
        this.y_upper_right_coordinate = y_upper_right_coordinate;
        this.x_bottom_left_coordinate = x_bottom_left_coordinate;
        this.y_bottom_left_coordinate = y_bottom_left_coordinate;
        this.current_x_coordinate = current_x_coordinate;
        this.current_y_coordinate = current_y_coordinate;
        this.direction = direction;
    }

    public boolean checkPlateauLimit() {
        if ((this.current_x_coordinate > x_upper_right_coordinate) || (this.current_y_coordinate > y_upper_right_coordinate)
                || (this.current_x_coordinate < x_bottom_left_coordinate) || (this.current_y_coordinate < x_bottom_left_coordinate))
            return false;
        else
            return true;

    }
}
