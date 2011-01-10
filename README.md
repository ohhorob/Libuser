# Libuser for Android


This projects aims to illustrate a way of using a referenced Android Library Project while developing in IntelliJ IDEA CE.

The action bar widget is an [Library Project](http://developer.android.com/guide/developing/eclipse-adt.html#libraryProject). This means that there's no need to copy-paste resources into your own project, simply add the action bar widget as a reference to your existing project.

## Usage

Because this project uses a Library project hosted in a GitHub repository, before attempting to build this project, the submodule must be initialised and updated:

Clone the repository, and checkout the ActionBar submodule:

    $ git submodule init
    Submodule 'android-actionbar' (https://github.com/johannilsson/android-actionbar.git) registered for path 'android-actionbar'
    $ git submodule update
    Cloning into android-actionbar...
    remote: **progress description**
    Submodule path 'android-actionbar': checked out '**hash-id**'

To assist with IntelliJ IDEA recognising the `R` generated files, use `ant` to compile the classes and that will merge and then generate the `R` java files required for the IDE code highlighting.

    $ ant compile

You should now be ready to open the project in IntelliJ IDEA CE and use the Run command to build, install and run the main project on a target device (emulator or physical device).