package com.mockcompany.webapp.service;

import com.mockcompany.webapp.model.ProductItem;
import com.mockcompany.webapp.data.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    private ProductItemRepository productItemRepository;

    public List<ProductItem> searchProducts(String query) {
        return Collections.emptyList(); // This will break the tests
    }
}
