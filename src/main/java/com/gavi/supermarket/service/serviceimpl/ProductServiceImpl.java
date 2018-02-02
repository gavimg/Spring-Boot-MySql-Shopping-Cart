package com.gavi.supermarket.service.serviceimpl;

import com.gavi.supermarket.dto.ProductDTO;
import com.gavi.supermarket.dto.SuccessResponseDTO;
import com.gavi.supermarket.enums.Category;
import com.gavi.supermarket.exceptions.ConflictException;
import com.gavi.supermarket.exceptions.DataNotFoundException;
import com.gavi.supermarket.models.Product;
import com.gavi.supermarket.repositories.ProductRepository;
import com.gavi.supermarket.service.ProductService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public String addProduct(ProductDTO dto) {
        Product product = dozerBeanMapper.map(dto, Product.class);
        productRepository.save(product);
        return "SUCCESS";
    }

    @Override
    public String uploadProducts(List<ProductDTO> dtos) throws ConflictException {
        for (ProductDTO dto: dtos) {
            try{
                Product product = dozerBeanMapper.map(dto, Product.class);
                productRepository.save(product);
            }
            catch (DataIntegrityViolationException e){
                throw new ConflictException("Duplicate Product Barcode");
            }
        };
        return "SUCCESS";
    }

    @Override
    public ProductDTO findProductById(Long productId) {

        Product product = productRepository.findOne(productId);

        ProductDTO productDTO = dozerBeanMapper.map(product, ProductDTO.class);

        return productDTO;
    }

    @Override
    public List<ProductDTO> retrieveProducts() {

        List<Product> products = productRepository.findAll();

        List<ProductDTO> productDTOS = new ArrayList<>();

        for (Product product: products) {
            productDTOS.add(dozerBeanMapper.map(product, ProductDTO.class));
        }

        return productDTOS;
    }

    @Override
    public String updateProduct(ProductDTO dto, Long productId) throws DataNotFoundException {

        Product product = productRepository.findOne(productId);

        if(product != null) {
            product.setProductName(dto.getProductName());
            product.setBarcode(dto.getBarcode());
            product.setCategory(Category.valueOf(dto.getCategory()));
            product.setProductCost(dto.getProductCost());
            product.setProductImage(dto.getProductImage());
            product.setProductDescription(dto.getProductDescription());
            product.setProductSpecification(dto.getProductSpecification());
            productRepository.flush();

            return "SUCCESS";
        } else {
            throw new DataNotFoundException("Product Not Found");
        }
    }

    @Override
    public String deleteProduct(Long productId) throws DataNotFoundException {

        Product product = productRepository.findOne(productId);

        if(product != null){
            productRepository.delete(product);
            return "SUCCESS";
        } else {
            throw  new DataNotFoundException("Product Not Found");
        }



    }
}
