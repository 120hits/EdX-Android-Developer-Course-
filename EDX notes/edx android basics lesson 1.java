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
