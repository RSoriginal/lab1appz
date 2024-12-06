package ntu.ivannech.lab1appz.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ntu.ivannech.lab1appz.service.HomePageService;

@Getter
@Setter
@Controller
public class HomePageController {

    private final HomePageService homePageService;

    @Autowired
    public HomePageController(HomePageService homePageService) {
        this.homePageService = homePageService;
    }

    @GetMapping(path = "/")
    public @ResponseBody String returnHelloWorld() {
        return homePageService.getHelloString();
    }
}