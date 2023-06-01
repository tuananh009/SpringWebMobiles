package com.mobile.webmobile.service.impl;//package com.mobile.webmobile.service.impl;
//
//import com.mobile.webmobile.entity.Product;
//import com.mobile.webmobile.entity.Rate;
//import com.mobile.webmobile.entity.User;
//import com.mobile.webmobile.exception.InternalServerException;
//import com.mobile.webmobile.model.request.CreateRateProductRequest;
//import com.mobile.webmobile.repository.ProductRepository;
//import com.mobile.webmobile.repository.RateRepository;
//import com.mobile.webmobile.service.RateService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.sql.Timestamp;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class RateServiceImpl implements RateService {
//
//    @Autowired
//    private RateRepository rateRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Override
//    public Rate createRate(CreateRateProductRequest createRateProductRequest, long userId) {
//        Rate rate = new Rate();
//        rate.setRating(createRateProductRequest.getRate());
//        rate.setCreatedAt(new Timestamp(System.currentTimeMillis()));
//        Product product = new Product();
//        product.setId(createRateProductRequest.getProductId());
//        rate.setProduct(product);
//        User user = new User();
//        user.setId(userId);
//        rate.setUser(user);
//        try {
//            rateRepository.save(rate);
//        }catch (Exception e){
//            throw new InternalServerException("Có lỗi khi đánh giá");
//        }
//        return rate;
//    }
//
//}
