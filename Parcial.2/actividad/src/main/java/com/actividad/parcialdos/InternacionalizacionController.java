package com.actividad.parcialdos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController
public class InternacionalizacionController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("welcome.message", null, locale);
    }
}