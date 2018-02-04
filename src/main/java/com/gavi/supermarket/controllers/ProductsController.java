package com.gavi.supermarket.controllers;

import com.gavi.supermarket.dto.ProductDTO;
import com.gavi.supermarket.dto.SuccessResponseDTO;
import com.gavi.supermarket.exceptions.ConflictException;
import com.gavi.supermarket.exceptions.DataNotFoundException;
import com.gavi.supermarket.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Hi on 24-01-2018.
 */
@RestController
@RequestMapping("/products")
@Api("Product Related Operation")
public class ProductsController {

    @Autowired
    private ProductService productService;


    @ApiOperation(value = "Add product", notes = "This api is used to store a product", httpMethod = "POST")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PostMapping(value = "/product", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addProduct(@RequestBody ProductDTO dto) {
        return new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(productService.addProduct(dto)), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Add products", notes = "This api is used to store multiple products", httpMethod = "POST")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addMultipleProducts(@RequestBody List<ProductDTO> products) throws ConflictException {

        return  new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(productService.uploadProducts(products)), HttpStatus.CREATED);

    }

    @ApiOperation(value = "Get All Products", notes = "this api is used to get all products", httpMethod = "GET")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @GetMapping(produces = "application/json")
    public  ResponseEntity<?> getProducts() {
        return new ResponseEntity<List<ProductDTO>>(productService.retrieveProducts(), HttpStatus.OK);
    }

    @ApiOperation(value = "Get product", notes = "this api is used to get  product by Id", httpMethod = "GET")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @GetMapping(value = "/product/{productId}", produces = "application/json")
    public ResponseEntity<?> getProduct(@PathVariable Long productId) {
        return new ResponseEntity<ProductDTO>(productService.findProductById(productId), HttpStatus.OK);
    }

    @ApiOperation(value = "Update product", notes = "this api is used to update product", httpMethod = "PUT")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PutMapping(value = "/product/{productId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO dto, @PathVariable Long productId) throws DataNotFoundException {
        return new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(productService.updateProduct(dto, productId)), HttpStatus.ACCEPTED);
    }


    @ApiOperation(value = "Delete product", notes = "this api is used to delete  product by Id", httpMethod = "DELETE")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @DeleteMapping(value = "/product/{productId}", produces = "application/json")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId) throws DataNotFoundException {
        return new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(productService.deleteProduct(productId)), HttpStatus.OK);
    }







}
