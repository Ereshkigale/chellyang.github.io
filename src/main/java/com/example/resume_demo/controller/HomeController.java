package com.example.resume_demo.controller;


import com.example.resume_demo.bean.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String index( Model model ){
        //个人基本资料
        UserInfo userinfo=new UserInfo("Yangsir","男","19","安徽六安","软件工程","本科",
                "武汉科技大学","后台开发","/jianli/download/个人简历.pdf","武汉黄家湖西路1号","13395683163","1614997327@QQ.com",
                "1614997327","saberyangzhaohui");
        model.addAttribute("userinfo",userinfo);
        //项目经验
        Project project1=new Project("web项目1","web开发","两个月","从事...",
                "/jianli/img/project/1.jpg","web");
        Project project2=new Project("web项目2","web开发","两个月","从事...",
                "/jianli/img/project/2.jpg","web");
        Project project3=new Project("web项目1","安卓开发","两个月","从事...",
                "/jianli/img/project/3.jpg","app");
        List<Project> project=new ArrayList<Project>();
        project.add(project1);
        project.add(project2);
        project.add(project3);
        model.addAttribute(project);
        //专业技能
        Skill skill1=new Skill("Java编程");
        Skill skill2=new Skill("SpringBoot开发");
        Skill skill3=new Skill("Android开发");
        ArrayList<Skill> skill=new ArrayList<Skill>();
        skill.add(skill1);
        skill.add(skill2);
        skill.add(skill3);
        model.addAttribute(skill);
        //工作经历
        Work work1=new Work("阿里巴巴","/jianli/img/work/ali.png","后台开发",
                new Date(2020-1900,6-1,1),new Date(2020-1900,8-1,1),"前台接待");
        Work work2=new Work("腾讯","/jianli/img/work/tecent.PNG","前端开发",
                new Date(2020-1900,9-1,1),new Date(2020-1900,10-1,1),"前台接待");
        ArrayList<Work> work=new ArrayList<Work>();
        work.add(work1);
        work.add(work2);
        model.addAttribute(work);
        //自我评价
        Appraisal appraisal1=new Appraisal("评价1");
        Appraisal appraisal2=new Appraisal("评价2");
        Appraisal appraisal3=new Appraisal("评价3");
        ArrayList<Appraisal> appraisal=new ArrayList<Appraisal>();
        appraisal.add(appraisal1);
        appraisal.add(appraisal2);
        appraisal.add(appraisal3);
        model.addAttribute(appraisal);

        return "index";
    }




}
