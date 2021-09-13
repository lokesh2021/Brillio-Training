package com.brillio.AssesmentQ2;

import java.util.Arrays;

public class SqlDemo {
    public static void main(String[] args) throws Exception {
        sqlQuery sq = new sqlQuery();

        String query = "Select * from table1, table2, table3 where table1.id = 1 order by table3.sid, table2.sid";
        Arrays.stream(sq.getTables(query)).forEach(System.out::println);

        query = "Select * from table1, table2 where table1.sid = table2.sid";
        Arrays.stream(sq.getConditions(query)).forEach(System.out::println);
    }
}
