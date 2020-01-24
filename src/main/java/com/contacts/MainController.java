package com.contacts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/contactitem")
    public ContactItem contactitem() {
        logger.info("+contactitem");
        return new ContactItem("0506400201", "Mamed", "Mamedov", "mamedmamedov@gmail.com");
    }

    @GetMapping("/contactslist")
    public List<ContactItem> contactslist() {
        logger.info("+contactslist");
        List<ContactItem> contactItems = new ArrayList<>();
        contactItems.add(new ContactItem("0506400201", "Mamed", "Mamedov", "mamedmamedov@gmail.com"));
        contactItems.add(new ContactItem("0506400202", "Admed", "Mamedov", "admedmamedov@gmail.com"));
        return contactItems;
    }
}
