package com.brillio.AssesmentQ2;

public class sqlQuery {

    public String[] getTables(String querystring) {
        int fi = querystring.indexOf("from") + 4;
        int to;
        if (querystring.contains("where")) {
            to = querystring.indexOf("where");
        } else if (querystring.contains("order by")) {
            to = querystring.indexOf("order by");
        } else if (querystring.contains("group by")) {
            to = querystring.indexOf("group by");
        } else {
            to = querystring.length();
        }
        return querystring.substring(fi, to).split(",");
    }

    public String[] getConditions(String queryString) {
        String result[] = null;
        String res;
        if (queryString.contains("where")) {
            res = queryString.split("where")[1].trim().split("group by")[0].trim().split("order by")[0].trim().toLowerCase();
            result = res.trim().split(" and | or ");
        }
        return result;
    }

}
