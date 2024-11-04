package com.example.capstone_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Datum {
    private String dutytel1;
    private String wgs84lat;
    private String wgs84lon;
    private String dutyname;
    private String dutyetc;
    private String dutyaddr;

    public Datum(String dutytel1, String wgs84lat, String wgs84lon, String dutyname, String dutyetc, String dutyaddr) {
        this.dutytel1 = dutytel1;
        this.wgs84lat = wgs84lat;
        this.wgs84lon = wgs84lon;
        this.dutyname = dutyname;
        this.dutyetc = dutyetc;
        this.dutyaddr = dutyaddr;
    }

    public String getWgs84lat() {
        return wgs84lat;
    }

    public String getWgs84lon() {
        return wgs84lon;
    }

    public String getDutyname() {
        return dutyname;
    }

    public String getDutyaddr() {
        return dutyaddr;
    }
}
