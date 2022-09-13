package org.coolstyles.helloworld.data.implement;

import android.content.Context;

import org.coolstyles.helloworld.data.DatabaseHelper;
import org.coolstyles.helloworld.data.dao.ProductDao;
import org.coolstyles.helloworld.data.model.Product;

import java.util.List;

public class ProductDaoImplement extends DatabaseHelper implements ProductDao {
    public ProductDaoImplement(Context context) {
        super(context);
    }

    @Override
    public Product find(int id) {
        return null;
    }

    @Override
    public List<Product> all() {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }
}
