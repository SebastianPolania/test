package org.jspapps.algoritmos.token;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainToken {

    public static void main(String[] args) {
        List<Temp> listWords = new ArrayList<>();
        var text = "" +
                "<data>" +
                    "<record>" +
                        "{CODIGO}" +
                    "</record>" +
                    "<record>" +
                        "{NOMBRE}," +
                        "{APELLIDO}" +
                    "</record>" +
                "</data>";


        /*for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '{'){
                var builder = new StringBuilder();
                var finish = false;
                var incr = i;
                while (!finish){
                    incr++;
                    if (text.charAt(incr) == '}'){
                        finish = true;
                        listWords.add(new Temp(builder.toString(), i));
                    } else {
                        builder.append(text.charAt(incr));
                    }
                }
            }
        }

        System.out.println(listWords);*/

        var patternStr = "\\{\\w+}";
        var pattern = Pattern.compile(patternStr);
        var matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group(0));

        }
    }

    private static class Temp {

        private String palabra = "";
        private int posString;

        public Temp(String character, int posString) {
            this.palabra = character;
            this.posString = posString;
        }

        @Override
        public String toString() {
            return
                    "palabra='" + palabra + '\'' +
                    " posString=" + posString;
        }
    }
}
