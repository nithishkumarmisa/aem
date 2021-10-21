package com.adobe.aem.assessment.core.models;

import com.adobe.aem.assessment.core.helper.MultifieldHelperr;

import java.util.List;
import java.util.Map;

public interface AuthorBookss {

    String getAuthorName();

    List<String> getAuthorBooks();


    List<Map<String,String>> getBookDetailsWithMap();

}
