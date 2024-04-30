package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Bu bir Controller sınıfı olduğunu belirtiyoruz.
@RequestMapping("/mesaj")
public class HomeController {

    @GetMapping
    public String home() {
        return "index"; // Burada "index" isimli HTML dosyasını döndürüyoruz.
    }
}


