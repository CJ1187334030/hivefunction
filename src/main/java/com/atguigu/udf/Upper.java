package com.atguigu.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Upper extends UDF {
    public String evaluate(String s){
        if (s == null)
            s = null;
        return s.toLowerCase();
    }
}
