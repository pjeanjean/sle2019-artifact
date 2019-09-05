### Main modifications

We would like to thank the reviewers for their valuable feedback.

This artifact now includes an automated build for a VM that provides all the requirements.
This should fix the issue reviewer #5A had when trying to install version 9 of the JDK, and also ensure that the Xtext fix is properly installed (since reviewer #5B had a different installation directory).
An emphasis was added on the required JDK version.

The accessibility of the DSL Shell has been improved to be more understandable, taking into consideration the reason why reviewer #5B couldn't input any text.
The error messages about `org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui` were addressed in known issues.


### Reviewer #5A

Support of Java 9 was dropped by Oracle, but the Oracle JDK9 is still available for download on Oracle's website and should be for a long while (if it ever stops being distributed, OpenJDK9 would be a valid alternative).
The instructions we provided had a link to download it.

This artifact relies on the GEMOC Studio, that requires XText version `1.14` right now.
Java 11 support was only added to XText `1.17`, and as such the errors you encountered are understandable.
We should have put more emphasis on the reasons we asked for a specific version of Java beforehand, we took your feedback into account to improve on this.

In order to test this artifact in an environment providing the expected version of Java, you can use the virtual machine we now provide.


### Reviewer #5B

Thank you for reporting the broken link and the incomplete instructions for OSX, these are now fixed.

The errors you reported about `org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui` are unrelated to the artifact.
They concern a plugin added in recent versions of the Studio, and will be investigated more thoroughly (again, thank you for your feedback).

The fact that you were not able to input any command is most likely because the UI was not clear enough.
You were not supposed to type commands in the upper part of the window, but in a small textbox on the botom that was hard to spot with Eclipse's default theme.
This part is now improved and should make a lot more sense.


### Reviewer #5C

From the two issues that you encountered (missing EOF on line 96 and missing options in menu), we concluded that the plug-ins were not properly installed on your Studio.
The missing EOF happens because the version of ALE installed on the current version of the GEMOC Studio does not support `else if` keywords, but the version we provide in the plug-ins does.

It is hard to pinpoint exactly what went wrong during your installation.
We were not able to reproduce a failure during the installation of plug-ins on a clean GEMOC Studio.
In case the issue comes from the environment that you used, could you please try again on the VM we now provide?
