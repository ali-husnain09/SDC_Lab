# SDC Lab — Java Development Workspace

## Overview

This workspace contains the SDC (Software Development Concepts) lab assignments implemented in Java. The repository is organized so each lab can have its compiled binaries, libraries, and source code separated for easy compilation and execution.

This README documents the folder structure, how to get started, how to compile and run the lab programs, and notes about the key source files included in Lab_1.

## Repository structure

- `Lab_1/`
  - `bin/` — Compiled class files (output of `javac`). The tree under `bin/com/myapp/labs/` mirrors the Java package structure.
  - `lib/` — External libraries (JARs) required by the lab (if any). Add any third-party jars here and include them on the classpath when running.
  - `src/` — Java source files for Lab 1. The package structure under `src/com/myapp/labs/` contains the main lab programs.

- `README.md` — This file.

## Files of interest (Lab_1/src)

The `src` folder contains these Java source files (present in this workspace):

- `App.java` — A top-level launcher or example main class (root of `src`).
- `com/myapp/labs/BankApp.java` — Bank application exercise.
- `com/myapp/labs/DistanceCalculator.java` — Utility for computing distances.
- `com/myapp/labs/GradeCalulator.java` — Grade calculator (note: filename matches the source; check spelling).
- `com/myapp/labs/launcher.java` — Launcher for lab utilities.

## Getting started (Windows)

Prerequisites

- Java JDK 11 or later installed and `java`/`javac` available on `PATH`.

Quick compile & run (command line)

1. Open Command Prompt and change directory to the workspace root, for example:

```powershell
cd "C:\Users\H-ali\Desktop\SDC_Lab"
```

2. Compile sources to the `bin` directory (create `bin` if missing):

```powershell
mkdir -Force Lab_1\bin
javac -d Lab_1\bin Lab_1\src\**\*.java
```

3. Run a class with a `main` method. Replace the fully-qualified class name below with the one you want to run (for example, `com.myapp.labs.launcher`):

```powershell
java -cp Lab_1\bin com.myapp.labs.launcher
```

## Notes on compilation

- If your Java package declarations match the folder structure under `src`, compiling with `-d Lab_1\bin` will place class files into the mirrored package folders under `Lab_1/bin`.
- If third-party libraries exist, add them to the classpath during compile and run, for example:

```powershell
javac -cp "Lab_1\lib\some-lib.jar" -d Lab_1\bin Lab_1\src\com\myapp\labs\*.java
java -cp "Lab_1\bin;Lab_1\lib\some-lib.jar" com.myapp.labs.BankApp
```

## Project conventions & tips

- Keep compiled output in `Lab_1/bin` and avoid checking class files into version control.
- Put JAR dependencies in `Lab_1/lib` and reference them via the `-cp` option.
- Keep package declarations at the top of each `.java` file consistent with the `src` subfolder path (e.g., `package com.myapp.labs;`).
- If you rename `GradeCalulator.java`, consider correcting the spelling to `GradeCalculator.java` both in filename and class name to avoid confusion.

## Suggested next steps

- Inspect the source files in `Lab_1/src` to find the `main` entry points and any TODO comments to implement lab tasks.
- Run `javac` and `java` as shown above to verify source files compile and run.
- If you want, I can add a simple PowerShell or batch script (`build.bat` / `build.ps1`) to automate compile/run steps.

## Contact / Help

If you'd like, I can:

- Add automated build scripts (`build.bat`, `run.bat`) for Windows.
- Fix typos in file/class names or update package declarations.
- Create a sample `launch.json` for debugging in VS Code.

Tell me which of the above you'd like next.
