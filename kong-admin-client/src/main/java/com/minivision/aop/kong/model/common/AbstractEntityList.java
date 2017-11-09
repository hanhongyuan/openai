package com.minivision.aop.kong.model.common;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import com.minivision.aop.kong.exception.KongClientException;

/**
 * Created by vaibhav on 13/06/17.
 */
public abstract class AbstractEntityList {

    public String getNext() {
        return null;
    }

    public String getOffset() {
        if(getNext() == null) {
            return null;
        }
        else {
            return splitQuery(getNext()).get("offset");
        }
    }

    private Map<String, String> splitQuery(String urlString) {
        try {
            URL url = new URL(urlString);
            Map<String, String> query_pairs = new LinkedHashMap<>();
            String query = url.getQuery();
            String[] pairs = query.split("&");
            for (String pair : pairs) {
                int idx = pair.indexOf("=");
                query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
            }
            return query_pairs;
        }
        catch (MalformedURLException | UnsupportedEncodingException e) {
            throw new KongClientException("Could not parse URL " + getNext());
        }
    }
}
