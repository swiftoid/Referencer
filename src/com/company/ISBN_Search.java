package com.company;

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

// Example of Google API: https://www.googleapis.com/books/v1/volumes?q=9781118607961
public class ISBN_Search {

    private Boolean isbn_exists;
    private String isbn_num;
    private String isbn_title;
    private String isbn_author;
    private String isbn_desc;
    private String isbn_date;
    private String isbn_pub;

    public void run_search(String isbn) throws Exception{
        String url =  "https://www.googleapis.com/books/v1/volumes?q="+isbn;
        System.out.println(url);
        JSONObject json = readJsonFromUrl(url);
        JSONObject fr = (json.getJSONArray("items")).getJSONObject(0); // First result
        JSONArray authors = (fr.getJSONObject("volumeInfo")).getJSONArray("authors");
        String title = (fr.getJSONObject("volumeInfo")).get("title").toString();
        System.out.println(title);
        this.isbn_title = title;
        this.isbn_desc = "{This Needs to be set}";
        this.isbn_author = authors.get(0).toString();
        this.isbn_date = (fr.getJSONObject("volumeInfo")).get("publishedDate").toString();
        this.isbn_pub = (fr.getJSONObject("volumeInfo")).get("publisher").toString();
        System.out.println(authors.get(0).toString());
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
            JSONObject json = new JSONObject(jsonText);
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
    public String getIsbn_pub() {
        return isbn_pub;
    }

}
