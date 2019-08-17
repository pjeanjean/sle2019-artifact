# From DSL specification to interactive computer programming environment

Pierre Jeanjean, Benoit Combemale and Olivier Barais

## Development note

The main repository used to develop this artifact is currently available at https://github.com/pjeanjean/ale-repl.

## Introduction

This artifact contains the necessary Eclipse plugins to generate and execute REPLs from more traditional DSL specifications.

It was made to be run on top of the GEMOC Studio, a customized Eclipse platform that includes technologies to develop, maintain and use executable modeling languages.
The GEMOC Studio includes, among others, support and integration for DSL specifications, and an execution engine to execute languages with semantics written in ALE (Action Language for EMF).

The current artifact also includes the specifications of two languages that were introduced in the evaluation of the submitted paper: `Logo` and `MiniJava`.

## Requirements

Even though this artifact should work on any platform supported by the GEMOC Studio, this was not tested extensively and, as such, we recommend to use a 64-bits Linux distribution.

Other requirements are:
- [Oracle JDK 9](https://www.oracle.com/technetwork/java/javase/downloads/java-archive-javase9-3934878.html)
- [GEMOC Studio 3.1.0](http://gemoc.org/studio_releases/eclipse_package/updatesite/2019/07/29/V3.1.0.html)

## Instructions

### Installing Xtext fix

This artifact generates `.xtext` files.
However, current versions of Xtext have an ongoing issue (documented [here](https://github.com/eclipse/xtext-core/issues/1093)) that prevents a proper serialization of these files.
As such, it is necessary to use the fix available [here](https://github.com/pjeanjean/xtext-core/tree/2.14-fix).
The easiest way to install it is to copy the files available in [xtext-fix](./xtext-fix) and paste them in the Gemoc installation directory to overwrite the plugins pre-installed in version 3.1.0 of the GEMOC Studio.

### Installing the artifact

Launch GEMOC with the required Java version, then go into the menu `Help -> Install new Software...`.
Click on `Add...`, then `Local...` and select the [update-site](./update-site) folder, then `Add` again.
Untick the `Group items by category` option and select both the `ALE` and `ALE-REPL` entries.
Finally, follow the installation steps and restart the GEMOC Studio.

The update for the ALE plugin is necessary because the artifact requires at least version `1.0.0.201908141537`, still unavailable on the official update site at the time of writing.

### Generating a REPL

This artifact includes two of the DSLs introduced in the evaluation section of the paper: `Logo` and `MiniJava`.

#### Language import

To import an existing language inside the GEMOC Studio, open the `File` menu, then `Import -> Existing Projects into Workspace`.
Click on `Browse...` and select either [languages/logo](./languages/logo) or [languages/minijava](./languages/minijava), then finally click on `Finish`.

#### Generate V2R

As introduced in the section `Technical Details and Implementation > DSL Specification Enhancement` of the paper, we defined a DSL dedicated to the specification of the metadata necessary to create a REPL from a DSL.
An instance can be generated from the annotations we specified in the semantics of the two provided languages, namely `@init` and the multiple `@repl__...` annotations.
You can find these semantics in either `fr.inria.diverse.logo.model/model/logo.ale` or `org.tetrabox.minijava.lang/minijava_exec.ale`.
In order to generate a V2R model for these lnguages, you need to right click on the `.dsl` definition of these languages (here, they are right next to the semantics definition files and have the same name, except for the extension) and click on `Generate V2R`.

The generated file, available right next to the DSL file, has three distinct parts:
- Import of the abstract syntax (used for cross references)
- Definition of the REPL entrypoints, with optional help messages, semantics operation and expected output
- Specification of the instruction interpreter runtime data and initialization

The obtained V2R files can be edited to better describe the expected REPL.

For more details about this part, you can refer to section `4.1` of the paper.

#### Generate REPL

Having a V2R file for a language, you can right click it and select the `Generate REPL` option.
A dialogue will open, asking you to select the concrete syntax associated to this DSL.
Select either `Logo.xtext` or `MiniJava.xtext` depending on the language you are currently testing.

The REPL generation might take a while, you can check it is done when the task `REPL Generation` disappears from the status bar on the bottom.

You should now have five new projects in your workspace:
- *languagename*\_repl.model
- *languagename*\_repl.xtext
- *languagename*\_repl.xtext.ide
- *languagename*\_repl.xtext.ui
- *languagename*\_repl.xtext.server

The most relevant generated files are:
- *languagename*\_repl.xtext/model/generated/*language*.ecore (abstract syntax extension, section `4.2`)
- *languagename*\_repl.xtext/src/*languagename*\_repl/xtext/*language*.xtext (textual concrete syntax extension, section `4.3`)
- *languagename*\_repl.xtext/model/generated/*language*.ale (semantics extension, section `4.4`)

#### Running a shell

In order to run a shell for a generated REPL, you first need to start a modeling workbench.
To do that, go into the menu `Run -> Run Configurations...`.
Right click on `Eclipse Configuration` on the left panel and select `New Configuration`.
Check that the `Product to Run` is set to `org.eclipse.gemoc.gemoc_studio.branding.gemoc_studio`, and change it if it is not.
Then click on `Run`.

In the new GEMOC Studio, use the `Quick Acces` text box on the top-right side of the interface to find the `DSL Shell` component and open it.

This component is the one shown on Figure 11 of the paper.
You need to specify a port available on your machine (any will do, you can use `22222` for example) if you want autocompletion through a LSP server, then you can chose a REPL from the `Languages` menu.

After that, the component might take up to 10 seconds to finish loading and let you enter text at the bottom.

Using `Return` key will commit the typed instruction, `Tab` key will autocomplete keywords, and `Up` and `Down` arrows let you circle through the commands history.

Here are some small scenarii that you could try:

With `Logo_repl`:
- pendown
- help forward
- help right
- to square :c repeat 4 [ forward :c right 90 ] end
- square 100
- 7\*8

With `MiniJava_repl`:
- public class ClassA { public int[] array; }
- ClassA a
- a.array = new int[5]
- a.array[2] = 42
- a.array
