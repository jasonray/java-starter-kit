Overview
========
I often find myself struggling, after not working with java for many moons, on how to start a simple project.  I am so spoiled after working with node.js for so long :)

To use this, start by cloning this project to your machine.

Note on gradle
==============
The build scripts are built around gradle.  You can install gradle or use the provided version (gradle wrapper).  

To install using [brew](http://mxcl.github.com/homebrew/), run `brew install gradle`.

To install manually, goto [gradle](http://www.gradle.org/downloads).

To use the provided version, instead of running `gradle`, run `./gradlew`

Opening in Eclipse
==================
If you use Eclipse, the gradle scripts are nice enough to create your project and classpath files.

The first time you open the project, first create the eclipse project files:

```
gradle eclipse
```

Now you can import the project into eclipse.

If you change dependencies, update the classpath:

```
gradle cleanEclipseClasspath eclipseClasspath
```

Opening in Idea
===============
To use Idea with this project, do one of the following

Option 1
--------
Opening Idea, start new project, and import using the `build.gradle` file

Option 2
--------
Run the following command to setup the idea project

```
gradle cleanIdea idea
```


TODO: fix the `run` part of this
How to Run, Method 1
====================

Compile
-------
To compile:
```
gradle fatjar
```

Run
---
```
java -cp build/libs/jar-starterkit.jar jayray.net.hello.HelloWorld
```

How to Run, Method 2
====================

Compile
-------
To compile:
```
gradle installApp
```

Run
---
```
build/install/jar-starterkit/bin/jar-starterkit
```
