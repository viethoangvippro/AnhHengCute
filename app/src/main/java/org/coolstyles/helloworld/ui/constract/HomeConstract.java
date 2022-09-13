package org.coolstyles.helloworld.ui.constract;

import org.coolstyles.helloworld.data.model.Product;

import java.util.List;

public interface HomeConstract {
    interface IView{
        void setProductListToView(List<Product> productList);
        void showProductDetail(Product product);
    }

    interface IPresenter{
        void setView(IView view);
        void getProductList();
        void getProduct(int productId);
    }
}
