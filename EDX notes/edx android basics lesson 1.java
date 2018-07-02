android the open source linux kernal

this software can be added into mobile , watch and tv and android auto 

android OS version and api levels 

android first launched in 2008 with its first android version and year after year they update their OS 
they give name and api level numbers to these software 

Google provides them with tools such as the SDK 

sdk = android software develepment kit 

with sdk any programmer can code, text and debug android applications

Android studio bundle includes android sdk  and intergrates some useful tools inside the ide 

Android’s latest version, introducing faster, smoother loading times, faster execution by handling background limits,
 Picture-in-Picture Applications, new safety features such as blocking unknown apps by source. Added snoozing and Notification Channels, 
 to customize the Notifications you want to see.

Android versions always come with new and improved systems and behaviors, 
this however can change how our Applications work, you can check the detailed behavior changes in the Android Developers site.

https://developer.android.com/about/versions/oreo/android-8.0-changes





------------------------------------------------------------------------Android Platform Architecture-------------------------



Android is an open souce linux based software stack created for a wide range of devices 

The major components of the Android platform 


																						System Apps
																					Java API Framework 
																		Native C/C++ Libraries | Android Runtime(ART)
																				Hardware Abstraction Layer (HAL)
																						Linux Kernal




------------------------------------------------------------------------------Linux Kernal------------------------------------------------------



the foundatin of the android platform is the linux kernal 
the kernal is the core of the android operating system, 
the core primary Function is to access to the resources to perform useful functions or 
application process needed to access the components connected to the device which are controled by the kernal through driver 

a driver is a program that enables the operating system to interact with Hardware devices 
so the kernal can interact with each hardware in our device through drivers 
 for example 

Drivers(
	Audio
	Binder(IPC)
	Display
	Keypad
	Blutooth 
	Camera
	Shared Memory 
	USB
	Wifi


	Power Management 
	)


these components can be controlled by the kernal using drivers 

-
---------------------------------------------------------------------Hardware Abstraction Layer(HAL)--------------------------



hal provides the standard methods for creating software hooks between the android platform stack and your hardware, 
the hardware structure layer HAl defines a standard interface for hardware vendors to implement and allow android to be agnostic about 
lower level system 

Basically the HAL consists of multiple libaray modules each of which element and interface for a specific type of hardware component 
such as camera audio memory and other sensors  mouldles 

HAL is a multiple libaray mouldles and each of this mouldles implement an interface for a specific type of hardware component


--------------------------------------------------------------------------Android Runtime(ART)--------------------------------------



Android runtime: the Android runtime is the Core Libraries and virtual machine in Android.

It allows developers to create Android Apps with Java and provides space for Apps to operate

For devices running Android version 5.0 API level 21, or higher, each App runs in its
own processor and with its own instance of the Android runtime, ART.

Android runtime, ART is the managed runtime used by application and some system service

Unlike Dalvik which since Android 2.2 Foyo used just in time to compile the code every
time the application is started, 

ART introduces the use of a head of time, 
which creates a post installation completion file for the application.

This file is used when opening the application, 
so this prevents the application from compiling continuously each time its executed, 

Android also includes a set of core runtime libraries 
that provides most of the functionality of the Java programming language, including some
Java A language features that the Java API framework uses.


------------------------------------------------------------------------Native C/C++ Libraries-----------------------------------------------------------------



Native CC + + libraries: many core Android system components and services, 
such as ART
and HAL 
are built from native code that require native libraries written in C and C++.

The Android platform provides the Java framework APIs to expose the functionality of some of
these native libraries, 

for example you can access OpenGL ES through the Android framework Java OpenGL API, 
	to add support for drawing and mono plating 2d and 3d graphics in your App.


Another example will be Android WebKit, 
that provides tools for browsing the web, 


Libc
is the standard library of C, and all programs that implement the C language are based in
this library to work.


OpenGL ES or OpenGL for embedded systems, is a simple field variant of the OpenGL graphics
API designed for embedded device such as mobile phones.


Openmax EL is a known popularly and royalty-free cross-platform.
Set of C language programming interface that provides abstraction for routines especially
useful for audio, video, and still image processing.


It is intended for lower power and embedded system device, including smartphones, game
consoles, and digital media players.



------------------------------------------------------------------------------Java API framework -----------------------------------------------------------



Java API framework: the entire feature set of the Android iOS is available through APIs
created in the Java language. 

this APIs form the building blocks you need to create Android
Apps by simplifying the use of core modeling system components and service, 
which include
the following a rich and extensive view system, 
which you can use to build an Apps UI, including
lists, grids, text box buttons, and even an embedded web browser.


A resource manager that provide access to non-core resources such as localized strings,
graphics, and layout files.


A notification manager that enables all Apps to display custom alerts in the status bar.
An activity manager that manages the lifecycle of Apps and provides a common navigation button
to start.


Contents provider that enables Apps to access data from other Apps, Such as the contact
App or to share their own data.


Developers have full access to the same framework APIs that Android system Apps use.
These ones are the ones that were going to get into in this course.
So were going to work really hard with these API framework



											Managers

Content Providers 			Acitivity , Location , Package , Notification , 

View System 					Resource , Telephony , Window 





Your Application 

Your Content Provider Implementation  <<<<<<<  >>>>>>>> Other Application

			^^^^^^

		Your Data Storage 




------------------------------------------------------------------------------------------------System Apps -----------------------------------------------------------------




System Apps: Android came with a set of core Apps for email, messaging, calendar, internet browsing, contacts, and more.

Apps included with the phone had no special status among the Apps the user chooses to
install.

So a third party App can become the user web default browser, or the default SMS Messenger,
or even the default keyword.

The system App functions both as Apps for users and to provide key capabilities that
developers can access from their own Apps.

So for example your App would like to deliver an SMS message, you dont need to view that
function by yourself, you can instead invoke whichever SMS App is already installed to
deliver a message to the recipient yourself.


--------------------------------------------------------------------------------------- What is an app ----

In Android, Apps contain compiled Java code, data files and resources files used by each app. 
All of this comes packed up in a file denominated Android Application Package (APK), with extension .apk. APKs are a variant of Javas JAR format.

AAPT (Android Asset Packaging Tool)
Apps are packaged by using the tool AAPT (Android Asset Packaging Tool) which is included in Android SDK.


To package an application, Java code is compiled, then, compiled libraries are also included and all the code is optimized so it can be executed in Android RunTime

Also, the package includes files of data and resources such as images, media files, xml, etc.
 An important file that is also included is the AndroidManifest.xml; we will cover its importance later on.




Java code 
.java      >>>> Byte code 
				.class    >>>>>>>>>>>>

										>>>>>>>>Android Rntime exe
												Classes .dex		>>>>>>>>>
				Byte code 
				Other .class files >>>>>
																				>>>> AAPT >>>> Android .apk files 

												<XML>
												AndroidManifest		>>>>>>>>>>


												Music, Pictures 	>>>>>>>>>




------------------------------------------------------------------------- Android App Permissions -------------------------------------------------


Android implements the principle of minimal privileges. This means that applications by default only access to components they need to execute the application and nothing else.

 Applications do not have permissions to access other parts of the system and this creates a safe execution environment.

However, sometimes applications need to access system services or access data from other applications. 
To achieve this, there are some alternatives and being. The most commonly used are: to ask the user for permission to access data, or use peripherals of the device. 
For example, any developer must ask permissions to access text messages, camera, gps, etc.


That is why when applications are installed or updated, a window pops up where the user is prompted to authorize the explicit permissions over services or peripherals of the device.
 If the user refuses to accept these requests, the application is not installed.



------------------------------------------------------------------------------ Basic kinds of Apps --------------------------------------------------------


Basic kinds of apps
Apps can be classified by their behavior. Almost all applications can be categorized in the following application types:


Foreground Applications:
This is the most common app. 
These apps have a graphical interface that is executed while the user is using it.
 As soon as the app closes, these stop their execution.

  When a user exits the application and this is not closed, the app is suspended and uses less resources.
Suspended apps can be cleaned up by Android’s resource management and this happens as a last resource when the device is running low on memory.
 All this process is part of the activity lifecycle that we will review later on.


Background Services:
Are applications that are executed in the background in a silent manner. 
They have little or no interaction with the user. 

This type of applications usually waits for an event to be generated by any hardware peripheral or any message received in order to make an action.
Even though it is possible to create applications that are silently executed in background and are invisible for the user, 
it is preferred that the user can control these processes. 
Services is another topic that will be reviewed more in depth later in the course.



Intermittent Applications:
Intermittent applications are a combination of the two previous types. 
They are applications that have a graphical interface where the user can interact with the app, 
but also listens in the background for events. 

An example of this type of applications are chat applications,
 where the user can receive messages even though the app is closed and can also open the app and read all of the messages received. 
 When developing these types of applications, developers must consider all of the application states. 
This is very important because it can prevent undesired behaviors such as displaying app notifications when the app is running.


Widgets:
They are applications that have a small graphic interface within the user’s home screen and are also known as mini-apps. 
The user can interact with the widget without the need of opening the app. Widgets are commonly used to display information to the user, 

for example: weather, battery percentage, news, emails, etc. Widgets can be static or dynamic.
 A widget can also perform actions to control hardware peripherals. 
 A user can move widgets through the launcher’s home pages or change their size if the widget supports it.




--------------------------------------------------------------------------- App Components -------------------------------------------------------------


App Components:
Android Applications are built with a combination of the following components

Activities, 
Services, 
Content Providers 
Broadcast Receivers. 


However, it is not required that applications use all of those components; it depends on each application. 
Android system can enter the application through these components.
 Each component has a specific task within the application and some depend on other components.

 Each component has its own lifecycle and that is why it is important to understand each one of this components.







																			Activities



Are used to represent a (single) screen with a user interface. 
Activities are a fundamental part of applications, in which the user interacts with the application. 
Each activity is assigned a window. 
Usually a window uses up all of the available screen, but it can also be smaller and the screen will display several activities.


When a user starts the application, he or she is presented with the main activity. 
From this activity, the user can initiate other activities and they will be displayed on screen. 
For example: In an SMS application, the main activity is a list of messages and another activity is writing a new message.


Each activity is independent. 
For this reason, an activity may be initiated from a different application if it is allowed.

In order to implement an Activity, a class must inherit from the class Activity. 










																			Services



Services are used to perform prolonged tasks or tasks for remote processes in the background.
 Services do not have a graphical interface. 
 Services are very important because they can execute processes while the user is performing other tasks. 
 For instance: Services can be used to upload images to the internet.

A service is implemented as a subclass of Services.









																			Broadcast Receivers



Broadcast Receivers are used to perform specific tasks when a system wide broadcast is detected. 
Some of these broadcasts are originated by the system. 

For example: incoming calls and sms, low battery, network state changed, image captured, etc. 
Apps can also register their own broadcast messages so other apps can listen and respond to them. 

Broadcast Receivers also lack of a graphical interface and are generally used to display alerts or notifications to the users. 
Broadcast receivers are different to services in several ways but mostly because broadcast receivers wait for an event in order to run.

To implement a broadcast receiver, developers must inherit from the class BroadcastReceiver.










																			Content Providers


Content Providers manage access to a structured set of data. 
This data can be stored on the file system, 
in SQLite database or another persistent storage location. 

The main characteristic of the content providers is that they can share this data between applications. 
Data can be queried or modified through a content provider. 
In addition,
 Content providers provide an encapsulated access to data. 

For example, the contact list is held in a content provider and for this reason,
 external applications such as Whatsapp or the sms app can access contacts. 

A Content Provider is implemented as a subclass of ContentProvider 
and must implement standard set of APIs that enable other apps to perform transactions. 









																	Additional elements of an application
Besides the components in an Android Application, there are other complementary elements for an application. These elements are:









																					Intents




Intents are asynchronous messages that send activities, services and broadcast receivers.

 The most common use of intents is to move from one activity to another,
  for example, 
  	when a user clicks a button to launch the next activity.


   It is possible to pass information, 
   including objects, 
   from one activity to another. 
Intents can also open other Android applications. 
Because this is a very important part of Android, 





Activities >>>>>>>>>>>>>>>>>>							>>>> Activities	

Services   >>>>>>>>>>>>>>>>>>      >>  Intent >>		>>>> Services

Broadcast Receivers >>>>>>>>>							>>>> Broadcast Receiver








																					Android Manifest



Each Android application has a manifest file called AndroidManifest.xml. 

This file is located in the root directory of the application project.

 This file is used by Android to verify that each component exists before initializing it. 

 This is why all activities must be defined in this file explicitly and indicating which will be the main activity.

In this file, developers also must list all of the required permissions required for the application to work properly 
as well as define the minimal API Level required and hardware or software requirements, etc.



																						App Resources



In the user interfaces, besides the use of text, button and other inputs,
 sometimes they may require other resources such as images, animations, colors and styles.

 Inside the application project there is a folder named "res" where all of these resources must be placed. 
 Resources are code independent and are usually used to enrich the user experience and allow the application to be used with different configurations for different devices,
  or different languages, 
for example. The structure of the "res" folder will be covered as well in the coming lessons.





----------------------------------------------------------------------------------------- Android Basic Blocks ------------------------------------------------------------



Actives - Instagram example 


IG has several activices inside its app

one for your feed 
one for live random feed
one for taking pics software
one for your account 
one for who liked your pics, friend request 


each one is independent from one another 


To use activices in your app you must register information about them 

1. Register the activity in the apps manifest 

2. Manage activity lifecycles appropriately 











														(Activity Launched)


									>>>>>>>>>>>>>>>>>>		onCreate()
									^
									^						onStart()<<		<<	<<	<<	<<< <<	<<	<<<<	<<	<<<	onRestart()
									^
									^						onResume()	<<	<<	<<	<<	<<							   ^
									^

							App Process Killed			(Activity Running )				^							   ^	
									^
									^		
									^					another activity comes into 	^							   ^
									^					the forground 

							apps with higher 								user returns to the activity 			   ^
							priority need memory  >>>		onPause()	>>> 	>>		^											   
									^
									^					the activityis no longer visible 					 		   ^
									^																			user navigates 
																												to the activity
									<<<<	<<<<<			onStop()	>>>> 		>>>>>>> 	>>>>	>>>>>>	>> 	   ^

														the activity is finishing or 
														being destroyed by the system 

															onDestroy()


														(Activity Shut Down)



In the App manifest and you must manage activity lifecycles appropriately. 

To add an activity you need to declare each activity in the application manifest
file,

 adding an activity element as a child of the application element. 

 If every application must have an Android manifest file in its root directory,

the manifest file provides essential information about your App to set the
Android system.

 In the manifest we set the application name, the permission,
activities, and some other configurations.

 To create an Android activity we need to
implement it as a subclass of the activity class,
 basically the class is part of the Android API classes.

  Over the course of its lifetime and activity goes through a number of states.
   You use a series of callbacks to handle
transitions between states.

 Lets talk about them in more detail: 

 the OnCreate
callback files when the system creates your activity,
 all the essential components of your activity should be initialized here,

  for example, your App should create views and bind data to list here.

The next call back after the

OnCreate 

is the onStart,
this callback contains the activity final preparations for coming to the foreground and becoming an activity.

The state in which the App interacts with the user is

 OnResume,
 the App stays in OnResume until something happens to take focus away from the App.

  When an interactive event occurs the activity enters the pause state,
   and the system invokes 

the OnPause
callback. When your activity is no longer visible to the user,
 it has entered this stop state, 
 and the system invokes the OnStop callback.

In the OnRestart callback, 
the activity restores the state of the activity from the time that it was stopped,
 and finally the system invokes 

 the OnDestroy
callback before an activity is destroyed. In the OnDestroy state, you can release
all the elements you will no longer use






----------------------------------------------------------------------------- Android Context ------------------------------------------------------------------------



This vs getContext vs getApplicationContext

Context in Android is an interface to global information about and application environment,
 it allows access to application-specific resources and classes, 
 as well as up-calls for application-level such as launching activities, broadcasting and receiving intents, etc.


It’s the context of the current state of the application. It lets newly-created objects understand what is the actual state of the application.
Actions that involve Context are:

 Loading a resource
 Launching a new activity
 Creating views
 Obtaining system service


There are Different invoking methods by which you can get context, you can use:

 getApplicationContext()
 getContext()
 getBaseContext()


or use the reserved word “this” when you are in the Activity class.


These invoking methods are used for different contexts,
 there are two main contexts in Android framework Application and Activity context, 
 Application context is attached to the applications life-cycle and will always be the same throughout the life of the application, 
while the Activity context is attached to the Activity’s life-cycle an can be destroyed if “onDestroy()” is raised.



getContext()
Is used like View.getContext() and returns the context the view is currently running in.


getApplicationContext()
Is used like Activity.getApplicationContext() and returns the context for the entire application,
 used if you need a context tied to the lifecycle of the entire application, not just the current Activity.


getBaseContext()
Is used like ContextWrapper.getBaseContext() and Is use if you need to access to a Context from within another context.


And what about “this”, you could say that “this” and getContext() are the same, but they are not always the same, in an Activity class,
 you can use “this” because Activity inherits from Context, but method getContext() is not in Activity class.


In resume “this”, getBaseContext() and getContext() are activity contexts while getApplicationContext() is an application context


Here you can find the reference for Context in Android:
 https://developer.android.com/reference/android/content/Context.html 
 , there you will find the associated methods and attributes that a Context has.





-------------------------------------------------------------------------------------------------- Butter Knife Library ------------------------------------------------------------------------------------------------------



butter knife is a lightweight library to inject views into android components which uses annotation processing to 
gnerate boilerplate code for us 

This library eliminates the findViewById and this binds these attributes to our views components,

it also eliminates the anonymous inner-classes for listeners by annotating methods with @OnClick and others,

another thing is it also eliminate resource lookups by using resource annotations on fields 

for more information we can go to the github open source site 


ButterKnife is a view Injection library developed by Jake Wharton, it uses annotation processing, the goal is to make your code cleaner.

To use the Library, you need to add the dependencies into your Gradle file:


compile 'com.jakewharton:ButterKnife:8.6.0'
annotationProcessor 'com.jakewharton:ButterKnife-compiler:8.6.0'



This are some features that we can use with ButterKnife:

Bind

Activity:
This will be our example layout: 
In this layout, we have a Button and a TextView.


-------------------------screen = 
helloworld text view 
and a button text 

Our main activity will look like this 

package com.example.ivany.myapplivation;

import...

public class MainActivity extends AppCompatActivity {
	@BindView(R.id.textView) TextView text;
	@BindView(R.id.button) Button button;

	@Override 
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
	}
}


It is important to notice that to use ButterKnife in an Activity we need to add “ButterKnife.bind(this);” inside the On Create method.
 Did you see any “findViewById” call? no! and this is one of the features that ButterKnife bring to us, 
  we can reference UI elements by using binds,
   so in this example we have the variables text and button making a reference to our TextView and Button elements.



Event Binding

Another great feature of ButterKnife is the handle of events, remember the “setOnClickListener” method? With ButterKnife you can handle this event like this:

public class MainActivity extends AppCompatActivity {
	@BindView(R.id.textView) TextView text;
	@BindView(R.id.button) Button button;

	@Override 
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
	}

	@OnClick(R.id.button)
	public void foo(){
		text.settext("Button Pressed!");
	}
}

In this example, we are using the “@OnClick” annotation to handle the On Click event of the button,
 also inside the function we change the text of the TextView. This a way clearer to handle this On Click event.


-------------------------The result on the screen = 

before the button is clicked 
Helloworld text view 
Button text 

after the button is pressed 
Button is pressed text view 
Button text 

As you can see ButterKnife is a library that help us to make our code cleaner and more readable







------------------------------------------------------------------------------------------------------------------ ButterKnife vs findViewByID --------------------------------------------------------------------




In our Android applications, 
we usually need to get interface elements like layouts,
 Buttons, EditText, TextView, ImageView, etc. We achieve this by using the following code


public class MainActivity extends AppCompatActivity{
	TextView textView_1, textView_2, .....;
	EditText editText_1, editText_2, .....;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView_1 = (TextView) findViewByID(R.id.textView_1);
		textView_1 = (TextView) findViewByID(R.id.textView_2);
		textView_1 = (TextView) findViewByID(R.id.textView_3);
		textView_1 = (TextView) findViewByID(R.id.textView_4);

		editText_1 = (EditText) findViewById(R.id.editText_1);
		editText_2 = (EditText) findViewById(R.id.editText_2);
		editText_3 = (EditText) findViewById(R.id.editText_3);

	}
}


As seen in the image we use the method findViewById(int id),
 so imagine that you have more than 20 TextViews or other interface components, 
 the code for getting does elements would increment the lines inside your source code, it will be difficult to read it.

Here is where ButterKnife came to rescue us, 
ButterKnife is a view injection library,
 it creates binds with the components and then we use notations to reference the components,
  so we don’t make use of the findViewById(int id) method anymore. The code Will look something like this.


public class MainActivity extends AppCompatActivity{
	TextView textView_1, textView_2, .....;
	EditText editText_1, editText_2, .....;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this); // this line of code is much more effcient than using findViewById

	}
}


------------------------------------------------------------- Gradle --------------------------------------------------




Gradle - a place where the libraries live and it dictate access the 3rd party libraries into our code

when we inout code in our gradle file we need to go back to our activity and retype the input code, just one letter is fine 
now our app will know where did the inputed code came from 




--------------------------------------------------- Compile vs Implementation ------------------------------------------




Gradle,
 as Android Studio,
 is always making changes, 
 compile time has always been a big problem,
  with larger projects the compile time can become really long,
   the more libraries you include in a project the bigger the compile time becomes.

In Gradle 3.4+ there was a change in the way libraries are compiled.
When you add a library using compile in a project,
 you also add any internal libraries that the library you’re adding depends on,
  this can have potentially unwanted effects,
   the first one being that the project re-compiles every library on every build,
    this can get really bad if there are too many dependencies.

On the new Gradle version compile has become deprecated,
 this means it has been replaced and no longer supported,
  projects using compile still work and can run and be used,
   however the keyword is no longer supported so it’s advised to use one of the newer ones.

First the api keyword,
 it works the exact same way that compile did,
  it imports all the libraries and comíles them every time.

But the important change is the implementation keyword, 
it is the version that should be used on most occasions, 
implementation has the function of compiling only the selected library,
 meaning there is no leaking the library’s dependencies, 
 this also means there is no exposing the library functionality to the App. 
 The biggest gain for most developers is, however, the faster compile time.

In short, using implementation is recommended for most projects, 
however using api is also available for those projects that need the full library access.

This is a highlight of how the new changes work, here are some resources of the new changes


Android Migrating Guide to Gradle 3.0.0
https://developer.android.com/studio/build/gradle-plugin-3-0-0-migration#new_configurations

Gradle’s Java Library Plugin
https://docs.gradle.org/current/userguide/java_library_plugin.html#sec:java_library_configurations_graph

A simple but very good explanation in StackOverflow
https://docs.gradle.org/current/userguide/java_library_plugin.html#sec:java_library_configurations_graph

























































































































































































































































































































































