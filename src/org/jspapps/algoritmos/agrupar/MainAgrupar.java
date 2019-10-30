package org.jspapps.algoritmos.agrupar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainAgrupar {

    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Medellin", "La 30", "Enero", 1000));
        cities.add(new City("Medellin", "La 30", "Febrero", 800));
        cities.add(new City("Medellin", "Los Alpes", "Enero", 1200));
        cities.add(new City("Medellin", "Los Alpes", "Febrero", 1000));
        cities.add(new City("Medellin", "Los Alpes", "Marzo", 2000));
        cities.add(new City("Cali", "La 30", "Enero", 500));
        cities.add(new City("Cali", "La 30", "Febrero", 400));
        cities.add(new City("Cali", "Los Alpes", "Enero", 800));
        cities.add(new City("Cali", "Los Alpes", "Febrero", 700));
        cities.add(new City("Cali", "Los Alpes", "Marzo", 600));

        Map<String, List<City>> map = cities.stream().collect(Collectors.groupingBy(City::getName));

        System.out.println(map);
        map.forEach((k, v) -> {
            Map<String, List<City>> month = v.stream().collect(Collectors.groupingBy(City::getMes));
            month.forEach((mK, mV) -> {
                int totalVentas = mV.stream().mapToInt(City::getVenta).sum();
                System.out.println("Total ventas para " + k + " en el mes de " + mK  +" fue de " + totalVentas);
            });
            System.out.println();
        });

    }

    private static class City{
        private String name, almacen, mes;
        private int venta;

        public City(String name, String almacen, String mes, int venta) {
            this.name = name;
            this.almacen = almacen;
            this.mes = mes;
            this.venta = venta;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlmacen() {
            return almacen;
        }

        public void setAlmacen(String almacen) {
            this.almacen = almacen;
        }

        public String getMes() {
            return mes;
        }

        public void setMes(String mes) {
            this.mes = mes;
        }

        public int getVenta() {
            return venta;
        }

        public void setVenta(int venta) {
            this.venta = venta;
        }

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    ", almacen='" + almacen + '\'' +
                    ", mes='" + mes + '\'' +
                    ", venta=" + venta +
                    "}\n";
        }
    }
}
