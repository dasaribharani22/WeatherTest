package com.weather.test;

import java.util.List;

public class WeatherResult {
   private String base;
   private Long dt;
   private String name;
   private List<WeatherCondition> weather;
   private TemperatureInfo main;
   private SysInfo sys;

    public SysInfo getSys() {
        return sys;
    }

    public void setSys(SysInfo sys) {
        this.sys = sys;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeatherCondition> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherCondition> weather) {
        this.weather = weather;
    }

    public TemperatureInfo getMain() {
        return main;
    }

    public void setMain(TemperatureInfo main) {
        this.main = main;
    }

    public class SysInfo{
        private String country;
        private long sunrise;
        private long sunset;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public long getSunrise() {
            return sunrise;
        }

        public void setSunrise(long sunrise) {
            this.sunrise = sunrise;
        }

        public long getSunset() {
            return sunset;
        }

        public void setSunset(long sunset) {
            this.sunset = sunset;
        }
    }

    public static class TemperatureInfo{
        private int humidity;
        private float temp_max;
        private float temp_min;

        public float maxInCel(){
            return temp_max - 273.15F;

        }
        public float maxInF(){
            return (float) (maxInCel() * 9.0/5.0) + 32.0f;

        }
        public float minInCel(){
            return temp_min - 273.15F;

        }
        public float minInF(){
            return (float) (minInCel() * 9.0/5.0) + 32.0f;

        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public float getTemp_max() {
            return temp_max;
        }

        public void setTemp_max(float temp_max) {
            this.temp_max = temp_max;
        }

        public float getTemp_min() {
            return temp_min;
        }

        public void setTemp_min(float temp_min) {
            this.temp_min = temp_min;
        }
    }
    public static class WeatherCondition{
        private String main;
        private String description;

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}
