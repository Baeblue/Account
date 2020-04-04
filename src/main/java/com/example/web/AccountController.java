package com.example.web;

import com.example.domain.Account;
import com.example.service.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// This is AccountController
// Add comment 
@Controller
@RequestMapping("accounts")
public class AccountController {
    @Autowired
    AccountService accountService;

    @ModelAttribute
    AccountForm setUpForm() {
        return new AccountForm();
    }

    @GetMapping(path = "home")
    String home() {
        return "accounts/home";
    }

    @PostMapping(path = "enroll")   // 등록에서 데이터 넣는 것.
    String enroll(@Validated AccountForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }
        Account account = new Account();
        BeanUtils.copyProperties(form, account);
        accountService.create(account);
        return "redirect:/accounts/enroll";
    }

    @GetMapping(path = "enroll")   // 등록화면으로 들어오는 것
    String enroll(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "accounts/enroll";
    }


    @PostMapping(path = "input")   // 입력에서 데이터 넣는 것.
    String input(@Validated AccountForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }
        Account account = new Account();
        BeanUtils.copyProperties(form, account);
        accountService.create(account);
        return "accounts/input";
    }

    @GetMapping(path = "input")   // 입력화면으로 들어오는 것
    String input(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "accounts/input";
    }

    @GetMapping
    String list(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "accounts/list";
    }

//    @PostMapping(path = "delete")
//    String delete(@RequestParam(value = "params", required = false) Account account) {
//        accountService.delete(account);
//        return "accounts/enroll";
//    }

    @PostMapping(path = "delete")
    String delete(@RequestParam Integer id) {
        accountService.delete(id);
        return "redirect:/accounts";
    }
}
