package model.filter;

import java.time.LocalDateTime;

abstract  class Filter {
    public abstract String buildQuery();
}

public class UserFilter extends Filter{
    private String userName;
    private LocalDateTime from;
    private LocalDateTime to;

    private String email;
    private int page;
    private int size;

    public UserFilter(String userName, LocalDateTime from, LocalDateTime to) {
        this.userName = userName;
        this.from = from;
        this.to = to;
    }

    public String buildQuery(){
        String query = "";
        if(this.userName != null){
            query += " AND user_name like " + this.userName + "% ";
        }

        if(this.from != null){
            query += " AND from >= "+ this.from;
        }

        if(this.to != null){
            query += " AND to <= " + this.to;
        }

        if(this.email != null){
            query += " AND email like " + this.email +"%";
        }

        if(this.page >= 0){
            int offset = this.page * this.size;
            int limit = this.size;
            query += " LIMIT " + limit + " OFFSET " + offset;
        }

        return query;
    }








}
