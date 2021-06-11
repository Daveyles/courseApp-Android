package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }

    public void openActivity2(){
        //create intent
        Intent intent = new Intent(this, Activity2.class);
        //create bundle
        Bundle bundle1 = new Bundle();
        //add strings to bundle
        bundle1.putString("BREAD_CRUMBS1", "Limkokwing eStudy > Courses > Front-End Web Development");
        bundle1.putString("COURSE_NAME1", "Front-End Web Development");
        bundle1.putString("COURSE_LECTURER1", "Lecturer: Mr. Mahahameng");
        bundle1.putString("COURSE_PERIOD", "Period: 8 weeks");
        bundle1.putString("COURSE_LEVEL1", "Level: Beginner");
        bundle1.putString("COURSE_OVERVIEW1", "\nIntroduction to HTML\n\n" +
                "This module sets the stage, getting you used to important concepts and syntax such as looking at applying HTML to text, how to create hyperlinks, and how to use HTML to structure a web page.\n\n" +
                "Multimedia and embedding\n\n" +
                "This module explores how to use HTML to include multimedia in your web pages, including the different ways that images can be included, and how to embed video, audio, and even entire other webpages.\n\n" +
                "HTML tables\n\n" +
                "Representing tabular data on a webpage in an understandable, accessible way can be a challenge. This module covers basic table markup, along with more complex features such as implementing captions and summaries.\n\n" +
                "HTML forms\n\n" +
                "Forms are a very important part of the Web — these provide much of the functionality you need for interacting with websites, e.g. registering and logging in, sending feedback, buying products, and more. This module gets you started with creating the client-side/front-end parts of forms.\n\n" +
                "Use HTML to solve common problems\n\n" +
                "Provides links to sections of content explaining how to use HTML to solve very common problems when creating a web page: dealing with titles, adding images or videos, emphasizing content, creating a basic form, etc.\n");
        intent.putExtras(bundle1);

        startActivity(intent);
    }

    public void openActivity3(){
        //create intent
        Intent intent = new Intent(this, Activity2.class);
        //create bundle
        Bundle bundle1 = new Bundle();
        //add strings to bundle
        bundle1.putString("BREAD_CRUMBS1", "Limkokwing eStudy > Courses > Mobile App Development");
        bundle1.putString("COURSE_NAME1", "Mobile App Development");
        bundle1.putString("COURSE_LECTURER1", "Lecturer: Mr. Mahase");
        bundle1.putString("COURSE_PERIOD", "Period: 16 weeks");
        bundle1.putString("COURSE_LEVEL1", "Level: Intermediate");
        bundle1.putString("COURSE_OVERVIEW1", "Android App Development Fundamentals\n" +
                "\n" +
                "1. Master the Language\n\n" +
                "Java and XML are the two main programming languages used in Android App development. Knowledge and mastery over these programming languages are, therefore, prerequisites to developing an Android app. Some of the fundamentals of the Java programming language include:\n" +
                "\n" +
                "Packages\n" +
                "Objects & classes\n" +
                "Inheritance & interfaces\n" +
                "Strings & numbers, generics,\n" +
                "Collections\n" +
                "Concurrency\n" +
                "Proper understanding of Java and XML will help you build/develop a more robust and elegant android app.\n" +
                "\n" +
                "2. Familiarity with the Right Application Development Tools and Environment\n\n" +
                "If you are stepping into Android App development, it is very important that you familiarize yourself with the build automation tools as well as the integrated development environment before you start developing your app. You can use Android app studio IDE or Eclipse for the tools; they will help you learn the basics and many other things that will help improve your code. You can learn Apache Maven, Apache Ant, and Gradle as they provide a powerful set of tools to help in managing your builds.\n" +
                " \n" +
                "\n" +
                "3. Knowledge of the Application Components\n\n" +
                "Application components are the essential building blocks of Android app development. Each of the components is a different point by which the system can enter your app. Although each one of them exists as its own entity and plays a specific role, there are some which depend on each other, and not all of them are actual entry points.\n" +
                "\n" +
                "\n" +
                "4. Awareness over Fragmentations, Android Application, Threads, Loaders, and Tasks\n\n" +
                "Android is a fragmented market with many different devices and operating system versions. Note that, if your device supports more devices and/or versions it will definitely require more maintenance and testing as well as the related costs. The vice-versa is also true. You also require appropriate fonts, assets, and layouts that will help in ensuring that the best possible experiences in the various screen characteristics are given. You should also consider the array of android supported sensors or UI facilities. All android apps have an application class, one or more activities, and one or more fragments.\n" +
                "\n" +
                "\n" +
                "5. Making the Right Choice over Needed Tools\n\n" +
                "The simple tools that you need for Android app development are just a Mac or Windows PC, any type of Linux, and Eclipse, the ADT Plugin, and the Android SDK—all of which are free. You can go through the installation guide on Google to learn how to set up your development environment; it provides documentation of everything needed. Android has some unique parameters that you should consider when writing an Android app. " +
                "\n");
        intent.putExtras(bundle1);

        startActivity(intent);
    }
    public void openActivity4(){
        //create intent
        Intent intent = new Intent(this, Activity2.class);
        //create bundle
        Bundle bundle1 = new Bundle();
        //add strings to bundle
        bundle1.putString("BREAD_CRUMBS1", "Limkokwing eStudy > Courses > Data Science");
        bundle1.putString("COURSE_NAME1", "Data Science");
        bundle1.putString("COURSE_LECTURER1", "Lecturer: Ms. Bongi");
        bundle1.putString("COURSE_PERIOD", "Period: 24 weeks");
        bundle1.putString("COURSE_LEVEL1", "Level: Advanced");
        bundle1.putString("COURSE_OVERVIEW1", "Introduction to Machine Learning for Beginners\n" +
                "\n" +
                "We have seen Machine Learning as a buzzword for the past few years, the reason for this might be the high amount of data production by applications, the increase of computation power in the past few years and the development of better algorithms.\n" +
                "\n" +
                "Machine Learning is used anywhere from automating mundane tasks to offering intelligent insights, industries in every sector try to benefit from it. You may already be using a device that utilizes it. For example, a wearable fitness tracker like Fitbit, or an intelligent home assistant like Google Home. But there are much more examples of ML in use, these include :\n" +
                "\n" +
                "Prediction — Machine learning can also be used in the prediction systems. Considering the loan example, to compute the probability of a fault, the system will need to classify the available data in groups.\n" +
                "\n" +
                "Image recognition — Machine learning can be used for face detection in an image as well. There is a separate category for each person in a database of several people.\n" +
                "\n" +
                "Speech Recognition — It is the translation of spoken words into the text. It is used in voice searches and more. Voice user interfaces include voice dialing, call routing, and appliance control. It can also be used a simple data entry and the preparation of structured documents.\n" +
                "\n" +
                "Medical diagnoses — ML is trained to recognize cancerous tissues.\n" +
                "Financial industry and trading —\n" +
                " companies use ML in fraud investigations and credit checks.\n" +
                "\n" +
                "Types of Machine Learning\n" +
                "\n" +
                "Machine learning can be classified into 3 types of algorithms:\n" +
                "\n" +
                "Supervised Learning \n" +
                "Unsupervised Learning \n" +
                "Reinforcement Learning \n");
        intent.putExtras(bundle1);

        startActivity(intent);
    }
}