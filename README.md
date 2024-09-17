# School Management Application Integration

## Overview

The goal is to develop a unified school management application that integrates various school systems, such as attendance tracking, grading, and library management. Each system has different interfaces and methods, so adapters are used to ensure compatibility and seamless integration.

## Adaptee Objects

### AttendanceSystem

- **Description**: Represents an attendance tracking system.
- **Method**: `markAttendance()`
  
### GradingSystem

- **Description**: Represents a grading system.
- **Method**: `recordGrades()`

### LibrarySystem

- **Description**: Represents a library management system.
- **Method**: `manageBooks()`

## Target Object

### SchoolManagementApp

- **Description**: Represents the unified school management application.
- **Method**: `integrateSystem()`
  
  This method is used to integrate different systems into the unified application.


