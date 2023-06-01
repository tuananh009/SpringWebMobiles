package com.mobile.webmobile.controller.shop;//package com.mobile.webmobile.controller.shop;
//
//import com.mobile.webmobile.entity.Rate;
//import com.mobile.webmobile.entity.User;
//import com.mobile.webmobile.model.request.CreateRateProductRequest;
//import com.mobile.webmobile.security.CustomUserDetails;
//import com.mobile.webmobile.service.RateService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@Controller
//public class RateController {
//
//    @Autowired
//    private RateService rateService;
//
//    @PostMapping("/api/rates/product")
//    public ResponseEntity<Object> createRate(@RequestBody CreateRateProductRequest createRateProductRequest){
//        User user = ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
//        Rate rate = rateService.createRate(createRateProductRequest,user.getId());
//        return ResponseEntity.ok(rate);
//    }
//
//}
