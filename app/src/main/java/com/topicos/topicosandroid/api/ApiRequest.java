package com.topicos.topicosandroid.api;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by maychellfernandesdeoliveira on 30/10/2015.
 */
public class ApiRequest extends AsyncTask<Map<String, String>, Void, List<Map<String, String>>> {

    private String url = "http://topicos-api.herokuapp.com/";
    private String methodTarget;
    private String method;
    private List<String> keys;

    public ApiRequest(String methodTarget, String method, List<String> keys) {
        this.methodTarget = methodTarget;
        this.method = method;
        this.keys = keys;
    }

    @Override
    protected List<Map<String, String>> doInBackground(Map<String, String>... params) {
        try {
            return downloadUrl(url+methodTarget);
        } catch (IOException e) {
            Map<String, String> error = new HashMap<>();
            error.put("ERROR", "Unable to retrieve web page. URL may be invalid.");
            List<Map<String, String>> errorResult = new ArrayList<>();
            errorResult.add(error);
            return errorResult;
        }
    }
    // onPostExecute displays the results of the AsyncTask.

    @Override
    protected void onPostExecute(List<Map<String, String>> stringStringMap) {
        Log.d("DEBUG", "DEU CERTO!");
        //super.onPostExecute(stringStringMap);
    }

    private List<Map<String, String>> downloadUrl(String myurl) throws IOException {
        InputStream is = null;
        // Only display the first 500 characters of the retrieved
        // web page content.
        int len = 500;

        Map<String, String> resultObject;

        List<Map<String, String>> resultList = new ArrayList<>();

        try {
            URL url = new URL(myurl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod(method);
            conn.setDoInput(true);
            // Starts the query
            conn.connect();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line+"\n");
            }
            br.close();

            JSONArray jObj = new JSONArray(sb.toString());

            for(int i=0; i<jObj.length(); ++i) {
                JSONObject json = jObj.getJSONObject(i);
                resultObject = new HashMap<>();
                for(String key : keys)
                    resultObject.put(key, json.getString(key));

                resultList.add(resultObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return resultList;
    }
}