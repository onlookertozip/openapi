package me.ohtaeg.application;

import me.ohtaeg.api.dto.request.SearchWord;
import me.ohtaeg.domain.response.SearchApi;

public interface SearchService {
    SearchApi search(SearchWord searchWord);
}
