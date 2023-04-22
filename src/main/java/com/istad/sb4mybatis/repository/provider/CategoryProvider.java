package com.istad.sb4mybatis.repository.provider;

import org.apache.ibatis.jdbc.SQL;

public class CategoryProvider {
    public String buildInsertSql(){
        return new SQL(){{
            INSERT_INTO("categories");
            VALUES("name","#{cate.name}");
        }}.toString();
    }
    public String buildSelectSql(){
        return new SQL(){{
            SELECT("*");
            FROM("categories");
        }}.toString();
    }

    public String buildSelectByID(){
        return new SQL(){{
            SELECT("id");
            FROM("categories");
        }}.toString();
    }
    public String buildDeleteByID(){
        return new  SQL(){{
            DELETE_FROM("categories");
            WHERE("id=#{id}");

        }}.toString();
    }
    public String buildUpdateByID(){
        return new SQL(){{
            UPDATE("categories");
            SET("name=#{cate.name}");
            WHERE("id=#{id}");
        }}.toString();
    }
}
