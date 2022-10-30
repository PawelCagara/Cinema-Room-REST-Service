package cinema;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int total_rows;
    private int total_columns;
    private List<Seat> available_seats;
    @JsonIgnore
    private List<Ordered> orderedSeats;
    public Room(int total_rows, int total_columns) {
        this.total_rows = total_rows;
        this.total_columns = total_columns;
        this.available_seats = initRoom(total_rows, total_columns);
        this.orderedSeats = new ArrayList<>();
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public void setTotal_rows(int total_rows) {
        this.total_rows = total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public void setTotal_columns(int total_columns) {
        this.total_columns = total_columns;
    }

    public List<Seat> getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(List<Seat> available_seats) {
        this.available_seats = available_seats;
    }

    public List<Ordered> getOrderedSeats() {
        return orderedSeats;
    }

    public void setOrderedSeats(List<Ordered> orderedSeats) {
        this.orderedSeats = orderedSeats;
    }

    private List<Seat> initRoom(int rows, int cols) {
        List<Seat> seats = new ArrayList<>();
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                seats.add(new Seat(row, col));
            }
        }
        return seats;
    }
}