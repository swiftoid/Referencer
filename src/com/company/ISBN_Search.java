package com.company;

import java.security.PrivateKey;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Chris on 16/12/2015.
 */

// EXAMPLE API URL: http://openlibrary.org/api/books?bibkeys=ISBN:0201558025&jscmd=details
public class ISBN_Search {

    private Boolean isbn_exists;
    private String isbn_num;
    private String isbn_title;
    private String isbn_author;
    private String isbn_desc;
    private String isbn_date;

    public void run_search(String isbn) throws Exception{
        this.isbn_exists = false;
        String url =  "http://openlibrary.org/api/books?bibkeys=ISBN:"+isbn+"&jscmd=details";
        System.out.println(url);
        JSONObject json = readJsonFromUrl(url);
        JSONObject all = (JSONObject) json.get("var _OLBookInfo");
        JSONObject ISBN = (JSONObject) all.get("ISBN:0201558025");
        JSONObject details = (JSONObject) ISBN.get("details");

        System.out.println(json.toString());
        this.isbn_title = details.get("title").toString();
    }
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject("{" + jsonText + "}");
            return json;
        } finally {
            is.close();
        }
    }
    public Boolean getIsbn_exists() {
        return isbn_exists;
    }
    public String getIsbn_num() {
        return isbn_num;
    }
    public String getIsbn_title() {
        return isbn_title;
    }
    public String getIsbn_author() {
        return isbn_author;
    }
    public String getIsbn_desc() {
        return isbn_desc;
    }
    public String getIsbn_date() {
        return isbn_date;
    }
}
