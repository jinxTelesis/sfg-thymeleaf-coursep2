package guru.springframework.services;

import guru.springframework.domain.Author;
import guru.springframework.domain.Product;
import guru.springframework.domain.ProductCategory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    private Map<Integer, Product> productMap;

    public  ProductServiceImpl() {LoadProducts();}


    @Override
    public Product getProduct(Integer id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> productList() {
        return new ArrayList<>(productMap.values());
    }

    private void LoadProducts(){
        Author jt = new Author();
        jt.setFirstName("John");
        jt.setLastName("Thompson");
        jt.setId(1);
        jt.setImage("instructor_jt.jpg");

        ProductCategory springIntroCat = new ProductCategory();
        springIntroCat.setId(1);
        springIntroCat.setCategory("Spring Introduction");

        ProductCategory springCoreCat = new ProductCategory();
        springCoreCat.setId(2);
        springCoreCat.setCategory("Spring Boot");

        ProductCategory springBootCat = new ProductCategory();
        springBootCat.setId(3);
        springCoreCat.setCategory("Spring Boot");

        ProductCategory thymeleafCat = new ProductCategory();
        thymeleafCat.setId(4);
        thymeleafCat.setCategory("Thymeleaf");

        ProductCategory geapCata = new ProductCategory();
        geapCata.setId(5);
        geapCata.setCategory("G.E.A.P");

        productMap = new HashMap<>();

        productMap = new HashMap<>();

        Product springIntro = new Product();
        springIntro.setId(1);
        springIntro.setCourseName("Introduction to Spring");
        springIntro.setCourseSubtitle("Start Learning Spring!");
        springIntro.setAuthor(jt);
        springIntro.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
        springIntro.setPrice(new BigDecimal("0"));
        springIntro.setImageUrl("SpringIntroThumb.png");
        springIntro.getProductCategoryList().add(springIntroCat);
        springIntro.getProductCategoryList().add(springBootCat);
        productMap.put(1, springIntro);


        Product springCoreUltimate = new Product();
        springCoreUltimate.setId(2);
        springCoreUltimate.setCourseName("Spring Core Ultimate");
        springCoreUltimate.setCourseSubtitle("Ultimate Bundle of Spring Core!");
        springCoreUltimate.setAuthor(jt);
        springCoreUltimate.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
        springCoreUltimate.setPrice(new BigDecimal("199"));
        springCoreUltimate.setImageUrl("SpringCoreUltimateThumb.png");
        springCoreUltimate.getProductCategoryList().add(springCoreCat);
        springCoreUltimate.getProductCategoryList().add(springBootCat);
        productMap.put(2, springCoreUltimate);

        Product thymeleaf = new Product();
        thymeleaf.setId(3);
        thymeleaf.setCourseName("Thymeleaf");
        thymeleaf.setCourseSubtitle("Thymeleaf and Spring!");
        thymeleaf.setAuthor(jt);
        thymeleaf.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
        thymeleaf.setPrice(new BigDecimal("199"));
        thymeleaf.setImageUrl("ThymeleafThumb.png");
        thymeleaf.getProductCategoryList().add(thymeleafCat);
        productMap.put(3, thymeleaf);

        Product springCore = new Product();
        springCore.setId(4);
        springCore.setCourseName("Spring Core");
        springCore.setCourseSubtitle("Spring Core - mastering Spring!");
        springCore.setAuthor(jt);
        springCore.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
        springCore.setPrice(new BigDecimal("199"));
        springCore.setImageUrl("SpringCoreThumb.png");
        springCore.getProductCategoryList().add(springCoreCat);
        springCore.getProductCategoryList().add(springBootCat);
        productMap.put(4, springCore);

        Product springCoreAdv = new Product();
        springCoreAdv.setId(5);
        springCoreAdv.setCourseName("Spring Core Advanced");
        springCoreAdv.setCourseSubtitle("Advanced Spring Core!");
        springCoreAdv.setAuthor(jt);
        springCoreAdv.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
        springCoreAdv.setPrice(new BigDecimal("199"));
        springCoreAdv.setImageUrl("SpringCoreAdvancedThumb.png");
        springCoreAdv.getProductCategoryList().add(springCoreCat);
        springCoreAdv.getProductCategoryList().add(springBootCat);
        productMap.put(5, springCoreAdv);

        Product springCoreDevOps = new Product();
        springCoreDevOps.setId(6);
        springCoreDevOps.setCourseName("Spring Core Dev-Ops");
        springCoreDevOps.setCourseSubtitle("Deploying Spring in the Enterprise and the cloud!");
        springCoreDevOps.setAuthor(jt);
        springCoreDevOps.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
        springCoreDevOps.setPrice(new BigDecimal("199"));
        springCoreDevOps.setImageUrl("SpringCoreDevOpsThumb.png");
        springCoreDevOps.getProductCategoryList().add(springCoreCat);
        springCoreDevOps.getProductCategoryList().add(springBootCat);
        productMap.put(6, springCoreDevOps);
    }
}
